package com.kim.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EnvelopeFactoryTest {

    @Mock private SoapObject request;
    @InjectMocks private EnvelopeFactory envelopeFactory;

    @Test
    public void shouldGenerateEnvelope() {
        SoapSerializationEnvelope result = envelopeFactory.create(request);

        Assertions.assertNotNull(result);
        Assertions.assertNotNull(result.bodyOut);
        Assertions.assertEquals(true, result.dotNet);
    }
}