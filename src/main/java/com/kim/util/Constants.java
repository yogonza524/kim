package com.kim.util;

public class Constants {
  public static final String NAMESPACE_SOAP = "http://clsw.smartmovepro.net/";

  // SOAP Methods
  public static final String LINES_PER_STATES = "RecuperarLineaPorLocalidad";

  // Countries
  public static final String ARG = "ARGENTINA";

  // States
  public static final String CORRIENTES = "CORRIENTES";
  public static final String RESISTENCIA = "RESISTENCIA";

  // Provinces
  public static final String CHACO = "CHACO";
  public static final String URL_STOP_MODULE =
      "http://clswcorrientes.smartmovepro.net/ModuloParadas/SWParadas.asmx";
  public static final String URL_LINES_PER_STATE =
      "http://clsw.smartmovepro.net/RecuperarLineaPorLocalidad";
  public static final String STREETS_PER_LINE = "RecuperarCallesPrincipalPorLinea";
  public static final String URL_STREETS_PER_LINE =
      "http://clsw.smartmovepro.net/RecuperarCallesPrincipalPorLinea";
  public static final String INTERSECTION_PER_LINE_AND_STREET =
      "RecuperarInterseccionPorLineaYCalle";
  public static final String URL_INTERSECTION_PER_LINE_AND_STREET =
      "http://clsw.smartmovepro.net/RecuperarInterseccionPorLineaYCalle";
  public static final String STOP_PER_LINE_AND_STREET_AND_INTERSECTION =
      "RecuperarParadasPorLineaCalleEInterseccion";
  public static final String URL_STOP_PER_LINE_AND_STREET_AND_INTERSECTION =
      "http://clsw.smartmovepro.net/RecuperarParadasPorLineaCalleEInterseccion";
  public static final String NEXT_ARRIVALS = "RecuperarProximosArribos";
  public static final String URL_NEXT_ARRIVALS =
      "http://clsw.smartmovepro.net/RecuperarProximosArribos";
  public static final String COMPANIES_CODE = "260";
  public static final String NEARBY_STOPS_PER_PLACE =
      "RecuperarParadasMasCercanasPorLocalidadProvinciaPais";
  public static final String URL_NEARBY_STOPS_PER_PLACE =
      "http://clsw.smartmovepro.net/RecuperarParadasMasCercanasPorLocalidadProvinciaPais";
  public static final String ROUTES_PER_LINE =
      "RecuperarRecorridoParaMapaAbrevYAmpliPorEntidadYLinea";
  public static final String URL_ROUTES_PER_LINE =
      "http://clsw.smartmovepro.net/RecuperarRecorridoParaMapaAbrevYAmpliPorEntidadYLinea";
  public static final int APPLICATION_CODE = 24;
}
