package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("My unit converter app.");
        System.out.print("Enter miles to be converted into km: ");
        Scanner scanner = new Scanner(System.in);
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
    }

    static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }
}