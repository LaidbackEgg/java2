package Lab5;

import java.util.Scanner;

public class FindNumbersInArray2 {

    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int [] numbers = {53, 45, 30, 67, 23};
        int search, index = 0;
        boolean found = false;

        System.out.print("Enter search number: ");
        search = keyboard.nextInt();

        while (!(found) && (index < numbers.length)) {
            if (numbers[index] == search) {
                found = true;
                System.out.println (search + " has been found at location " + index);
            }//if
            index = index + 1;
        }//while

        if (!found) {
            System.out.println(search + " has not been found");
        }//if

    }//main
}//class
