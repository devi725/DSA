package dsaPrblm;

public class FrequencyOfElements {
	
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
		int array[] = { 1,1,2,2,4,5,5,6,6,6,6,9,10,11 };
		int target = 6;
		System.out.println(upper_bound(array, target));
		System.out.println(lower_bound(array, target));
		System.out.println((upper_bound(array, target)-lower_bound(array, target))+1);


	}

}
