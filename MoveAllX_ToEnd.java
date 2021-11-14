package dsaPrblm;
 
public class MoveAllX_ToEnd {
	static int count = 0;
	public static String move(String s,int index,String newstr) {
		if(index == s.length()) {
			while(count>0) {
				newstr += 'x';
				count--;
			}
			return newstr;
		}
		if(s.charAt(index)=='x') {
			count++;
			return move(s,index+1,newstr);
		}else {
			newstr += s.charAt(index);
			return move(s,index+1,newstr);
		}
	}

	public static void main(String[] args) {
		String s = "abxxcdefxhi";
		int index = 0;
		String newstr = "";
		System.out.println(move(s,index+1,newstr));
	}

}
