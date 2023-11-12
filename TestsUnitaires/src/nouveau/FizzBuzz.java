package nouveau;

public class FizzBuzz {

	public static String check(int a) {

		if (a % 3 == 0 && a % 5 == 0) {
			return  "fizzbuzz";
		}else if (a % 3 == 0) {
			return  "fizz";
		} else if (a % 5 == 0) {
			return  "buzz";
		} else if (a < 1 || a > 100) {
			return "votre entrée ne correspond pas au limites fixées";
		} else {
			return String.valueOf(a);
		}

	}
}
