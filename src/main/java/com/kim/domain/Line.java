package com.kim.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Line {
  @JsonProperty("CodigoLineaParada")
  private int code;

  @JsonProperty("Descripcion")
  private String desc;

  @JsonProperty("CodigoEntidad")
  private String entityCode;

  @JsonProperty("CodigoEmpresa")
  private int companyCode;
}
