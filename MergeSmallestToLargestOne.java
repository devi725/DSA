package linkList;

public class MergeSmallestToLargestOne {
	    static int i=0,j=0;
		static class Node {
			int data;
			Node next;
		}
		static Node newNode(int key)
		{
			Node temp = new Node();
			temp.data = key;
			temp.next = null;
			return temp;
		}

		
		static void printList(Node node)
		{
			while (node != null) {
				System.out.printf("%d ", node.data);
				node = node.next;
			}
		}
		public static void main(String args[])
		{
			Node head1 = newNode(1);
			head1.next = newNode(3);
			head1.next.next = newNode(5);

			Node head2 = newNode(0);
			head2.next = newNode(2);
			head2.next.next = newNode(4);
			head2.next.next.next = newNode(6);
			
			Node node1 = head1;
			Node node2 = head2;
			while(head1 != null) {
				i++;
				head1 = head1.next;
			}
			while(head2 != null) {
				j++;
				head2 = head2.next;
			}
			 merge(node1, node2);
			 print(node2);
	}
   
		public static void merge(Node head1, Node head2) {
			if(i<j) {
				while(head2.next != null) {
					head2 = head2.next;
				}
				head2.next = head1;
			}else {
				while(head1.next != null) {
					head1 = head1.next;
				}
				head1 = head2;
			}
		}
	  public static void print(Node node)
		{
			while (node != null) {
				System.out.print(" "+ node.data);
				node = node.next;
			}
		}
}
