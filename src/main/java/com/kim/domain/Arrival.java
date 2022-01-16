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
public class Arrival {

  @JsonProperty("DescripcionLinea")
  private String descLine;

  @JsonProperty("DescripcionBandera")
  private String descFlag;

  @JsonProperty("Arribo")
  private String arrival;

  @JsonProperty("Latitud")
  private String latitude;

  @JsonProperty("Longitud")
  private String longitude;

  @JsonProperty("LatitudParada")
  private String stopLatitud;

  @JsonProperty("LongitudParada")
  private String stopLongitude;

  @JsonProperty("DescripcionCortaBandera")
  private String descCutFlag;

  @JsonProperty("DescripcionCartelBandera")
  private String descBannerFlag;

  @JsonProperty("EsAdaptado")
  private String isAdapted;

  @JsonProperty("IdentificadorCoche")
  private String idCar;

  @JsonProperty("IdentificadorChofer")
  private String idDriver;

  @JsonProperty("DesvioHorario")
  private String detourTime;

  @JsonProperty("UltimaFechaHoraGPS")
  private String lastGPSTime;

  @JsonProperty("MensajeError")
  private String error;

  @JsonProperty("CodigoLineaParada")
  private String lineCode;
}
