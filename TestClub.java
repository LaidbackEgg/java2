package Lab6a;

import java.util.Scanner;

/*
 * Program to test the Membership and Member Class
 */

public class TestClub {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      Membership hockey = new Membership("Coleraine Hockey Club", 3);
      Membership rugby = new Membership("Ballymoney Rugby Club", 4);
      int number;
      Member person;

      System.out.println(hockey);
      System.out.println(rugby);

      System.out.print("Enter the membership number of the person you want to find in " + hockey.getClubName() + ": ");
      number = keyboard.nextInt();
      keyboard.nextLine();

      //Search for the person
      person = hockey.findMember(number);
      if (person == null) {
         System.out.println("No match found");
      }//if
      else {
         System.out.println("The search found the following member:\n" + person);
      }//else

   }//main
}//class
