package com.kim.domain;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RechargePoint {
  private String type;
  private Map<String, Object> properties;
  private Geometry geometry;
}
