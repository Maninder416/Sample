package io.reactivestax.enumproject;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

    public class CountryCurrencyCodeTest {
        @Test
        public void testGetCurrencyCodeByCountryCode() {
            CountryCurrencyCode countryCurrencyCode =
                    CountryCurrencyCode.getCurrencyCodeByCountryCode("CA");
            assertNotNull("countryCurrencyCode shouldn't be null",countryCurrencyCode);
            assertEquals(countryCurrencyCode.getCurrencyCode(),"CAD");
        }
        @Test
        public void testGetCountryCodeByCurrencyCode() {
            CountryCurrencyCode countryCurrencyCode =
                    CountryCurrencyCode.getCountryCodeByCurrencyCode("CAD");
            assertNotNull("countryCurrencyCode shouldn't be null",countryCurrencyCode);
            assertEquals(countryCurrencyCode.getCountryCode(),"CA");
        }
    }

