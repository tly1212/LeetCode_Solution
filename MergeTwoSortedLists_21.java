import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Merge two sorted linked lists and return it as a new list. 
// The new list should be made by splicing together the nodes of the 
// first two lists.

public class MergeTwoSortedLists_21 {
	public static List<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b) {
		List<Integer> n = new LinkedList<Integer>();
		if (a.isEmpty())
			return b;
		if (b.isEmpty())
			return a;
		int as = a.size();
		int bs = b.size();
		int k = (as>=bs)? as:bs;
		int ai = 0, bi = 0;
		
		while(ai <k && bi <k){
			if(a.get(ai)<= b.get(bi)){
				n.add(a.get(ai));
				ai++;
			}
			else{
				n.add(b.get(bi));
				bi++;
			}
		}
		while(ai<as ){
			n.add(a.get(ai));
			ai++;
		}
		while(bi<bs){
			n.add(b.get(bi));
			bi++;
		}
			
		
		return n;
	}

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		LinkedList<Integer> b = new LinkedList<Integer>();
		a.add(1);
		a.add(3);
		b.add(4);
		b.add(5);
		
		List<Integer> n = merge(a, b);
		for (int e : n)
			System.out.println(e);
	}
}
