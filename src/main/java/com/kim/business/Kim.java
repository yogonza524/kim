package com.kim.business;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kim.client.response.*;
import com.kim.domain.*;
import com.kim.util.Constants;
import com.kim.util.EnvelopeFactory;
import java.io.IOException;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

public class Kim {

  private static final int TIMEOUT = 30000;
  private final ObjectMapper mapper = new ObjectMapper();
  private final EnvelopeFactory envelopeFactory = new EnvelopeFactory();
  private final Credentials credentials;
  private final HttpTransportSE client = new HttpTransportSE(Constants.URL_STOP_MODULE, TIMEOUT);

  public Kim(Credentials credentials) {
    this.credentials = credentials;
  }

  public LinesPerStateResponse linesBy(Place place) throws XmlPullParserException, IOException {
    SoapObject request = new SoapObject(Constants.NAMESPACE_SOAP, Constants.LINES_PER_STATES);
    request.addProperty("usuario", credentials.getUsername());
    request.addProperty("clave", credentials.getPassword());
    request.addProperty("localidad", place.getState());
    request.addProperty("provincia", place.getProvince());

    request.addProperty("pais", place.getCountry());
    request.addProperty("isSublinea", false);

    SoapSerializationEnvelope envelope = envelopeFactory.create(request);

    this.client.call(Constants.URL_LINES_PER_STATE, envelope);

    return mapper.readValue(envelope.getResponse().toString(), LinesPerStateResponse.class);
  }

  public StreetsPerLineResponse streetsByLine(Line line)
      throws XmlPullParserException, IOException {
    SoapObject request = new SoapObject(Constants.NAMESPACE_SOAP, Constants.STREETS_PER_LINE);
    request.addProperty("usuario", credentials.getUsername());
    request.addProperty("clave", credentials.getPassword());
    request.addProperty("codigoLineaParada", line.getCode());

    SoapSerializationEnvelope envelope = envelopeFactory.create(request);

    this.client.call(Constants.URL_STREETS_PER_LINE, envelope);

    return mapper.readValue(envelope.getResponse().toString(), StreetsPerLineResponse.class);
  }

  public StreetsPerLineResponse intersectionPerLineAndStreet(Line line, Street street)
      throws XmlPullParserException, IOException {
    SoapObject request =
        new SoapObject(Constants.NAMESPACE_SOAP, Constants.INTERSECTION_PER_LINE_AND_STREET);
    request.addProperty("usuario", credentials.getUsername());
    request.addProperty("clave", credentials.getPassword());
    request.addProperty("codigoLineaParada", line.getCode());
    request.addProperty("codigoCalle", street.getCode());

    SoapSerializationEnvelope envelope = envelopeFactory.create(request);

    this.client.call(Constants.URL_INTERSECTION_PER_LINE_AND_STREET, envelope);

    return mapper.readValue(envelope.getResponse().toString(), StreetsPerLineResponse.class);
  }

  public StopPerLineAndStreetAndIntersectionResponse stopByLineAndStreetAndIntersection(
      Line line, Street street, Street intersection) throws XmlPullParserException, IOException {
    SoapObject request =
        new SoapObject(
            Constants.NAMESPACE_SOAP, Constants.STOP_PER_LINE_AND_STREET_AND_INTERSECTION);
    request.addProperty("usuario", credentials.getUsername());
    request.addProperty("clave", credentials.getPassword());
    request.addProperty("codigoLinea", line.getCode());
    request.addProperty("codigoCalle", Integer.valueOf(street.getCode()));
    request.addProperty("codigoInterseccion", Integer.valueOf(intersection.getCode()));

    SoapSerializationEnvelope envelope = envelopeFactory.create(request);

    this.client.call(Constants.URL_STOP_PER_LINE_AND_STREET_AND_INTERSECTION, envelope);

    return mapper.readValue(
        envelope.getResponse().toString(), StopPerLineAndStreetAndIntersectionResponse.class);
  }

  public ArrivalResponse nextArrivals(Stop stop, Line line, Place place)
      throws XmlPullParserException, IOException {
    SoapObject request = new SoapObject(Constants.NAMESPACE_SOAP, Constants.NEXT_ARRIVALS);
    request.addProperty("usuario", credentials.getUsername());
    request.addProperty("clave", credentials.getPassword());
    request.addProperty("identificadorParada", stop.getId());
    request.addProperty("codigoLineaParada", line.getCode());
    request.addProperty("codigoAplicacion", Constants.APPLICATION_CODE);
    request.addProperty("localidad", place.getState());

    SoapSerializationEnvelope envelope = envelopeFactory.create(request);

    this.client.call(Constants.URL_NEXT_ARRIVALS, envelope);

    return mapper.readValue(envelope.getResponse().toString(), ArrivalResponse.class);
  }

  public RoutesResponse routes(Line line) throws XmlPullParserException, IOException {
    SoapObject request = new SoapObject(Constants.NAMESPACE_SOAP, Constants.ROUTES_PER_LINE);
    request.addProperty("usuario", credentials.getUsername());
    request.addProperty("clave", credentials.getPassword());
    request.addProperty("codigoLineaParada", line.getCode());

    SoapSerializationEnvelope envelope = envelopeFactory.create(request);

    this.client.call(Constants.URL_ROUTES_PER_LINE, envelope);

    return mapper.readValue(envelope.getResponse().toString(), RoutesResponse.class);
  }

  public StopPerLineAndStreetAndIntersectionResponse nearbyStops(GPS position, Place place)
      throws XmlPullParserException, IOException {
    SoapObject request = new SoapObject(Constants.NAMESPACE_SOAP, Constants.NEARBY_STOPS_PER_PLACE);
    request.addProperty("usuario", credentials.getUsername());
    request.addProperty("clave", credentials.getPassword());
    request.addProperty("latitud", position.getLatitude());
    request.addProperty("longitud", position.getLongitude());
    request.addProperty("listaCodigosEmpresa", Constants.COMPANIES_CODE);
    request.addProperty("descripcionProvincia", place.getProvince());
    request.addProperty("descripcionPais", place.getCountry());

    SoapSerializationEnvelope envelope = envelopeFactory.create(request);

    this.client.call(Constants.URL_NEARBY_STOPS_PER_PLACE, envelope);

    return mapper.readValue(
        envelope.getResponse().toString(), StopPerLineAndStreetAndIntersectionResponse.class);
  }
}
