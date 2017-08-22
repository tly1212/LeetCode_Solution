/*
 * Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
 */
public class RemoveElement_27 {
	public static int removeElement(int[] a, int val) {
		int id1 = 0, id2 = a.length -1;
		while (id1 <= id2) {
			if (a[id1] == val) {
				a[id1] = a[id2];
				id2--;
			} else
				id1++;
		}
		return id2 + 1;
	}

	public static void main(String[] args) {
		int[] a = {1,2,1,2,1,3};
		System.out.println(removeElement(a, 3));
	}
}
