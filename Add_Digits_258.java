
public class Add_Digits_258 {
	// https://en.wikipedia.org/wiki/Digital_root. check the congruence formula.
	public int addDigits(int num) {

		return num == 0 ? 0 : (num % 9 == 0 ? 9 : (num % 9));

	}

}
