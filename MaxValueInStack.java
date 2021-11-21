package stack;

import java.util.Stack;

public class MaxValueInStack {
	
	static class MyStack
	{
		Stack<Integer> s = new Stack<Integer>();
		int maxEle;
		void getMax()
		{
			if (s.empty())
				System.out.print("Stack is empty\n");
			else
				System.out.print("Maximum Element in" +
							"the stack is: "+maxEle + "\n");

		}
		void peek()
		{
			if (s.empty())
			{
				
				System.out.print("Stack is empty ");
				return;
			}

			int t = s.peek(); 

			System.out.print("Top Most Element is: ");
			if(t > maxEle)
				System.out.print(maxEle);
			else
				System.out.print(t);
		}
		void pop()
		{
			if (s.empty())
			{
				System.out.print("Stack is empty\n");
				return;
			}

			System.out.print("Top Most Element Removed: ");
			int t = s.peek();
			s.pop();
			if (t > maxEle)
			{
				System.out.print(maxEle + "\n");
				maxEle = 2 * maxEle - t;
			}

			else
				System.out.print(t + "\n");
		}
		void push(int x)
		{
			if (s.empty())
			{
				maxEle = x;
				s.push(x);
				System.out.print("Number Inserted: " + x + "\n");
				return;
			}

			if (x > maxEle)
			{
				s.push(2 * x - maxEle);
				maxEle = x;
			}

			else
				s.push(x);

			System.out.print("Number Inserted: " + x + "\n");
		}
	};

	public static void main(String[] args)
	{
		MyStack s = new MyStack();
		s.push(3);
		s.push(5);
		s.getMax();
		s.push(7);
		s.push(19);
		s.getMax();
		s.pop();
		s.getMax();
		s.pop();
		s.peek();
		}
	}
