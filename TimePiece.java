package Lab3;
import java.text.DecimalFormat;

/*
 * Define a TimePiece class
 */

public class TimePiece {

   DecimalFormat df1 = new DecimalFormat("0,000.00");
   DecimalFormat df2 = new DecimalFormat("00");

   private String kind;
   private double costPrice;
   private String readout;
   private int hours, minutes;
   private boolean canTalk;

   public TimePiece() {
   }//Default Constructor

   public TimePiece(String type, double cost, String output, boolean talk) {
      kind = type;
      costPrice = cost;
      readout = output;
      canTalk = talk;
      hours = 0;
      minutes = 0;
   }//Constructor

   public TimePiece(String type, double cost, String output, int hrs, int mins, boolean talk) {
      kind = type;
      costPrice = cost;
      readout = output;
      hours = hrs;
      minutes = mins;
      canTalk = talk;
   }//Constructor

   protected void setMinutes(int mins) {
      minutes = mins;
   }//setMinutes

   protected void setHours(int hrs) {
      hours = hrs;
   }//setHours

   protected void setTime(int hrs, int mins) {
      setHours(hrs);
      setMinutes(mins);
   }//setTime

   protected void updateTime(int hrs, int mins) {
      minutes = minutes + mins;
      if (minutes >= 60) {
         minutes = minutes - 60;
         hours = hours + 1;
      }//if
      hours = hours + hrs;
      if (hours >= 24) {
         hours = hours - 24;
      }//if
   }//updateTime

   protected String showTime() {
      return df2.format(hours) + ":" + df2.format(minutes);
   }//showTime

   public String toString() {
      String message;

      message = "Details of " + kind + "\n" +
              "==============================\n" +
              "Cost Price:        £" + df1.format(costPrice) + "\n" +
              "Type of read out:  " + readout + "\n" +
              "Current Time:      " + showTime() + "\n";
      if (canTalk) {
         message = message + "This time piece can talk\n";
      } else {
         message = message + "This time piece cannot talk\n";
      }
      message = message + "==============================\n";
      return message;
   }//toString
}//class
