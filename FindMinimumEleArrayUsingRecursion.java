package dsaPrblm;

public class FindMinimumEleArrayUsingRecursion {

	public static void main(String[] args) {
		int a[] = {0,4,7,9,10};
		int n = a.length;
		System.out.println(findMinimum(a,n));

	}

	private static int findMinimum(int[] a, int n) {
		if(n == 1)
			return a[0];
		return Math.min(a[n-1],findMinimum(a,n-1));
	}

}
