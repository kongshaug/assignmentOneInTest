import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class Katas {


    public int firstFunction(int num){
        return num * 2;
    }
    public int fahrenheitToCelciusConverter(int fahrenheit) throws Exception {

        if (fahrenheit < -460) throw new Exception("Can't go lower then Absolute zero. (-460 F) ");
        fahrenheit -= 32;
        fahrenheit = fahrenheit * 5;
        fahrenheit = fahrenheit / 9;
        return fahrenheit;
    }

    public int Converter(int temp, String type) throws Exception {
        if (type == "fahrenheit"){
            return fahrenheitToCelciusConverter(temp);
        }
        else if (type == "celcius"){
            return CelciusToFahrenheitConverter(temp);
        }
        throw new Exception("Type has to be 'fahrenheit' or 'celcius'");
    }

    private int CelciusToFahrenheitConverter(int celcius) {
        celcius = celcius * 9;
        celcius = celcius / 5;
        celcius += 32;
        return celcius;
    }


    public String romanNumeralConverter(int num) {

        return join("", nCopies(num, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");

    }


}


