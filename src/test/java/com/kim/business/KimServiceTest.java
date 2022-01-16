package com.kim.business;

import com.kim.client.response.*;
import com.kim.domain.*;
import com.kim.util.Constants;
import com.kim.util.EnvelopeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

@ExtendWith(MockitoExtension.class)
class KimServiceTest {

    @Mock private Place place;
    @Mock private Credentials credentials;
    @Mock private HttpTransportSE client;
    @Mock private EnvelopeFactory envelopeFactory;
    @Mock private SoapSerializationEnvelope envelope;

    @InjectMocks private KimService kimService;

    @Test
    public void shouldListAllLinesPerState() throws IOException, XmlPullParserException {

        Mockito.when(place.getCountry()).thenReturn(Constants.ARG);
        Mockito.when(place.getProvince()).thenReturn(Constants.CORRIENTES);
        Mockito.when(place.getState()).thenReturn(Constants.CORRIENTES);

        String response = "{\"CodigoEstado\":0,\"MensajeEstado\":\"ok\",\"lineas\":[{\"CodigoLineaParada\":\"1\",\"Descripcion\":\"100A\",\"CodigoEntidad\":\"123\",\"CodigoEmpresa\":741}]}";

        ReflectionTestUtils.setField(kimService, "client", client);
        ReflectionTestUtils.setField(kimService, "envelopeFactory", envelopeFactory);

        Mockito.when(envelopeFactory.create(Mockito.any())).thenReturn(envelope);
        Mockito.when(envelope.getResponse()).thenReturn(response);

        LinesPerStateResponse r = kimService.linesBy(place);

        Assertions.assertNotNull(r);
        Assertions.assertEquals(0, r.getCode());
        Assertions.assertEquals("ok", r.getMessage());
        Assertions.assertEquals(1, r.getLines().size());

        Mockito.verify(envelopeFactory, Mockito.times(1)).create(Mockito.any());
        Mockito.verify(client, Mockito.times(1)).call(Mockito.anyString(), Mockito.any());
    }

    @Test
    public void shouldListStreetsForLine() throws IOException, XmlPullParserException {

        StreetsPerLineResponse r = kimService.streetsByLine(Line.builder().code(123).build());

        Assertions.assertNotNull(r);
    }

    @Test
    public void shouldListStopPerLine() throws IOException, XmlPullParserException {

        StopPerLineAndStreetAndIntersectionResponse r = kimService.stopByLineAndStreetAndIntersection(
                Line.builder().code(123).build(),
                Street.builder().code("1").build(),
                Street.builder().code("2").build()
                );

        Assertions.assertNotNull(r);
    }

    @Test
    public void shouldListIntersectionsPerLineAndStreet() throws IOException, XmlPullParserException {

        StreetsPerLineResponse r = kimService.intersectionPerLineAndStreet(
                Line.builder().code(123).build(),
                Street.builder().code("1").build()
        );

        Assertions.assertNotNull(r);
    }

    @Test
    public void shouldListArrivals() throws IOException, XmlPullParserException {

        ArrivalResponse r = kimService.nextArrivals(
                Stop.builder().id("test").build(),
                Line.builder().code(1).build(),
                Place.CORRIENTES()
        );

        Assertions.assertNotNull(r);
    }

    @Test
    public void shouldListRoutesByLine() throws IOException, XmlPullParserException {

        RoutesResponse r = kimService.routes(
                Line.builder().code(1).build()
        );

        Assertions.assertNotNull(r);
    }

    @Test
    public void shouldListNearbyStops() throws IOException, XmlPullParserException {

        StopPerLineAndStreetAndIntersectionResponse r = kimService.nearbyStops(
                GPS.builder().longitude("10.0").latitude("11.0").build(),
                Place.CORRIENTES()
        );

        Assertions.assertNotNull(r);
    }
}