package Lab6;

import java.util.Scanner;

/**
 * Created by:
 * Binary search
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] myArray = {23, 27, 32, 45, 56, 57, 60, 67};

        final int SIZE = 8;
        int bottom = 0, top = SIZE - 1, middle, location = 0;
        boolean found = false;

        for (int index = 0; index < SIZE; index++) {
            System.out.print( "\t" + myArray[index]);
        }

        System.out.print("\n\t" + "Enter search value: ");
        int search = keyboard.nextInt();


        do {
            middle = (top + bottom) / 2;
            if (myArray[middle] == search) {
                found = true;
                location = middle;
            } else if (myArray[middle] < search) {
                bottom = middle + 1;
            } else {
                top = middle - 1;
            }
        }

        while (!(found) && (bottom <= top));
        if (found) {
            System.out.println("\tNumber found at index position " +
                    location);
        } else
            System.out.println("\t" + search + " has not been found");
    }//main
}//class

