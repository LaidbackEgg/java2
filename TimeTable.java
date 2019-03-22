package Lab6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Arrays 2, question 3
 */

public class TimeTable {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        final int DAYSMAX = 5;
        final int TIMESMAX = 8;
        //declare String array with initial values for days
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        //declare a double array with initial values for times
        double[] time = {9.00, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00};
        //declare a 2D array
        String[][] module = new String[DAYSMAX][TIMESMAX];
        //hardcode in the values and store in the array
        for (int row = 0; row < DAYSMAX; row++) {
            for (int column = 0; column < TIMESMAX; column++) {
                //module[row][column] = " ";
                module[0][0] = "COM465";
                module[0][2] = "COM564";
                module[0][3] = "COM564";
                module[0][6] = "COM564";
                module[1][1] = "COM564";
                module[1][2] = "COM564";
                module[1][5] = "COM640";
                module[1][6] = "COM640";
                module[1][7] = "COM640";
                module[1][6] = "COM640";
                module[2][2] = "COM465";
                module[2][6] = "COM465";
                module[4][1] = "COM465";
                module[4][4] = "COM640";
                module[4][5] = "COM640";
            }//for
        }//for
        //print out the top line of times for the table
        System.out.print("\t\t\t\t\t ");
        for (int index = 0; index < TIMESMAX; index++) {
            System.out.print(df.format(time[index]) + "\t ");
        }//for
        System.out.println();
        //populate and print out the array in tabular form
        for (int row = 0; row < DAYSMAX; row++) {
            System.out.print(days[row] + " \t");
            for (int column = 0; column < TIMESMAX; column++) {
                if (module[row][column] == null) {
                    (module[row][column]) = ("\t");
                }//if
                System.out.print("\t\t " + module[row][column]);
            }//for
            System.out.println();
        }//for
        //First, read in the day, then search for the line it appears on
        String searchDay = "unknown";
        int searchRow = 0;
        System.out.print("\n\n\n======================================================= \n\n\n");
        System.out.print("Please enter your day you are seeking (eg Monday): ");
        searchDay = kb.nextLine();
        for (int row = 0; row < DAYSMAX; row++) {
            if (searchDay.equals (days[row]) ){
                searchRow = row;
            }//if
        }//for
        //Second, read in the time, then search for the column it appears on using this nest
        double searchTime;
        int searchColumn = 0;
        System.out.print("Please enter the time slot you are seeking (eg 9.00): ");
        searchTime = kb.nextDouble();
        for (int column = 0; column < TIMESMAX; column++) {
            if (searchTime == time[column]) {
                searchColumn = column;
            }//if
        }//for
        // Third, print out the entry in the array at the intersection of searchDay and searchTime
        System.out.println(searchDay + " " + df.format(searchTime) + " - " +
                module[searchRow][searchColumn]);
    }//main
}//class