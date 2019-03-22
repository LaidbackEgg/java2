package Lab6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by:
 * Created on:
 * Read in and store the names of 5 students with the
 * exam marks achieved in 3 modules then output a table
 * with the students name, marks for each module the
 * students average mark and the average for each module
 */

public class Results {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.0");

        final int NOOFSTUDENTS = 5;
        final int NOOFMODULES = 3;
        int total;

        // Array to store names
        String[] names = new String[NOOFSTUDENTS];
        // Array to store marks
        int[][] marks = new int[NOOFSTUDENTS][NOOFMODULES];
        // Array to student averages
        double[] studentAverage = new double[NOOFSTUDENTS];
        // Array to store module averages
        double[] moduleAverage = new double[NOOFMODULES];

        //Read in the name and marks for each student
        for (int row = 0; row < NOOFSTUDENTS; row++) {
            System.out.print("Enter a name: ");
            names[row] = keyboard.nextLine();
            for (int column = 0; column < NOOFMODULES; column++) {
                System.out.print("Enter a mark: ");
                marks[row][column] = keyboard.nextInt();
            }//for
            keyboard.nextLine();
        }//for

        // Calculate the average mark for each student
        for (int row = 0; row < NOOFSTUDENTS; row++) {
            total = 0;
            for (int column = 0; column < NOOFMODULES; column++) {
                total = total + marks[row][column];
            }//for
            studentAverage[row] = (double) total / NOOFMODULES;
        }//for

        // Calculate the average mark for each module
        for (int column = 0; column < NOOFMODULES; column++) {
            total = 0;
            for (int row = 0; row < NOOFSTUDENTS; row++) {
                total = total + marks[row][column];
            }//for
            moduleAverage[column] = (double) total / NOOFSTUDENTS;
        }//for

        // Output the results
        System.out.println("\nName\t\t\tMark 1\tMark 2\tMark 3\tAverage\tGrade");
        for (int row = 0; row < NOOFSTUDENTS; row++) {
            System.out.print(names[row]);
            for (int column = 0; column < NOOFMODULES; column++) {
                System.out.print("\t\t" + marks[row][column]);
            }//for
            System.out.println("\t\t" + df.format(studentAverage[row]));
        }//for
        System.out.print("Module Average\t");
        for (int column = 0; column < NOOFMODULES; column++) {
            System.out.print(df.format(moduleAverage[column]) + "\t");
        }//for
        System.out.println();

    }//main
}//class
