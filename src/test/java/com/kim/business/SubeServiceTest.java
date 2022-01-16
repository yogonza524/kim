package com.kim.business;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kim.client.response.RechargePointResponse;
import com.kim.domain.GPS;
import com.kim.domain.RechargePoint;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

@ExtendWith(MockitoExtension.class)
class SubeServiceTest {

  @Mock private HttpClient client;
  @Mock private HttpResponse<Object> response;
  @InjectMocks private Sube subeService;

  private String result =
      "{\"type\":\"FeatureCollection\",\"name\":\"prvsube020819\",\"crs\":{\"type\":\"name\",\"properties\":{\"name\":\"urn:ogc:def:crs:OGC:1.3:CRS84\"}},\"features\":[{\"type\":\"Feature\",\"properties\":{\"Entidad\":\"TEST\",\"Tipo de Centro\":\"Sell and Recharge\",\"Ubicación\":\"MOUNTAIN VIEW STREET\",\"Tipo Ubicación\":\"HELM STREET\",\"Dirección\":\"RODHES AVE\",\"Número\":\"123\",\"Barrio\":\"MANHATTAN\",\"Comuna\":\"1\",\"Partido\":\"NEW YOUR CITY PARTY\",\"País\":\"US\",\"Provincia\":\"RI\",\"Localidad\":\"RHODE ISLAND\",\"CP\":\"1234\",\"Latitud\":-14.612343,\"Longitud\":-28.8456},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-28.8456,-14.612343]}}]}";

  @BeforeEach
  public void beforeEach() {
    ReflectionTestUtils.setField(subeService, "client", client);
  }

  @Test
  public void shouldListAllRechargePoints() throws IOException, InterruptedException {

    Mockito.when(client.send(Mockito.any(), Mockito.any())).thenReturn(response);

    Mockito.when(response.body()).thenReturn(result);
    Mockito.when(response.statusCode()).thenReturn(200);

    RechargePointResponse result = subeService.list();

    Assertions.assertNotNull(result);
  }

  @Test
  public void shouldListAllRechargePointsFromCache() throws IOException, InterruptedException {

    ReflectionTestUtils.setField(
        subeService, "cached", new ObjectMapper().readValue(result, RechargePointResponse.class));

    RechargePointResponse result = subeService.list();

    Assertions.assertNotNull(result);
  }

  @Test
  public void shouldFailWhenServiceResponseStatusIsNot200()
      throws IOException, InterruptedException {

    Mockito.when(client.send(Mockito.any(), Mockito.any())).thenReturn(response);

    Mockito.when(response.statusCode()).thenReturn(500);

    Assertions.assertThrows(
        RuntimeException.class,
        () -> {
          subeService.list();
        });

    Mockito.verify(response, Mockito.times(1)).statusCode();
  }

  @Test
  public void shouldPassWhenCacheIsFlushed() {
    subeService.flushCache();
  }

  @Test
  public void shouldPassWhenNearByPointIsCalled() throws IOException, InterruptedException {
    GPS gps = GPS.builder().latitude("10.0").longitude("11.0").build();

    Mockito.when(client.send(Mockito.any(), Mockito.any())).thenReturn(response);

    Mockito.when(response.body()).thenReturn(result);
    Mockito.when(response.statusCode()).thenReturn(200);

    List<RechargePoint> response = subeService.nearbyPoint(gps);

    Assertions.assertNotNull(response);
  }
}
