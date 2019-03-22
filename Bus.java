package Lab6;

import java.util.Scanner;

/**
 * Created by:
 * Created on:
 * Program to read in and store details of 5 buses, then search for
 * and print out the details of a particular bus
 */

public class Bus {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int SIZE = 5;
        final int REQUIREDBUS = 301;
        boolean found = false;
        int position = 0;
        int[] id = new int[SIZE];
        String[] make = new String[SIZE];
        int[] capacity = new int[SIZE];

        for (int index = 0; index < SIZE; index++) {
            System.out.print("Bus " + (index + 1) + " id : ");
            id[index] = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Bus " + (index + 1) + " make : ");
            make[index] = keyboard.nextLine();
            System.out.print("Bus " + (index + 1) + " capacity : ");
            capacity[index] = keyboard.nextInt();
            keyboard.nextLine();
        }//for

        System.out.println("ID\tMake\t\tCapacity");
        for (int index = 0; index < SIZE; index++) {
            System.out.println(id[index] + "\t" + make[index] + "\t" + capacity[index]);
        }//for

        while ((!found) && (position < SIZE)) {
            if (REQUIREDBUS == id[position]) {
                found = true;
            }//if
            else {
                position++;
            }//if
        }//while

        if (found) {
            System.out.println("ID\tMake\t\tCapacity");
            System.out.println(id[position] + "\t" +
                    make[position] + "\t" + capacity[position]);
        }//if
        else {
            System.out.println("Bus " + REQUIREDBUS + " not found");
        }//else

    }//main
}//class
