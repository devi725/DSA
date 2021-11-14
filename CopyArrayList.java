package dsaPrblm;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(1);
		arrayList1.add(2);
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(7);
		arrayList2.add(8);
		arrayList2.add(9);
		arrayList2.add(10);
		arrayList2.add(11);
		Collections.copy(arrayList2,arrayList1);
		//ArrayList arrayList2 = (ArrayList)arrayList1.clone();
		System.out.println(arrayList2);
	}

}
