package com.kim.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kim.domain.Line;
import java.util.List;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class LinesPerStateResponse extends SmartMoveProResponse {
  @JsonProperty("lineas")
  private List<Line> lines;
}
