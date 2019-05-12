// Name: Ananya Vishwanath and Justin Freemantle
// Date: February 19, 2019
// Teacher: Ms. Krasteva
// Description: This class creates an Amusement Park object with several attributes and functions. 

public class AmusementPark 
{
  // The attributes (variables) of the Amusement Park.
  private String name; 
  private boolean open;
  private int numOfRides;
  private int slushieShops;
  private double seasonPassPrice, youthPrice, adultPrice, seniorPrice, slushiePrice;
  private int numOfVisitors, numOfYouth, numOfSenior, numOfAdult;
  private double parkSize;
  // This creates an array of the ride class to create multiple ride objects, each with various values and behaviors.
  Ride[] rides;
  private double ticketRevenue;
  private double slushieRevenue;
  private double totalRevenue;
  private double smallSlushiePrice, mediumSlushiePrice, largeSlushiePrice;

  // The amusement park constructor; used to create a default AmusementPark object
  public AmusementPark () 
  {
    name = "Untitled Park";
    open = false; 
    slushieShops = 0; 
    seasonPassPrice = 79.0;
    youthPrice = 35;
    adultPrice = 50.0;
    seniorPrice = 46.0;
    parkSize = 10000.0;
    numOfVisitors = 0;
    smallSlushiePrice = 2.0;
    mediumSlushiePrice = 4.0;
    largeSlushiePrice = 7.0;
  }
  
  // Another amusement park constructor where variables are passed through the parameters
  public AmusementPark (String n, boolean o, int ss, double spp, double yp, double ap, double sp, double s, int v, double ssp, double msp, double lsp  ) 
  {
    name = n;
    open = o; 
    slushieShops = ss; 
    seasonPassPrice = spp;
    youthPrice = yp;
    adultPrice = ap; 
    seniorPrice = sp;
    parkSize = s;
    numOfVisitors = v; 
    smallSlushiePrice = ssp;
    mediumSlushiePrice = msp;
    largeSlushiePrice = lsp;
  }
  
  //get and set methods
  public String getName() 
  {
    return name;
  }
  
  public void setName(String n) 
  {
    this.name = n;
  }
  
  public int getNumOfRides() 
  {
    return rides.length;
  }
  
  public void setNumOfRides(int r) 
  {
    this.rides = new Ride[r];
  }
  
  // This creates an array of ride objects.
  public void createRide (Ride r, int rideNum) throws Exception
  {
    if (rideNum >= rides.length)
    {
      throw new Exception ("There are not that many rides!");
    }
    else
    {
      rides [rideNum] = r;    
    }
  }
   
  //get and set methods
  public int getSlushieShops() 
  {
    return slushieShops;
  }
  
  public void setSlushieShops(int ss) 
  {
    this.slushieShops = ss;
  }
  
  // returns admission prices for different ticket types
  public double getAdmissionPrice(String passType) 
  {
    if (passType.equalsIgnoreCase ("senior"))
    {
      return seniorPrice;
    }
    else if (passType.equalsIgnoreCase ("youth"))
    {
     return youthPrice; 
    }
    else if (passType.equalsIgnoreCase ("adult"))
    {
     return adultPrice; 
    }
    else if (passType.equalsIgnoreCase ("season pass"))
    {
     return seasonPassPrice; 
    }
    else
    {
     return 0; 
    }
  }
  
  // sets admission prices for different ticket prices
  public void setAdmissionPrice(String passType, double price) 
  {
    if (passType.equalsIgnoreCase ("senior"))
    {
     seniorPrice = price; 
    }
    else if (passType.equalsIgnoreCase ("youth"))
    {
     youthPrice = price; 
    }
    else if (passType.equalsIgnoreCase ("adult"))
    {
     adultPrice = price; 
    }
    else if (passType.equalsIgnoreCase ("season pass"))
    {
      seasonPassPrice = price;
    }
  }
  
  // calculates the amount of money it will cost to buy tickets
  public double purchaseTickets (int numOfYouth, int numOfSenior, int numOfAdult)
  {
    numOfVisitors += numOfYouth + numOfSenior + numOfAdult;
    double ticketCost= numOfYouth * getAdmissionPrice ("youth") + numOfSenior * getAdmissionPrice ("senior") + numOfAdult * getAdmissionPrice ("adult");
    ticketRevenue=ticketRevenue+ticketCost;
    this.numOfYouth = this.numOfYouth  + numOfYouth;
    this.numOfSenior = this.numOfSenior + numOfSenior;
    this.numOfAdult = this.numOfAdult + numOfAdult;
    return ticketCost;
  }
  
  public int getVisitors() 
  {
    return  numOfYouth + numOfSenior + numOfAdult;
  }
  
  // gets and sets slushie prices for indicated size
  public double getSlushiePrice(String size) 
  {
    if (size.equalsIgnoreCase ("small"))
    {
      return smallSlushiePrice;
    }
    else if (size.equalsIgnoreCase ("medium"))
    {
      return mediumSlushiePrice;
    }
    else if (size.equalsIgnoreCase ("large"))
    {
      return largeSlushiePrice;
    }
    else
    {
      return 0;
    }
  }
  
  public void setSlushiePrice(String size, double price)
  {
    if (size.equalsIgnoreCase ("small"))
    {
      smallSlushiePrice = price;
    }
    else if (size.equalsIgnoreCase ("medium"))
    {
      mediumSlushiePrice = price;
    }
    else if (size.equalsIgnoreCase ("large"))
    {
      largeSlushiePrice = price;
    }
  }
  
  // calculates price of slushies purchased (of the same size)
  public double purchaseSlushie (int numOfSlushie, String size)
  {
    if (size.equalsIgnoreCase ("small"))
    {
      slushieRevenue = slushieRevenue + (numOfSlushie * smallSlushiePrice );
      return numOfSlushie * smallSlushiePrice;
    }
    else if (size.equalsIgnoreCase ("medium"))
    {
      slushieRevenue = slushieRevenue + (numOfSlushie * mediumSlushiePrice );
      return numOfSlushie * mediumSlushiePrice;
    }
    else if (size.equalsIgnoreCase ("large"))
    {
      slushieRevenue = slushieRevenue + (numOfSlushie * largeSlushiePrice );
      return numOfSlushie * largeSlushiePrice; 
    }
    else
    {
    return 0;  
    }
  }
  
  public double getTotalRevenue () 
  {
   totalRevenue = totalRevenue + slushieRevenue + ticketRevenue;
   return totalRevenue;
  }
  
  public double getParkSize() 
  {
    return parkSize;
  }
  
  public void setParkSize(double s) 
  {
    this.parkSize = s;
  }
  
 public void openPark() 
 {
  this.open = true;
 }
 
 public void closePark() 
 {
  this.open = false;
 }
 
 public void expand (double sqft) 
 {
  parkSize += sqft;
 }
}
