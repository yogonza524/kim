package com.kim.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Point {
  @JsonProperty("Descripcion")
  private String des;

  @JsonProperty("AbreviaturaBanderaSMP")
  private String abbreviationFlagSMP;

  @JsonProperty("AbreviaturaLineaSMP")
  private String abbreviationLineSMP;

  @JsonProperty("IsPuntoPaso")
  private Boolean isPassPoint;

  @JsonProperty("Latitud")
  private Double latitude;

  @JsonProperty("Longitud")
  private Double longitude;
}
