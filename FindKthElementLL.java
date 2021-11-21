package linkList;

public class FindKthElementLL {
	static int count = 0;
	public static void main(String[] args) {
		LinkedList node1 = new LinkedList(1);
		LinkedList node2 = new LinkedList(2);
		LinkedList node3 = new LinkedList(3);
		LinkedList node4 = new LinkedList(4);
		LinkedList node5 = new LinkedList(5);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		int k = 1;
		LinkedList node = node1;
		while(node != null) {
			count++;
			node = node.next;
		}int key = count;
		while(node1 != null) {
			if(key == k) {
				System.out.println(node1.data);
				break;
			}
			node1 = node1.next;
			key--;
		}
	}

}
