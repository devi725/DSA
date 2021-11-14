package dsaPrblm;

public class BinarySearch {

	
	public static int binary_search(int array[] , int target) {
		 int low = 0; 
		 int high = array.length-1; 
		 while(low<=high) {
			 int mid = (low + high)/2; 
			 if(target== array[mid]) { 
				 return mid; 
				 }else if(target < array[mid]) { 
					 high = mid - 1;
				 }else { 
					 low = mid +1;
				 } 
		 		} return -1;
		 		} 

	 
	

	public static void main(String[] args) {
		int array[] = { 1,1,2,2,4,5,5,6,6,6,6,9,10,11 };
		int target = 6;
		System.out.println(binary_search(array, target));
		

	}

}