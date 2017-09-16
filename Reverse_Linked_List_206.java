/**
 * Reverse a singly linked list.
 * 
 * Hint: A linked list can be reversed either iteratively or recursively. Could
 * you implement both?
 * 
 * @author Liang-yu
 *
 */
public class Reverse_Linked_List_206 {
	public ListNode reverseList(ListNode head) {
		// iterative
		if (head == null)
			return null;
		ListNode temp, current = head.next;
		while (current != null) {
			temp = current.next;
			current.next = head;
			head = current;
			current = temp;
		}
		return head;
	}

	// recursive
	public ListNode reverseList2(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode a = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return a;
	}

}
