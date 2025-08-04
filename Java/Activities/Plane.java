package activities;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Plane {
	
	private List<String> passengers;
	private int maxpassengers;
	private Date lasttimeTookof;
	private Date lasttimelanded;
		
	public Plane(int maxpassengers) {
		this.maxpassengers = maxpassengers;
		this.passengers = new ArrayList<>();
	}
	
	public void onboard(String PassengerName) {
		
		if(passengers.size() <= maxpassengers) {
			this.passengers.add(PassengerName);
		}else {
			System.out.println("Plane is full");
		}
	}
		public Date takeOff() {
	        this.lasttimeTookof = new Date();
	        return lasttimeTookof;
	    }
		
		 public void land() {
		        this.lasttimelanded = new Date();
		        this.passengers.clear();
		    }

		    public Date getLastTimeLanded() {
		        return lasttimelanded;
		    }

		    public List<String> getPassengers() {
		        return passengers;
		    }
		 
	
}
	
	
	
