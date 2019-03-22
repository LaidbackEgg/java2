package Lab5;

import java.util.Scanner;

public class CountNumbersInArray {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] height = {78, 67, 66, 60, 73, 70, 75, 67};
        int search, total = 0;

        System.out.print("Enter search number: ");
        search = keyboard.nextInt();

        for(int index = 0; index < height.length; index++) {
            if (height[index] == search) {
                total = total + 1;
            }//if
        }//for

        System.out.println(search + " occurs " + total + " time(s).");

    }//main
}//class
