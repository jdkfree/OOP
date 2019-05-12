/* Name: Anaya Viswhanath and Justin Freemantle
 * Teacher: Ms. Krasteva
 * Date: April 24, 2019
 * Description: This program models a Card object.
 */

public class Card
{
  String myFace;         
  String mySuit;   

  public Card( String theFace, String theSuit )    
  {  
    myFace = theFace; 
    mySuit = theSuit;
  }
  
  public String toString() 
  {     
    return myFace + " of " + mySuit;
  }
} // close class 











