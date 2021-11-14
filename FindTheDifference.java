package dsaPrblm;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheDifference {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "abcde";
		String strSplit1[] = str1.split("");
		ArrayList<String> strList1 = new ArrayList<>(Arrays.asList(strSplit1));
		String strSplit2[] = str2.split("");
		ArrayList<String> strList2 = new ArrayList<>(Arrays.asList(strSplit2));
		for(String val : strList2) {
			if(!strList1.contains(val)) {
				System.out.println(val);
			}
		}
	}

}
