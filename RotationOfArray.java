package dsaPrblm;

public class RotationOfArray {

	public static void main(String[] args) {
		int arr[] = {3,4,5,1,2};
		int low =0 , high = arr.length-1;
		int count = rotation(arr,low,high);
		System.out.println(count);
	}
		public static int rotation(int arr[],int low,int high) {
			if(arr[low]<arr[high]) {
				System.out.println(arr[low]);
				return 0;
			}
			while(low<=high) {
				int mid = (low+high)/2;
				if(arr[mid] <arr[mid-1]) {
					return mid;
				}else if (arr[mid]>arr[mid+1]) {
					System.out.println(arr[mid+1]);
					return mid+1;
				}
				else if(arr[low]<=arr[mid]){
					low = mid+1;
				}else if(arr[high]>=arr[mid]) {
					high = mid-1;
				}

			}
			return -1;
		}

}
