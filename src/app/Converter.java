package app;

public class Converter {

    private static final double CONV_KM = 1.60934;

    public static void converter (String[] args) {
        System.out.println("Converter app v. 2.0");

        double miles = 10;
        double km = convMilesToKm(miles);
        System.out.println("Result is " + km + " kilometers");
    }

    private static double convMilesToKm(double miles) {
        return miles * CONV_KM;
    }
}
