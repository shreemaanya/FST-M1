package activities;

interface Addable {
	int add(int a , int b);
}

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Addable ad1 = (a,b) -> (a+b);
System.out.println(ad1.add(10, 40));

Addable ad2 = (int a , int b) -> {
	return (a+b);

};

		
	}
}