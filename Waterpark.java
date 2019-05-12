package AmusementPark;


public class Waterpark extends AmusementPark {
	private String theme; 
	private int waterslides; 
	private boolean beach; 
	private double poolSize;
	
	public Waterpark () {
		this.setName ("Untitled Waterpark");
		theme = null; 
		waterslides = 0; 
		beach = false;
		poolSize = 0.0;
	}
	
	public Waterpark (String n, String t, int w, boolean b, double p) {
		this.setName(n);
		theme = t; 
		waterslides = w; 
		beach = b;
		poolSize = p;
	}
	
	public Waterpark (String n, boolean o, int r, int rc, int hds, int ss, double a, double lp, double sp, double s, int v, int p, String t, int w, boolean b, double ps) {
		this.setName(n);
		this.setOpen(o); 
		this.setRides(r);
		this.setRollerCoasters(rc); 
		this.setNumOfAttractions(this.getRides() + this.getRollerCoasters());
		this.setHotDogStands(hds);
		this.setSlushieShops(ss);
		this.setAdmissionPrice(a);
		this.setLunchPrice(lp);
		this.setSlushiePrice(sp);
		this.setParkSize(ps);
		this.setVisitors (v);
		this.setProfit (p); 
		theme = t; 
		waterslides = w; 
		beach = b;
		poolSize = ps;
	}
	
	public String getTheme () {
		return theme; 
	}
	
	public void setTheme (String t) {	
		this.theme = t; 
	}
	
	public String buildWaterslides(int n) {
		if (n*50 <= this.getProfit()) {
			waterslides -= this.getProfit()*50; 
			return null;
		}else {
			return "Sorry, you don't have enough money for that"; 
		}
	}
	
	public String destroyWaterslides(int n) {
		if (n <= waterslides) {
			waterslides -= n; 
			return null;
		}else {
			return "Sorry, there aren't enough waterslidse for that"; 
		}
	}
	
	public String getBeach () {
		if (beach)
			return "There is a beach at " + this.getName(); 
		else
			return "There is no beach at " + this.getName();
	}
	
	public void setbeach (boolean b) {
		if (b)
			beach = true;
		else
			beach = false; 
	}
	
	public void setPoolSize (int p) {
		poolSize = p; 
	}
	
	public double getPoolSize () {
		return poolSize;
	}
}




