package dsaPrblm;

public class SumOfTwoArrayEle {

	public static void main(String[] args) {
		int array[] = {-1,0};
		int target = -1;
		int r[] = checkpair(array,target);
		System.out.println(r[0]);
		System.out.println(r[1]);
		
	}
		public static int[] checkpair(int array[],int target ) {
			int result[] = new int[2]; 
			int low = 0;
			int high = array.length-1;
		while(low<high) {
			 int sum = array[low]+array[high];
			 if(sum == target) {
				 result[0] = low+1;
				 result[1] = high+1;
				 break;
			 }else if(sum> target) {
				 high--;
			 }else
				 low++;
			 
		}
		    return result;
	}
}
