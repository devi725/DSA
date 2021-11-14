package dsaPrblm;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int arr[] = {1,0,1,0,1,1,1,1,0,1,0};
		int i=0;
		int j = arr.length-1;
		while(i<=j) {
			if(arr[i]==1) {
				int temp= arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				--j;
			}else i++;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k] + " ");
		}
	}

}
