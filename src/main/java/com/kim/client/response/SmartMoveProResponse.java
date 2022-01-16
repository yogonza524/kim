package com.kim.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmartMoveProResponse {
  @JsonProperty("CodigoEstado")
  protected int code;

  @JsonProperty("MensajeEstado")
  protected String message;
}
