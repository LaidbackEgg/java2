package Lab5;

import java.util.Scanner;

public class Reverse {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        final int MAX = 6;
        int[] numbers = new int[MAX];

        for (int index = 0; index < MAX; index++) {
            System.out.print("Enter a number: ");
            numbers[index] = keyboard.nextInt();
        }//for

        for (int index = 0; index < MAX; index++) {
            System.out.print(numbers[index] + "\t");
        }//for
        System.out.println(" - normal");

        for (int index = MAX - 1; index >= 0; index--) {
            System.out.print(numbers[index] + "\t");
        }//for
        System.out.println(" - reverse");

    }//main
}//class
