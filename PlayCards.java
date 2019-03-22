package Lab6a;

import java.util.Scanner;

/*
 * Program to test the Card class
 */

public class PlayCards {
   static Scanner keyboard = new Scanner(System.in);

   // Method to print out the contents of a Card array
   private static void printDeck(Card[] theDeck) {
      for (int index = 0; index < theDeck.length; index++) {
         theDeck[index].printCard();
      }//for
   }//printDeck

   // Method to check if 2 cards are identical
   private static boolean sameCard(Card card1, Card card2) {
      return ((card1.getSuit() == card2.getSuit()) && (card1.getRank() == card2.getRank()));
   }//sameCard

   // Method to find the index position of a card
   private static int findCard(Card[] theDeck, Card theCard) {
      int location = -1;

      for (int index = 0; index < theDeck.length; index++) {
         if (sameCard(theDeck[index], theCard)) {
            location = index;
         }//if
      }//for

      return location;
   }//findCard

   // Method to read and return the suit of the card
   public static int enterSuit() {
      System.out.println("1 - Clubs");
      System.out.println("2 - Diamonds");
      System.out.println("3 - Hearts");
      System.out.println("4 - Spades");
      System.out.print("Enter your suit: ");
      return keyboard.nextInt();
   }//getSuit

   // Method to read and return the rank of the card
   public static int enterRank() {
      System.out.println("\n1 - Ace, 2..10, 11 - Jack, 12 - Queen, 13 - King");
      System.out.print("Enter your rank: ");
      return keyboard.nextInt();
   }//getRank

   public static void main(String[] args) {
      final int NOOFCARDS = 52;
      final int NOOFSUITS = 4;
      final int NOOFRANKS = 13;
      int index = 0;
      int mySuit, myRank;

      // Create a deck of cards
      Card[] deck = new Card[NOOFCARDS];

      // Populate the deck with card objects
      for (int suit = 0; suit < NOOFSUITS; suit++) {
         for (int rank = 1; rank <= NOOFRANKS; rank++) {
            deck[index] = new Card(suit, rank);
            index++;
         }//for
      }//for

      // Enter details from keyboard to create myCard1
      mySuit = enterSuit() - 1;
      myRank = enterRank();
      System.out.println();
      Card myCard1 = new Card(mySuit, myRank);

      // Print out the details of myCard1
      System.out.print("The card is: ");
      myCard1.printCard();

      // Find and print out the position in the deck of myCard1
      System.out.println("The card is located at position " + findCard(deck, myCard1) + "\n");

      // Enter details from keyboard to create myCard2
      mySuit = enterSuit() - 1;
      myRank = enterRank();
      Card myCard2 = new Card(mySuit, myRank);

      // Print out the details of myCard2
      System.out.print("The card is: ");
      myCard2.printCard();

      // Find and print out the position in the deck of myCard2
      System.out.println("The card is located at position " + findCard(deck, myCard2) + "\n");

      // Compare the 2 cards and output if they are the same
      if (sameCard(myCard1, myCard2)) {
         System.out.println("The 2 cards are the same\n");
      }//if
      else {
         System.out.println("The 2 cards are different\n");
      }//else

      // Print all cards in the deck
      System.out.println("The deck of cards is:");
      printDeck(deck);
   }//main
}//class
