package Lab5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Commission {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("£0,000.00");

        final int MAX = 10;
        int[] sales = new int[MAX];
        int total = 0;
        double commission;

        //Read in and store values of sales
        for (int index = 0; index < MAX; index++) {
            System.out.print("Enter sales of Salesman with ID-" + (index + 10) + ": ");
            sales[index] = keyboard.nextInt();
        }//for

        //Calculate commission level
        for (int index = 0; index < MAX; index++) {
            total = total + sales[index];
        }//for
        commission = (double) ((total / MAX) * 2 / 3);

        //Print out the results
        System.out.println("\nThe following Salesmen qualify for Commission");
        System.out.println("Reference No\t\tAmount");
        for (int index = 0; index < MAX; index++) {
            if (sales[index] > commission) {
                System.out.println("\tID-" + (index + 10) + "\t\t\t" + df.format((sales[index]
                        - commission)));
            }//if
        }//for
    }
}