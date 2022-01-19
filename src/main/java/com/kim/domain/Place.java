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
        .province(Constants.CORRIENTES)
        .state(Constants.CORRIENTES)
        .build();
  }

  public static Place P_PARANA_ENTRE_RIOS() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.PARANA)
        .state(Constants.ENTRE_RIOS)
        .build();
  }

  public static Place P_RESISTENCIA_CHACO() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.RESISTENCIA)
        .state(Constants.CHACO)
        .build();
  }

  public static Place P_SANTA_FE_SANTA_FE() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.SANTA_FE)
        .state(Constants.SANTA_FE)
        .build();
  }

  public static Place P_ROSARIO_FE_SANTA_FE() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.ROSARIO)
        .state(Constants.SANTA_FE)
        .build();
  }

  public static Place P_FORMOSA_FORMOSA() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.FORMOSA)
        .state(Constants.FORMOSA)
        .build();
  }

  public static Place P_QUILMES_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.QUILMES)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_PILAR_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.PILAR)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_SAN_LUIS_SAN_LUIS() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.SAN_LUIS)
        .state(Constants.SAN_LUIS)
        .build();
  }

  public static Place P_USHUAIA_TIERRA_DEL_FUEGO() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.USHUAIA)
        .state(Constants.TIERRA_DEL_FUEGO)
        .build();
  }

  public static Place P_CABA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.CABA)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_MORENO_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.MORENO)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_LAS_HERAS_MENDOZA() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.LAS_HERAS)
        .state(Constants.MENDOZA)
        .build();
  }

  public static Place P_MAR_DEL_PLATA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.MAR_DEL_PLATA)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_MUNRO_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.MUNRO)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_CORDOBA_CORDOBA() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.CORDOBA)
        .state(Constants.CORDOBA)
        .build();
  }

  public static Place P_EL_PALOMAR_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.EL_PALOMAR)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_ONCE_DE_SEPTIEMBRE_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.ONCE_DE_SEPTIEMBRE)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_MENDOZA_MENDOZA() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.MENDOZA)
        .state(Constants.MENDOZA)
        .build();
  }

  public static Place P_LA_PLATA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.LA_PLATA)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_REMEDIOS_DE_ESCALADA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.REMEDIOS_DE_ESCALADA)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_TIGRE_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.TIGRE)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_SAN_MARTIN_MENDOZA() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.SAN_MARTIN)
        .state(Constants.MENDOZA)
        .build();
  }

  public static Place P_BERAZATEGUI_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.BERAZATEGUI)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_EL_TALAR_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.EL_TALAR)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_FUNES_SANTA_FE() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.FUNES)
        .state(Constants.SANTA_FE)
        .build();
  }

  public static Place P_SAN_MIGUEL_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.SAN_MIGUEL)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_SERODINO_SANTA_FE() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.SERODINO)
        .state(Constants.SANTA_FE)
        .build();
  }

  public static Place P_POSADAS_MISIONES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.POSADAS)
        .state(Constants.MISIONES)
        .build();
  }

  public static Place P_SAN_JUAN_SAN_JUAN() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.SAN_JUAN)
        .state(Constants.SAN_JUAN)
        .build();
  }

  public static Place P_MERLO_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.MERLO)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_AVELLANEDA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.AVELLANEDA)
        .state(Constants.BUENOS_AIRES)
        .build();
  }

  public static Place P_RIVADAVIA_SAN_JUAN() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.RIVADAVIA)
        .state(Constants.SAN_JUAN)
        .build();
  }

  public static Place P_CHIMBAS_SAN_JUAN() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.CHIMBAS)
        .state(Constants.SAN_JUAN)
        .build();
  }

  public static Place P_CIUDADELA_BUENOS_AIRES() {
    return Place.builder()
        .country(Constants.ARG)
        .province(Constants.CIUDADELA)
        .state(Constants.BUENOS_AIRES)
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
