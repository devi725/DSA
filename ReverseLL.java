package linkList;

public class ReverseLL {
	static Node head;
	static class Node {
		int data;
		Node next;
		public Node(int i) {
			data = i;
			next = null;
		}
	}
	
	
	Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current != null) {
			next = current.next;
		    current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;	
	}
	public static void main(String[] args) {
		ReverseLL list = new ReverseLL();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        
		head = list.reverse(head);
		list.printList(head);
	}

	public void printList(Node head) {
		while(head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
		
	}

}
