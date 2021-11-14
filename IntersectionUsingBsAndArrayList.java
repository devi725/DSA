package dsaPrblm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class IntersectionUsingBsAndArrayList {
	
	public static void main(String[] args) {
		int arr1[] = {1,2,2,3,4,6};
		int arr2[] = {2,5,6,7,3};
		Arrays.sort(arr2);
		List<Integer> arrList = new ArrayList<>();
		for(int val : arr1) {
			if(findNum(arr2,val)&& !arrList.contains(val)) {
				arrList.add(val);
			}
		}
		System.out.println(arrList);
	}		
	public static boolean findNum(int arr[] , int target) {
		int low = 0;
		int high = arr.length;
		 while(low<=high) {
			 int mid = (low + high)/2; 
			 if(target== arr[mid]) { 
				 return true; 
				 }else if(target < arr[mid]) { 
					 high = mid - 1;
				 }else { 
					 low = mid +1;
				 } 
		 		} return false;
	}

}
