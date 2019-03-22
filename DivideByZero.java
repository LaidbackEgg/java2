package Lab9;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int number, divisor, answer;
        boolean invalid = true;

        do {
            System.out.println("Enter a number: ");
            number = keyboard.nextInt();
            System.out.println("Enter a divisor: ");
            divisor = keyboard.nextInt();
            try {
                answer = number / divisor;
                System.out.println("Answer = " + answer);
                invalid = false;
            }//try
            catch (ArithmeticException error) {
                System.out.println("Error - " + error.getMessage());
            }//catch
        } while (invalid);
    }//main
}//class
