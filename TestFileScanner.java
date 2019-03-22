package Lab9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestFileScanner {
    static FileReader myFileName;
    static Scanner readMyFile;

    public static void main(String[] args) {
        int wordCount = 0;
        String currentWord;

        try {
            myFileName = new FileReader("input.txt");
            readMyFile = new Scanner(myFileName);
        }//try
        catch (FileNotFoundException error) {
            System.out.println("Cannot open the input file");
            System.out.println(error.getMessage());
        }//catch

        try {
            while (readMyFile.hasNext()) {
                currentWord = readMyFile.next();
                System.out.println(currentWord);
                wordCount = wordCount + 1;
            }//while
            System.out.println("The file contains " + wordCount + " words");
        }//try
        catch (Exception error) {
            System.out.println("Error reading from file");
            System.out.println("Exception " + error.getMessage() + " caught");
        }//catch
    }//main
}//class
