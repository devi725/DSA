package linkList;

class LinkedList {
	int data ;
	LinkedList next;
	public LinkedList() {
		
	}
	public LinkedList(int data) {
		this.data = data;
	}
	public static void main(String[] args) {
		LinkedList node1 = new LinkedList();
		node1.data= 4;
		
		LinkedList node2 = new LinkedList();
		node2.data= 5;
		node1.next = node2;
		
		LinkedList node3 = new LinkedList();
		node3.data= 6;
		node2.next = node3;
		
		LinkedList node4 = new LinkedList();
		node4.data= 7;
		node3.next = node4;
		
		LinkedList node5 = new LinkedList();
		node5.data= 8;
		node4.next = node5;
		
		
		
		LinkedList last = node1;
		while(last.next != null) {
			last = last.next;
		}LinkedList newNode = new LinkedList(9);
		 last.next = newNode;
		 
		 LinkedList startNode = new LinkedList(0);
		 LinkedList start = node1;
		 startNode.next = start;
		 start = startNode;
		 
		 LinkedList middleNode = new LinkedList(10);
		 int target = 6;
		 LinkedList check = startNode;
		 while(check.data != target) {
			 check = check.next;
		 }
		 middleNode.next = check.next;
		 check.next = middleNode;
		 
		
		System.out.println(startNode.data);
		System.out.println(node1.data);
		System.out.println(node2.data);
		System.out.println(node3.data);
		System.out.println(middleNode.data);
		System.out.println(node4.data);
		System.out.println(node5.data);
		System.out.println(newNode.data);
		
		
	}
}




