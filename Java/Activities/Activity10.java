package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("M");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("M");
        hs.add("X");
      //Print HashSet
        System.out.println("Original HashSet: " + hs);        
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());
        if(hs.remove("Z")) {
        	System.out.println("Z removed");}
        else {
        	System.out.println("Z is not present in the Set");
	}
        //Search for element
        System.out.println("Checking if M is present: " + hs.contains("M"));
        //Print updated HashSet
        System.out.println(hs.remove("X"));
        System.out.println("Updated HashSet: " + hs);
        
	}
}
