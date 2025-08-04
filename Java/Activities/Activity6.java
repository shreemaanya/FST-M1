package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Plane plane = new Plane(10);
		plane.onboard("pass1");
		plane.onboard("pass2");
		plane.onboard("pass3");
		plane.onboard("pass4");
		plane.onboard("pass5");
		plane.onboard("pass6");
		plane.onboard("pass7");
		plane.onboard("pass8");
		plane.onboard("pass9");
		plane.onboard("pass10");
		plane.onboard("pass11");
		
		System.out.println("[plane take off" + plane.takeOff());
		
		System.out.println("ppl on plane" + plane.getPassengers());
		
		Thread.sleep(5000);
        //Plane has landed
        plane.land();
		
      //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());

	}

}
