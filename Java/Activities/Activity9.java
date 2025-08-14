package Activities;
import java.util.ArrayList;

public class Activity9 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Ane");
		myList.add("Ani");
		myList.add("Ano");
		myList.add("Any");
		
		System.out.println("Print All the Objects:");
		for(String s: myList) {
			System.out.println(s); 
			
		}
		System.out.println("3rd name in the ArrayList:" + myList.get(2));
		System.out.println("check if a name exists in the ArrayList:" + myList.contains("Any"));
		System.out.println("number of names in the ArrayList:" + myList.size());
		System.out.println("removed name from the list:" + myList.remove("Ano"));
		System.out.println("number of names in the ArrayList after removal:" + myList.size());
		
			
	}

}
