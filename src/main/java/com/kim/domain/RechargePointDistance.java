package com.kim.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RechargePointDistance {
  private Double distance;
  private RechargePoint rechargePoint;
}
