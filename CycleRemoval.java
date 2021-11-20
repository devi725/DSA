package linkList;

public class CycleRemoval {

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
			node5.next=node2;
	        cycleremoval(node1);
	        printList(node1);
		}

		public static void printList(LinkedList node) {
			 while (node != null) {
		            System.out.print(node.data + " ");
		            node = node.next;
		        }
		}

		public static void cycleremoval(LinkedList node) {
			LinkedList slow =node, fast = node;
	        while (slow != null && fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	            if (slow == fast) {
	                break;
	            }
	        }
	        if (slow == fast) {
	            slow = node;
	            if (slow != fast) {
	                while (slow.next != fast.next) {
	                    slow = slow.next;
	                    fast = fast.next;
	                }
	                System.out.println(fast.next.data + " loop begins");
	                fast.next = null; 
	            }
	            else {
	                while(fast.next != slow) {
	                    fast = fast.next;
	                }
	                fast.next = null;
	            }
	        }
	}

}
