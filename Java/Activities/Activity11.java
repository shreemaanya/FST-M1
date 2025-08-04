package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		 hash_map.put(1, "Red");
	        hash_map.put(2, "Green");
	        hash_map.put(3, "Blue");
	        hash_map.put(4, "White");
	        hash_map.put(5, "Black");

	        // Remove one colour
	        hash_map.remove(4);
	        // Map after removing a colour
	        System.out.println("After removing White: " + hash_map);
	        
	        if(hash_map.containsKey(1)) {
	        	System.out.println("Red exists");
	        } else {
	        	System.out.println("Red not exist");
	        }
	        
	        if(hash_map.containsValue("Purple")) {
	        	System.out.println("Purple exists");
	        } else {
	        	System.out.println("Purple not exist");
	        }
	        
	        

	}

}
