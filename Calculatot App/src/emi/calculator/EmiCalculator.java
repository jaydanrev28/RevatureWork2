package emi.calculator;
import java.lang.Math;
import java.util.Scanner;

public class EmiCalculator {
    public static void calculator() {
    }

    public void init() {





        Scanner scan =  new Scanner(System.in);

        double principal, rate, time, emi;

        System.out.print("Enter principal loan amount: ");
        principal = scan.nextFloat();

        System.out.print("Enter RAte of Interest: ");
        rate = scan.nextFloat();

        System.out.print("Enter Tenure: ");
        time = scan.nextFloat();

        rate = rate / (12 * 100);
        time = time * 12;


        emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);

        System.out.print("EMI" + emi + "\n");
    }

}
