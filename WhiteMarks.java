package Lab9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WhiteMarks {
    static PrintWriter myOutFile;

    public static void main(String[] args) {
        boolean open;
        int[] marks = {45, 67, 49, 78, 90, 77};
        String myFileName = "results.txt";

        try {
            myOutFile = new PrintWriter(myFileName);
            open = true;
        }//try
        catch (FileNotFoundException error) {
            System.out.println("Error opening the file");
            open = false;
        }//catch

        try {
            if (open) {
                myOutFile.println(marks.length);
                for (int index = 0; index < marks.length; index++) {
                    myOutFile.print(marks[index] + " ");
                }//for
                myOutFile.println();
                myOutFile.close();
                open = false;
                System.out.println("Successfully written to file and closed");
            }//if
        }//try
        catch (Exception error) {
            System.out.println("Exception " + error.getMessage() + " caught");
        }//catch
    }//main
}//class
