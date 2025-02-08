package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("My unit converter app.");
        System.out.print("Enter miles to be converted into km: ");
        Scanner scanner = new Scanner(System.in);
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.print("Enter km to be converted into miles: ");
        double km = scanner.nextDouble();
        System.out.println(miles + " km = " + convertKmToMiles(km) + " miles");
    }

    static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
}