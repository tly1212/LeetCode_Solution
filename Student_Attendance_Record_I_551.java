import java.util.HashMap;

/**
 * You are given a string representing an attendance record for a student. The
 * record only contains the following three characters:
 * 
 * 'A' : Absent. 'L' : Late. 'P' : Present. A student could be rewarded if his
 * attendance record doesn't contain more than one 'A' (absent) or more than two
 * continuous 'L' (late).
 * 
 * You need to return whether the student could be rewarded according to his
 * attendance record.
 * 
 * @author Liang-yu
 *
 */
public class Student_Attendance_Record_I_551 {
	public static boolean checkRecord(String s) {
		char[] a = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		if (a[0] != 'L')
			hm.put(a[0], hm.getOrDefault(a[0], 0) + 1);
		if (a.length > 1 && a[a.length-1] != 'L')
			hm.put(a[a.length-1], hm.getOrDefault(a[a.length-1], 0) + 1);

		for (int i = 1; i < a.length -1; i++) {
			if (a[i] == 'L') {
				if (a[i - 1] == 'L' && a[i + 1] == 'L')
					hm.put('L', hm.getOrDefault('L', 0) + 1);
			} else
				hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
		}

		return hm.getOrDefault('A', 0) <= 1 && hm.getOrDefault('L', 0) < 1;
	}
	
	public static void main(String[] args){
		boolean b = checkRecord("LPPPPLPLPP");
		System.out.println(b);
	}
}
