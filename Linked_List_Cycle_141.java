/**
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up: Can you solve it without using extra space? solution comes from:
 * https://discuss.leetcode.com/topic/12516/o-1-space-solution
 * 
 * @author Liang-yu
 *
 */
public class Linked_List_Cycle_141 {
	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode walker = head;
		ListNode runner = head;
		while (runner.next != null && runner.next.next != null) {
			walker = walker.next;
			runner = runner.next.next;
			if (walker == runner)
				return true;
		}
		return false;
	}
}
