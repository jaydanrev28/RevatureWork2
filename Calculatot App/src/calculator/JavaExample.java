package calculator;
import emi.calculator.EmiCalculator;
import java.util.Scanner;

public class JavaExample {

    public static void main(String[] args) {


        double num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = scan.nextDouble();
        System.out.print("Enter second number:");
        num2 = scan.nextDouble();

        System.out.println("Please select an option:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. EMI Calculator");
        System.out.println("6. Quit");



        if (scan.hasNextDouble()) ;
        int menuSelection = scan.nextInt();
        //  scan.close();
        double output = 0;
        EmiCalculator calculator = new EmiCalculator();
        calculator.init();
        switch (menuSelection) {

            case 1:
                output = (num1 + num2);
                System.out.println(output);
                break;

            case 2:
                output = (num1 - num2);
                break;

            case 3:
                output = (int) (num1 * num2);
                break;

            case 4:
                output = num1 / num2;
                break;

            case 5:
            EmiCalculator.calculator();
                break;
            case  6:
                System.exit(0);
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }
        System.out.println("Result: " +
                "" + output);


        }

    }


