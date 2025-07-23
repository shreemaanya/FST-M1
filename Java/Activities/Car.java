package Activities;

public class Car { // variables added 
	String color; 
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(){ // constructor 
		tyres =4;
		doors = 4;
		}
	
	public void displayCharacteristics(){
	
	System.out.println(this.color);
	System.out.println(this.transmission);
	System.out.println(this.make);
	System.out.println(this.tyres);
	System.out.println(this.doors);
		
	}
	public void accelarate(){
		System.out.println("Car is moving forward");
	}
	public void	brake(){
		System.out.println("Car has stopped");
		}
	}
	
	

