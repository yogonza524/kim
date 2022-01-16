package com.kim.business;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kim.client.response.RechargePointResponse;
import com.kim.domain.GPS;
import com.kim.domain.RechargePoint;
import com.kim.domain.RechargePointDistance;
import com.kim.util.DistanceUtil;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SubeService {
  private final HttpClient client = HttpClient.newBuilder().build();
  private final ObjectMapper mapper = new ObjectMapper();

  private final String URL =
      "https://datos.transporte.gob.ar/dataset/88aee5cb-e0fc-4bde-96e9-6e3d213dc43a/resource/7c90f2ec-af99-4e07-99ae-1ab3e8e1a26d/download/prvsube020819.geojson";

  private RechargePointResponse cached;

  public RechargePointResponse list() throws IOException, InterruptedException {

    if (cached != null) {
      return cached;
    }

    HttpResponse<String> response =
        client.send(
            HttpRequest.newBuilder().uri(URI.create(URL)).GET().build(),
            HttpResponse.BodyHandlers.ofString());

    if (response.statusCode() != 200) {
      throw new RuntimeException("Invalid response");
    }

    this.cached = mapper.readValue(response.body(), RechargePointResponse.class);

    return cached;
  }

  public void flushCache() {
    this.cached = null;
  }

  public List<RechargePoint> nearbyPoint(GPS position) throws IOException, InterruptedException {
    List<RechargePointDistance> withDistance =
        this.list().getFeatures().stream()
            .map(
                p ->
                    new RechargePointDistance(
                            DistanceUtil.distance(
                            Double.valueOf(position.getLatitude()),
                            Double.valueOf(p.getProperties().get("Latitud").toString()),
                            Double.valueOf(position.getLongitude()),
                            Double.valueOf(p.getProperties().get("Longitud").toString()),
                            0,
                            0),
                        p))
            .sorted(Comparator.comparing(RechargePointDistance::getDistance))
            .collect(Collectors.toList());

    return withDistance.stream().map(p -> p.getRechargePoint()).collect(Collectors.toList());
  }
}
