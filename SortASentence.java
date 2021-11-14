package dsaPrblm;

public class SortASentence {
	
	public static void main(String[] args) {
		String s = "sentence4 a3 is2 This1";
		String str[] = s.split(" ");
		int len = str.length;
		String sort[] = new String[len];
		for(int i = 0; i<len;i++) {
			String k = str[i];
			int len1 = k.length();
			char ch= k.charAt(len1-1);
			int n = Character.getNumericValue(ch);
			String append = k.substring(0,len1-1);
			sort[n-1] = append;
		}
		String sort1 = " ";
		for(int i = 0; i<sort.length ;i++) {
			sort1 = sort1+sort[i] + " ";
		}
		System.out.println(sort1.substring(0,sort1.length()-1));
	}

}
