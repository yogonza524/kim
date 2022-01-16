package com.kim.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kim.domain.Arrival;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ArrivalResponse extends SmartMoveProResponse {

  @JsonProperty("arribos")
  private List<Arrival> arrivals;
}
