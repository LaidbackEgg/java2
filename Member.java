package Lab6a;
/**
 * Program to define an individual Member Class
 */

public class Member {
   // Define instance variables
   private int memberNumber;
   private String memberName;

   public Member(int number, String name) {
      memberNumber = number;
      memberName = name;
   }//Constructor

   protected int getMembershipNumber() {
      return memberNumber;
   }//getMembershipNumber

   public String toString() {
      return (memberNumber + "\t\t" + memberName + "\n");
   }//toString
}//class