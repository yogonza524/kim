package com.kim.domain;

import com.kim.util.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Place {
  private String country;
  private String province;
  private String state;

  public static Place CORRIENTES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.CORRIENTES)
        .state(Constants.CORRIENTES)
        .build();
  }
}
