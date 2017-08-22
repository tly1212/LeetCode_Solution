import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack. pop() -- Removes the element on top of
 * the stack. top() -- Get the top element. getMin() -- Retrieve the minimum
 * element in the stack.
 * 
 * solution comes from:
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
	        if(x <= min){          
	            stack.push(min);
	            min=x;
	        }
	        stack.push(x);
	    }

	    public void pop() {
	        if(stack.pop() == min) min=stack.pop();
	    }

	    public int top() {
	        return stack.peek();
	    }

	    public int getMin() {
	        return min;
	    }
	}
}
