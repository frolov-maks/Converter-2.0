package app;

public class Converter {

    private static final double CONV_KM = 1.60934;

    private static final double CONV_M = 0.621371;

    public static void main (String[] args) {
        System.out.println("Converter app v. 2.0");

        double miles = 10;
        double kilometers = 10;

        double km = convMilesToKm(miles);
        double m = convKmToMiles(kilometers);

        System.out.println("Result is " + km + " kilometers");
        System.out.println("Result is " + m + " miles");
    }

    private static double convMilesToKm(double miles) {
        return miles * CONV_KM;
    }
    private static double convKmToMiles(double kilometers) {
        return kilometers * CONV_M;
    }
}
