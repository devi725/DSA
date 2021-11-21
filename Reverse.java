package stack;

import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		String input = "Hi i am devi";
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
                stack.push(arr[i]);
            }
		for(int j=arr.length;j>=0;j--) {
			System.out.print(stack.peek());
			stack.pop();
		}
		System.out.println();
	}

}
