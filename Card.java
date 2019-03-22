package Lab6a;

/**
 * Program to define the Card class
 */

public class Card {
   private int suit;
   private int rank;

   public Card() {
   }//Default Constructor

   public Card(int pSuit, int pRank) {
      suit = pSuit;
      rank = pRank;
   }//Constructor

   protected int getSuit() {
      return suit;
   }//getSuit

   protected int getRank() {
      return rank;
   }//getRank

   protected void printCard() {
      String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
      String[] ranks = {"null", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
              "Jack", "Queen", "King"};

      System.out.println(ranks[rank] + " of " + suits[suit]);
   }//printCard

}//class
