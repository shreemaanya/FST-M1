package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("Yellow");
		myList.add("White");
		myList.add("Red");
		myList.add("Orange");
		myList.add("Purple");
		myList.add(0, "Pink");
		myList.add(5, "Brown");
		System.out.println("Print all colors");
		
		for(String s:myList) {
			System.out.println(s);
			
		}
		
		System.out.println(myList.get(0));
		System.out.println(myList.contains("Lion"));
		System.out.println(myList.size());
		//System.out.println(myList.set(1, "White"));
		System.out.println(myList);
		myList.remove("Brown");
		System.out.println(myList.size());
		
		

	}

}
