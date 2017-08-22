import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks.
 * 
 * push(x) -- Push element x to the back of queue. pop() -- Removes the element
 * from in front of queue. peek() -- Get the front element. empty() -- Return
 * whether the queue is empty.
 * 
 * @author Liang-yu
 *
 */
public class Implement_Queue_using_Stacks_232 {
	public class MyQueue {

		Stack<Integer> s1;
		Stack<Integer> s2;

		/** Initialize your data structure here. */
		public MyQueue() {
			s1 = new Stack<Integer>();
			s2 = new Stack<Integer>();
		}

		/** Push element x to the back of queue. */
		public void push(int x) {
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			s1.push(x);
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}

		}

		/**
		 * Removes the element from in front of queue and returns that element.
		 */
		public int pop() {
			return s2.pop();
		}

		/** Get the front element. */
		public int peek() {
			return s2.peek();
		}

		/** Returns whether the queue is empty. */
		public boolean empty() {
			return s2.isEmpty();
		}
	}
}
