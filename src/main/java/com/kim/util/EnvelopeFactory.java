package com.kim.util;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class EnvelopeFactory {
  private static final int SOAP_VERSION = 110;

  public SoapSerializationEnvelope create(SoapObject request) {
    SoapSerializationEnvelope result = new SoapSerializationEnvelope(SOAP_VERSION);
    result.dotNet = true;
    result.setOutputSoapObject(request);

    return result;
  }
}
