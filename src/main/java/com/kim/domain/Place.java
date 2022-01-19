package com.kim.domain;

import com.kim.util.Constants;
import java.util.List;
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

  public static Place P_CORRIENTES_CORRIENTES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.CORRIENTES)
        .province(Constants.CORRIENTES)
        .build();
  }

  public static Place P_PARANA_ENTRE_RIOS() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.PARANA)
        .province(Constants.ENTRE_RIOS)
        .build();
  }

  public static Place P_RESISTENCIA_CHACO() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.RESISTENCIA)
        .province(Constants.CHACO)
        .build();
  }

  public static Place P_SANTA_FE_SANTA_FE() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.SANTA_FE)
        .province(Constants.SANTA_FE)
        .build();
  }

  public static Place P_ROSARIO_FE_SANTA_FE() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.ROSARIO)
        .province(Constants.SANTA_FE)
        .build();
  }

  public static Place P_FORMOSA_FORMOSA() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.FORMOSA)
        .province(Constants.FORMOSA)
        .build();
  }

  public static Place P_QUILMES_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.QUILMES)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_PILAR_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.PILAR)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_SAN_LUIS_SAN_LUIS() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.SAN_LUIS)
        .province(Constants.SAN_LUIS)
        .build();
  }

  public static Place P_USHUAIA_TIERRA_DEL_FUEGO() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.USHUAIA)
        .province(Constants.TIERRA_DEL_FUEGO)
        .build();
  }

  public static Place P_CABA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.CABA)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_MORENO_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.MORENO)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_LAS_HERAS_MENDOZA() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.LAS_HERAS)
        .province(Constants.MENDOZA)
        .build();
  }

  public static Place P_MAR_DEL_PLATA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.MAR_DEL_PLATA)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_MUNRO_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.MUNRO)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_CORDOBA_CORDOBA() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.CORDOBA)
        .province(Constants.CORDOBA)
        .build();
  }

  public static Place P_EL_PALOMAR_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.EL_PALOMAR)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_ONCE_DE_SEPTIEMBRE_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.ONCE_DE_SEPTIEMBRE)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_MENDOZA_MENDOZA() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.MENDOZA)
        .province(Constants.MENDOZA)
        .build();
  }

  public static Place P_LA_PLATA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.LA_PLATA)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_REMEDIOS_DE_ESCALADA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.REMEDIOS_DE_ESCALADA)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_TIGRE_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.TIGRE)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_SAN_MARTIN_MENDOZA() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.SAN_MARTIN)
        .province(Constants.MENDOZA)
        .build();
  }

  public static Place P_BERAZATEGUI_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.BERAZATEGUI)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_EL_TALAR_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.EL_TALAR)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_FUNES_SANTA_FE() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.FUNES)
        .province(Constants.SANTA_FE)
        .build();
  }

  public static Place P_SAN_MIGUEL_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.SAN_MIGUEL)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_SERODINO_SANTA_FE() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.SERODINO)
        .province(Constants.SANTA_FE)
        .build();
  }

  public static Place P_POSADAS_MISIONES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.POSADAS)
        .province(Constants.MISIONES)
        .build();
  }

  public static Place P_SAN_JUAN_SAN_JUAN() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.SAN_JUAN)
        .province(Constants.SAN_JUAN)
        .build();
  }

  public static Place P_MERLO_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.MERLO)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_AVELLANEDA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.AVELLANEDA)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_RIVADAVIA_SAN_JUAN() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.RIVADAVIA)
        .province(Constants.SAN_JUAN)
        .build();
  }

  public static Place P_CHIMBAS_SAN_JUAN() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.CHIMBAS)
        .province(Constants.SAN_JUAN)
        .build();
  }

  public static Place P_CIUDADELA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .state(Constants.CIUDADELA)
        .province(Constants.BUENOS_AIRES)
        .build();
  }

  public static List<Place> all() {
    return List.of(
        P_CIUDADELA_BUENOS_AIRES(),
        P_CHIMBAS_SAN_JUAN(),
        P_RIVADAVIA_SAN_JUAN(),
        P_AVELLANEDA_BUENOS_AIRES(),
        P_MERLO_BUENOS_AIRES(),
        P_SAN_JUAN_SAN_JUAN(),
        P_POSADAS_MISIONES(),
        P_SERODINO_SANTA_FE(),
        P_SAN_MIGUEL_BUENOS_AIRES(),
        P_FUNES_SANTA_FE(),
        P_EL_TALAR_BUENOS_AIRES(),
        P_BERAZATEGUI_BUENOS_AIRES(),
        P_SAN_MARTIN_MENDOZA(),
        P_TIGRE_BUENOS_AIRES(),
        P_REMEDIOS_DE_ESCALADA_BUENOS_AIRES(),
        P_LA_PLATA_BUENOS_AIRES(),
        P_MENDOZA_MENDOZA(),
        P_ONCE_DE_SEPTIEMBRE_BUENOS_AIRES(),
        P_EL_PALOMAR_BUENOS_AIRES(),
        P_CORDOBA_CORDOBA(),
        P_MUNRO_BUENOS_AIRES(),
        P_MAR_DEL_PLATA_BUENOS_AIRES(),
        P_LAS_HERAS_MENDOZA(),
        P_MORENO_BUENOS_AIRES(),
        P_CABA_BUENOS_AIRES(),
        P_USHUAIA_TIERRA_DEL_FUEGO(),
        P_SAN_LUIS_SAN_LUIS(),
        P_PILAR_BUENOS_AIRES(),
        P_QUILMES_BUENOS_AIRES(),
        P_FORMOSA_FORMOSA(),
        P_ROSARIO_FE_SANTA_FE(),
        P_SANTA_FE_SANTA_FE(),
        P_RESISTENCIA_CHACO(),
        P_PARANA_ENTRE_RIOS(),
        P_CORRIENTES_CORRIENTES());
  }
}
