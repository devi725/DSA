package dsaPrblm;

public class FirstAndLastOccurence {
	
	public static int lower_bound(int array[] , int target) { 
		 int low = 0; 
		 int high = array.length-1;
		 while(low<high) { 
			 int mid = (low+high)/2; 
			 if(target<=array[mid]) { 
				 high =mid;
				 }else {
					 low = mid + 1; 
					 } 
			 }if(array[low]!=target) { 
				 return -1; 
				 }return low; 
				 }
	 public static int upper_bound(int array[], int target) {
			int low = 0;
			int high = array.length - 1;
			while (low < high) {
				int mid = (low + high) / 2;
				if (target >= array[mid]) {
					low = mid+1;
				} else {
					high = mid;
				}
			}
			if(low<array.length && array[low]<=target) {
				low++;
				return -1;
			}
			 return low-1;
		}
	
	public static void main(String[] args) {
		int array[] = { 1,3,3,3,3,3,6,6,6,6,7,7,7,7 };
		int target = 3;
		System.out.println(upper_bound(array, target));
		System.out.println(lower_bound(array, target));

	}

}
