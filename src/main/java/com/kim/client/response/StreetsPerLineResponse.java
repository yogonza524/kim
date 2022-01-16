package com.kim.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kim.domain.Street;
import java.util.List;
import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class StreetsPerLineResponse extends SmartMoveProResponse {
  @JsonProperty("calles")
  private List<Street> streets;
}
