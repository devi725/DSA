package dsaPrblm;

public class ValidAnagram {
	public static char  sort(char arr[]) {
		int n = arr.length;
		for(int i = 1; i<n; i++) {
			char temp = arr[i];
			int j = i - 1;
			while(j>= 0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j = j -1;	
			}
			arr[j + 1] = temp;
		}
		return 0;
	}
	public static boolean check(char sArr[],char tArr[]) {
		System.out.println(sort(sArr));
		System.out.println(sort(tArr));
		int n1 = sArr.length;
		int n2 = tArr.length;
		if(n1 != n2)
			return false;
		for(int i = 1; i<n1; i++) {
			if(sArr[i]!=tArr[i])
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		String s = "rat";
		String t = "car";
		char sArr[] = s.toCharArray();
		char tArr[] = t.toCharArray();
		/*if(check(sArr,tArr))
			System.out.println("Valid Anagram.");
		else
			System.out.println("Invalid Anagram.");*/
		System.out.println(check(sArr,tArr));
	}

}
