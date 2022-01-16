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
public class Stop {

  @JsonProperty("Codigo")
  private String code;

  @JsonProperty("Identificador")
  private String id;

  @JsonProperty("Descripcion")
  private String desc;

  @JsonProperty("CallePrincipal")
  private String principalStreet;

  @JsonProperty("CalleInterseccion")
  private String intersection;

  @JsonProperty("Latitud")
  private Object latitude;

  @JsonProperty("Longitud")
  private Object longitude;

  @JsonProperty("Lineas")
  private String lines;
}
