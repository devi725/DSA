package dsaPrblm;

public class SumOfArrayUsingRecursive {
	public static int sum(int arr[] , int k) {
		if(k <= 0) {
			return 0;
		}
		return (sum(arr,k-1)+arr[k-1]);
	}
	public static void main(String[] args) {
		int arr[] = {1,2,5,5,10};
		System.out.println(sum(arr,arr.length));

	}

}
