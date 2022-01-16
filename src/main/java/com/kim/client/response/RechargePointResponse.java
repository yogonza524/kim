package com.kim.client.response;

import com.kim.domain.RechargePoint;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RechargePointResponse {
  private String type;
  private String name;
  private Object crs;
  private List<RechargePoint> features;
}
