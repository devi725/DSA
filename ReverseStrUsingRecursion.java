package dsaPrblm;

public class ReverseStrUsingRecursion {
	public  static void reverse(char strArr[],int k) {
	if(k == strArr.length) {
		return;
	}
	reverse(strArr,k+1);
	System.out.print(strArr[k]);
	}
	public static void main(String[] args) {
		String str = "chirag";
		char  strArr[] = str.toCharArray();
		reverse(strArr,0);
	}

}
