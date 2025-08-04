package activities;


interface BicycleParts{
	public int tyres = 2;
	public int maxSpeed = 25;
}

interface BicycleOperations{
	public void applyBrake (int decrement);
	public void speedUp(int increment);
}

//Base class 
public class Bicycle implements BicycleParts, BicycleOperations{
	public int gears;
	public int currentspeed;
	 //the Bicycle class has one constructor
	public Bicycle(int gears,int currentspeed) {
		this.gears = gears;
		this.currentspeed = currentspeed;
	}
	 //Bicycle class has three methods
	
	public void applyBrake(int decrement) {
		currentspeed -= decrement;
		System.out.println("current speed" + currentspeed);
	}
	
	public void speedUp(int increment) {
		currentspeed += increment;
		System.out.println("current speed" + currentspeed);
	}
		 //Method to print info of Bicycle
		public String bicycleDesc() {
			return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
		}
		
	}
