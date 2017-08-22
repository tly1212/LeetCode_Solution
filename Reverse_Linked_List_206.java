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
		
		//iterative
		
//		if(head == null)
//			return null;
//		ListNode temp, current = head.next;
//		while(current != null){
//			temp = head;
//			head = current;
//			head.next = temp;
//			current = current.next;			
//		}
//		return head;
		
		//recursive
		
		if(head == null || head.next == null)
			return head;
		ListNode a = reverseList(head.next);
		head.next = null;
		head.next.next = head;
		return a;
	}
}
