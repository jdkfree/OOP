/* Name: Anaya Viswhanath and Justin Freemantle
 * Teacher: Ms. Krasteva
 * Date: April 24, 2019
 * Description: This program models a Deck of Cards. The deck of cards are generated within 
 * the constructor. A method is created to shuffle the order of the cards.
 */

import java.util.Random;

public class DeckofCards
{
  private Card myDeck[];       
  private int myCardNum = 0;       
  
  public DeckofCards( )   
  { 
    String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
    
    myDeck = new Card[52];
    
    for( int n = 0; n < 52; n++ )
    {
      myDeck[n] = new Card( faces[n % 13], suits[n / 13] );
    }
  } // end constructor
  
  // method to deal cards
  public Card deal()
  {    
    if( myCardNum < 52 )
      return myDeck[ myCardNum++ ]; // post increment:  identifier++
    else
      return null; // = 52 means all 52 cards are dealt
  } // end deal() method

  public void printAll ()
  {
   for (int i = 0; i < myDeck.length; i ++)
   {
    System.out.println (myDeck [i]); 
   }
  }
  
 public void shuffle()
 {    
   Random rand = new Random(); 
   int r;
   Card temp;
   for (int i = 0; i < 52 ; i++) 
   { 
     r = rand.nextInt(52); 
     temp = myDeck[i]; 
     myDeck[i] = myDeck[r]; 
     myDeck[r] = temp;           
   } 
 } // end shuffle() method 
} // close class 











