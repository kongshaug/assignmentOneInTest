import org.junit.Test;

import static org.junit.Assert.*;

public class KatasTest {

    @org.junit.Test
    public void firstFunctionReturndobbleTest() {
        Katas katas = new Katas();
        int result = katas.firstFunction(3);
        int expected = 6;
        assertEquals(expected,result);
    }

    @org.junit.Test
    public void firstFunctionReturndobble2() {
        Katas katas = new Katas();
        int result = katas.firstFunction(6);
        int expected = 12;
        assertEquals(expected,result);
    }

    @org.junit.Test
    public void fahrenheitToCelciusConverterTest() throws Exception {
        Katas katas = new Katas();
        int result = katas.fahrenheitToCelciusConverter(68);
        int expected = 20;
        assertEquals(expected,result);
    }
    @org.junit.Test
    public void fahrenheitToCelciusConverterTest2() throws Exception {
        Katas katas = new Katas();
        int result = katas.fahrenheitToCelciusConverter(60);
        int expected = 15;
        assertEquals(expected,result);
    }
    @Test(expected = Exception.class)
    public void fahrenheitToCelciusConverterExpectErrorFromValueUnderAbsalutMinimumTest() throws Exception {
        Katas katas = new Katas();
        katas.fahrenheitToCelciusConverter(-500);
    }

    @org.junit.Test
    public void converter() throws Exception {
        Katas katas = new Katas();
        int result = katas.Converter(68, "fahrenheit");
        int expected = 20;
        assertEquals(expected,result);
    }
    @Test(expected = Exception.class)
    public void converterExpectErrorFromValueUnderAbsalutMinimumTest() throws Exception {
        Katas katas = new Katas();
        katas.Converter(-500, "fahrenheit");
    }
    @org.junit.Test
    public void celciusConverterToFahrenheitTest() throws Exception {
        Katas katas = new Katas();
        int result = katas.Converter(20, "celcius");
        int expected = 68;
        assertEquals(expected,result);
    }
    @org.junit.Test
    public void celciusConverterToFahrenheitTest2() throws Exception {
        Katas katas = new Katas();
        int result = katas.Converter(15, "celcius");
        int expected = 59;
        assertEquals(expected,result);
    }

    @org.junit.Test
    public void romanNumeralConverterTest() throws Exception {
        Katas katas = new Katas();
        String result = katas.romanNumeralConverter(2);
        String expected = "II";
        assertEquals(expected,result);
    }

    @org.junit.Test
    public void romanNumeralConverterTest2() throws Exception {
        Katas katas = new Katas();
        String result = katas.romanNumeralConverter(6);
        String expected = "VI";
        assertEquals(expected,result);
    }

    @org.junit.Test
    public void romanNumeralConverterTest3() throws Exception {
        Katas katas = new Katas();
        String result = katas.romanNumeralConverter(3422);
        String expected = "MMMCDXXII";
        assertEquals(expected,result);
    }



}