package Convert_T;

public final class Fahrenheit implements Convertable{
    double degrees;
    public Fahrenheit (double degrees){

        this.degrees = degrees;
    }
    @Override
    public double convertToFahrenheit() {

        return degrees;
    }

    @Override
    public double convertToKelvin() {

        return this.convertToCelsius() + 273;
    }

    @Override
    public double convertToCelsius() {

        return (degrees - 32) * 5 / 9;
    }
}