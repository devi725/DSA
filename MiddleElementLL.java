package linkList;

public class MiddleElementLL {
	static int count = 0;
	public static void main(String[] args) {
		LinkedList node1 = new LinkedList(1);
		LinkedList node2 = new LinkedList(2);
		LinkedList node3 = new LinkedList(3);
		LinkedList node4 = new LinkedList(4);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=null;
		LinkedList node = node1;
		while(node != null) {
			count++;
			node = node.next;
		}
		int mid =0;
    	if(count%2 == 0) {
    		mid = count/2;
    	}else {
    		mid = (count+1)/2;
    	}
    	LinkedList current = node1;
    	while(current.next != null) {
    	for(int i = 1;i<mid;i++) {
    		current = current.next;
    	}
    	System.out.println(current.data);
    	}
    	
	}

}
