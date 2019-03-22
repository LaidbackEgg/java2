package ShoeExample;

import java.util.Scanner;

public class UseShoe {

    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        FootballShoe myFootballShoe = new FootballShoe(8, "New Balance");

//        System.out.print("Enter the shoe colour: ");
//        myFootballShoe.setColour(keyboard.nextLine());

        myFootballShoe.setColour("Red");
        System.out.println(myFootballShoe.toString());

    }//main
}//class
