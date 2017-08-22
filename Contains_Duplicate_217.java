import java.util.HashSet;

/**
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * 
 * @author Liang-yu
 *
 */
public class Contains_Duplicate_217 {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int e: nums){
            if(!hs.add(e))
                return true;
        }
        return false;
    }
}
