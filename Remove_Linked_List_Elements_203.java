/**
 * Remove all elements from a linked list of integers that have value val.
 * 
 * Example Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6 Return: 1 --> 2
 * --> 3 --> 4 --> 5
 * 
 * @author Liang-yu
 *
 */
public class Remove_Linked_List_Elements_203 {
	public ListNode removeElements(ListNode head, int val) {
		 if (head == null)
				return null;
			while (head.val == val && head.next != null) {
				head = head.next;
			}
	        if(head.val == val)
	            return null;
			ListNode current = head;
			while (current.next != null) {
				if (current.next.val == val)
					current.next = current.next.next;
				else
					current = current.next;
			}
			return head;
	}
}
