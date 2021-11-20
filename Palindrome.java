package linkList;

public class Palindrome {
	 static int count = 0;
	public static void main(String[] args) {
		LinkedList node1 = new LinkedList(1);
		LinkedList node2 = new LinkedList(2);
		LinkedList node3 = new LinkedList(2);
		LinkedList node4 = new LinkedList(1);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=null;
		if(palindromeChecker(node1))
			System.out.println("Palindrome");
		else 
			System.out.println("Not a Palindrome");
		
	}
    public static LinkedList reverse(LinkedList node) {
    	while(node != null) {
			count++;
			node = node.next;
		}
		
		LinkedList current = node;
		LinkedList prev = null;
		LinkedList next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		
		return node;
	}
    private static boolean palindromeChecker(LinkedList node) {
    	LinkedList current = node;
    	int mid =0;
    	if(count%2 == 0) {
    		mid = count/2;
    	}else {
    		mid = (count+1)/2;
    	}
    	for(int i =1;i<mid;i++) {
    		current = current.next;
    	}
    	LinkedList revHead = reverse(current.next);
    	while(node != null && revHead != null) {
    		if(node.data !=  revHead.data) {
    			return false;
    		}
    		node = node.next;
    		revHead = revHead.next;
    	}
    	return true;
    }
}
