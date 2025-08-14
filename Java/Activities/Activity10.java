package Activities;
import java.util.HashSet;
public class Activity10 {

	public static void main(String[] args) {
		HashSet <String> hs = new HashSet<String>();
		//Adding elements to HashSet
		hs.add("L");
		hs.add("M");
		hs.add("N");
		hs.add("O");
		hs.add("P");
		hs.add("Q");
		System.out.println ("Original Hashset:"+hs);
		System.out.println("Size of Hashset:"+ hs.size());
		System.out.println("Removed element of Hashset:"+ hs.remove("M"));
		System.out.println("Remove element not present in Hashset:"+ hs.remove("X"));
		System.out.println("Check if element is in Hashset:"+ hs.contains("P"));
		System.out.println("Check if element is in Hashset:"+ hs.contains("R"));
		System.out.println ("Updated Hashset:"+hs);
		
	}

}
