package dsaPrblm;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrderOfArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		Collections.sort(arrList,Collections.reverseOrder());
		for(Integer val : arrList) {
			System.out.println(val);
		}

	}

}
