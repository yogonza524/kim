package com.kim.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kim.domain.Point;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class RoutesResponse extends SmartMoveProResponse {

  @JsonProperty("puntos")
  private List<Point> points;
}
