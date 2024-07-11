import java.util.Scanner;

public class Temp {

    static void Cal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double Fahrenhit = (celsius * (9.0 / 5)) + 32;
        System.out.println("Temperature in Fahrenheit: " + Fahrenhit);
    }

    static void fah() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double Fahrenhit = sc.nextDouble();
        double celsius = (5.0 / 9) * (Fahrenhit - 32);
        System.out.println("Temperature in Celsius: " + celsius);
    }

    public static void main(String args[]) {
        System.out.println("If you want to convert Celsius to Fahrenheit then press 1");
        System.out.println("If you want to convert Fahrenheit to Celsius then press 2");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            Cal();
        } else if (n == 2) {
            fah();
        } else {
            System.out.println("Invalid input");
        }
    }
}