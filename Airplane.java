public class Airplane {
   private int gasLevel, passengers;
   private String landingGear, doorStatus;
   
   public Airplane (){
       gasLevel = 100; 
       passengers = 100;
       landingGear = "Down";
       doorStatus = "Open";
    }
    
    public Airplane (int gas, int pass, String land, String door){
       gasLevel = gas; 
       passengers = pass;
       landingGear = land;
       doorStatus = door;
    }
   
    public void openDoor (){
	doorStatus = "Open";
    }
    
    public void closeDoor (){
	doorStatus = "Closed";
    }
    
    public void fillUp (){
	gasLevel = 100;
    }
    
    public void takeOff (){
	gasLevel -= 30;
    }
    
    public void doneTakeOff (){
	landingGear = "Up";
    }
    
    public void normalFlight (int per){
	gasLevel -= per;
    }
    
    public void prepLanding (){
	landingGear = "Down";
    }
    
    public void land (){
	gasLevel -= 15;
    }
    
    public void loadPass (int pass){
	passengers += pass;
    }
    
    public void unloadPass (){
	passengers = 0;
    }
    
    public int getGasLevel (){
	return gasLevel;
    }
    
    public String getDoorStatus(){
	return doorStatus;
    }
    
    public String getLandingGear(){
	return landingGear;
    }
    
    public int getPassengers (){
	return passengers;
    }
}   
