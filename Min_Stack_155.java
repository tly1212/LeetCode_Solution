import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack. pop() -- Removes the element on top of
 * the stack. top() -- Get the top element. getMin() -- Retrieve the minimum
 * element in the stack.
 * 
 * solution 1 comes from:
 * https://discuss.leetcode.com/topic/7020/java-accepted-solution-using-one-
 * stack
 * 
 * @author Liang-yu
 *
 */
public class Min_Stack_155 {
	class MinStack {
		int min = Integer.MAX_VALUE;
		Stack<Integer> stack = new Stack<Integer>();

		public void push(int x) {
			// or used another stack to save the min value.
			if (x <= min) {
				stack.push(min);
				min = x;
			}
			stack.push(x);
		}

		public void pop() {
			if (stack.pop() == min)
				min = stack.pop();
		}

		public int top() {
			return stack.peek();
		}

		public int getMin() {
			return min;
		}
	}

	class MinStack2 {

		/** initialize your data structure here. */
		Stack<Integer> s1, s2;

		public MinStack2() {
			s1 = new Stack<>();
			s2 = new Stack<>();
		}

		public void push(int x) {
			if (!s1.isEmpty()) {
				s2.push(Math.min(s2.peek(), x));
				s1.push(x);
			} else {
				s1.push(x);
				s2.push(x);
			}
		}

		public void pop() {
			s1.pop();
			s2.pop();
		}

		public int top() {
			return s1.peek();
		}

		public int getMin() {
			return s2.peek();
		}
	}
}
