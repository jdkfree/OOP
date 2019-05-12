public class TheAirplane{
    public static void main (String[]args){
	Airplane a = new Airplane (50, 0, "Down", "Open");
	
	a.closeDoor(); 
	a.fillUp(); 
	a.loadPass(200); 
	System.out.println ("Passengers: " + a.getPassengers()); 
	System.out.println ("Feul: " + a.getGasLevel());
	System.out.println ("Door: " + a.getDoorStatus());
	System.out.println ("Ready for takeoff!\n");
	
	a.takeOff(); 
	a.doneTakeOff ();
	a.normalFlight(20);
	a.prepLanding ();
	System.out.println ("Landing gear: " + a.getLandingGear ()); 
	a.land(); 
	System.out.println ("Landing: Successful!");
	a.openDoor();
	a.unloadPass();
	a.fillUp();
	
    }
}
