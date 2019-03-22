package Lab3;

/*
 * Program to test the TimePiece class
 */

public class TestTimePiece {
   public static void main(String[] args) {

      // Create two objects
      TimePiece myWatch = new TimePiece("watch", 12.99, "digital", 9, 45, true);
      TimePiece bigBen = new TimePiece("clock", 100000, "analog", false);

      // Print out the details of bigBen
      System.out.println(bigBen);

      // Show the time of myWatch
      System.out.println("The time is " + myWatch.showTime() + "\n");

      // Set the time on myWatch to 10:50
      myWatch.setHours(10);
      myWatch.setMinutes(50);

      // Set the time on bigBen to 22:55
      bigBen.setTime(22, 55);

      // Change the time on bigBen by 2:05
      bigBen.updateTime(2, 5);

      // Print out the details of both Time Pieces
      System.out.println(bigBen);
      System.out.println(myWatch);

   }//main
}//class
