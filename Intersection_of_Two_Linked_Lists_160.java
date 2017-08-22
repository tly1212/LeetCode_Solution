/**
 * Write a program to find the node at which the intersection of two singly
 * linked lists begins.
 * 
 * Notes:If the two linked lists have no intersection at all, return null. The
 * linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * 
 * @author Liang-yu
 *
 */
public class Intersection_of_Two_Linked_Lists_160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		while(headA != headB){
			if(headA == null || headB == null) return null;
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}
	
	// public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	// //boundary check
	// if(headA == null || headB == null) return null;
	//
	// ListNode a = headA;
	// ListNode b = headB;
	//
	// //if a & b have different len, then we will stop the loop after second
	// iteration
	// while( a != b){
	// //for the end of first iteration, we just reset the pointer to the head
	// of another linkedlist
	// a = a == null? headB : a.next;
	// b = b == null? headA : b.next;
	// }
	//
	// return a;
	// }
}
