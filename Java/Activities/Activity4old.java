package Activities;

public class Activity4old {
	
		public static void main(String[] args) {
			int array[] = {2,6,8,1,9};
			int length = array.length;
			
			System.out.println("Array before sort : ");
			for(int i=0; i<length; i++) {
			System.out.print(array[i]+ " ");
			}
			System.out.println();
			
			//insertion sort
			for(int i=1; i<length; i++) {        //i is index , sorting starts from index 1 
				int key = array[i];                   // key tem var at ith index 
				int j=i-1 ;                         // j is prev element at left 
				while (j>=0 && array[j] > key) {
				array[j+1] = array[j];
				j = j-1;
				}
				array[j+1]=key;
			}
			System.out.println("Array after sort : ");
			for(int i=0; i<length; i++) {
			System.out.print(array[i]+ " ");
			}
			}
}
