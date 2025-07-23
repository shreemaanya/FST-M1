package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Car maruti = new Car("Black","Manual",2014 ,4,4);
  
  maruti.displayCharacteristics();
  maruti.accelarate();
  maruti.brake();
  
  Car toyota = new Car("White","Automatic",2020 ,4,4);
  toyota.displayCharacteristics();
  toyota.accelarate();
  toyota.brake();

  	}

}
