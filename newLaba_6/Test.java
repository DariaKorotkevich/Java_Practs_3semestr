package Convert_T;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        double degrees = 36;

        DecimalFormat dF = new DecimalFormat( "#.##" );

        Сelsius c = new Сelsius(degrees);


        System.out.println("Fahrenheit " +dF.format(c.convertToFahrenheit()) +" Kelvin "+ dF.format(c.convertToKelvin()) +
                " Celsius " + dF.format(c.convertToCelsius()) );

        degrees = c.convertToFahrenheit();
        Fahrenheit f = new Fahrenheit(degrees);
        System.out.println("Fahrenheit "+dF.format(f.convertToFahrenheit()) +" Kelvin "+ dF.format(f.convertToKelvin()) +
                " " + dF.format(f.convertToCelsius()));

        degrees = f.convertToKelvin();
        Kelvin k = new Kelvin(degrees);
        System.out.println("Fahrenheit "+dF.format(k.convertToFahrenheit()) +" Kelvin "+ dF.format(k.convertToKelvin()) +
                " Celsius " + dF.format(k.convertToCelsius()));
    }
}