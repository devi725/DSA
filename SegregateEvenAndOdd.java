package dsaPrblm;

public class SegregateEvenAndOdd {
	public static void segregate(int arr[]) {
		int low = 0;
		int high = arr.length-1;
		while(low<high) {
			while(arr[low]%2 == 0 && low < high) {
				low++;
			}while(arr[high]%2 == 1 && low < high) {
				high--;
			}
			if(low < high) {
				int temp = arr[low];
				arr[low] = arr[high] ;
				arr[high] = temp;
				low++;
				high--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {12,34,45,9,8,90,3};
		segregate(arr);
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
