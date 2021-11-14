package dsaPrblm;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = {3,2,3};
		int n = arr.length;
		HashMap<Integer,Integer> dataMap = new HashMap<>();
		for(int i = 0; i<n;i++) {
			if(arr[i] >0) {
				if(dataMap.containsKey(arr[i])) {
					Integer value = dataMap.get(arr[i]);
					value++;
					dataMap.put(arr[i], value);
				}
				else {
					dataMap.put(arr[i],1);
				}
			}
		}
		for(Integer key : dataMap.keySet()) {
			int value = dataMap.get(key);
		    if(value > n/2) {
			    System.out.println(key);
		    }
		}
	}

}
