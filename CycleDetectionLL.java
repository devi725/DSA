package linkList;

public class CycleDetectionLL {

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
        cycleDetect(node1);
	}

	public static void cycleDetect(LinkedList node) {
		LinkedList slow =node, fast = node;
        int flag = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Cycle detected");
        else
            System.out.println("Cycle not detected");
   
	}

}
