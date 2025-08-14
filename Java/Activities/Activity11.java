package Activities;
import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap <Integer , String> hash_map = new HashMap<Integer , String>();
		hash_map.put(1,"red");
		hash_map.put(2,"blue");
		hash_map.put(3,"yellow");
		hash_map.put(4,"green");
		hash_map.put(5,"maroon");
		
		System.out.println("original map :"+hash_map);
		
		System.out.println("Removed map :"+hash_map.remove(4));
		
		System.out.println("map after removing green :"+ hash_map);
		
		System.out.println("Check to see if green color is removed :"+ hash_map.containsValue("green"));
		
		System.out.println("size of hash_map finally :"+ hash_map.size());
	}

}
