package Lab5;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int MAX = 8;
        int[] myNumbers = new int[MAX];
        int odd = 0, sum = 0;

        for (int index = 0; index < MAX; index++) {
            System.out.print("Enter number " + (index+1) + ": ");
            myNumbers[index] = keyboard.nextInt();
        }//for

        for (int index = 0; index < MAX; index++) {
            if (myNumbers[index] %2 !=0) {
                odd++;
            }//if
            sum = sum + myNumbers[index];
        }//for

        System.out.println("Number of odd: " + odd);
        System.out.println("Number of even: " + (MAX - odd));
        System.out.println("Total sum: " + sum);
        System.out.println("Average: " + ((double) sum/MAX));

    }//main
}//class
