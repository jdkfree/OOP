/* Name: Anaya Viswhanath and Justin Freemantle
 * Teacher: Ms. Krasteva
 * Date: April 24, 2019
 * Description: This program creates an instance of the DeckofCards class. It shuffles the cards and the deck is printed both before and after
 * shuffling.
 */

import java.util.Scanner;

public class DeckCardsClient
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner( System.in );   
    DeckofCards deck1 = new DeckofCards( );   
    
    System.out.println ("before shuffling");
    System.out.println ();
    deck1.printAll ();
    
    deck1.shuffle ();
    System.out.println ();
    System.out.println ("after shuffling");
    deck1.printAll ();
    
    System.out.println();   // deal 2 rows of 4 cards
    System.out.printf("%-20s%-20s%-20s\n", deck1.deal(), deck1.deal(), deck1.deal()); 
    System.out.println();
    System.out.printf("%-20s%-20s%-20s\n", deck1.deal(), deck1.deal(), deck1.deal());
  } // close main method
} // close class 











