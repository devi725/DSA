package dsaPrblm;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Geekster");
		arrList.add("Windows");
		arrList.add("Ashutosh");
		arrList.add("Sanjay");
		arrList.add(1,"Mouse");
		arrList.add(3,"devi");
		arrList.remove(new String("Ashutosh"));
		for(String val: arrList) {
			System.out.println(val);
		}

	}

}
