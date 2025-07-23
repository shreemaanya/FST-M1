
package Activities;
import java.util.*;
public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] numar = {10, 77, 10, 54, -11, 10};  // initialize array 
System.out.println("Original Array: " + Arrays.toString(numar)); //print original array for reference 

//set given numbers
int srchNum = 10;
int fixedSum = 30;

//Print sum of all 10s in array 
System.out.println("Result: " + result(numar, srchNum, fixedSum));
	}
//calculate for result function expected boolean result ,parameters are all 3 nums 
public static boolean result(int[] nums,int srchNum ,int fixedSum) {
	int temp_sum =0;
	// Find the 10's in the array and add them
	for (int num : nums) {
		if (num==srchNum) {
			//Add them 
			temp_sum += srchNum;		
	}
	//Check if value is equal to 30.
	if (temp_sum>fixedSum) {
		break;
	}
	}
	//return true if condition satisfied 
	return temp_sum==fixedSum;
}}


