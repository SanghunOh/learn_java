public class GenericMethodTest {
	static void throwMethod() throws NullPointerException {
		System.out.printf("Inside throwMethod");
		if (false) {
			throw new NullPointerException("throwMethod() Exception.");
		}
	}

	public static void main(String args[]) {
		try {
			throwMethod();
		} catch (NullPointerException exp) {
			System.out.printf("The exception get caught" + exp);
		}
	}

}

class GreetingService {
	public int sayMessage(int x, int y) {
		int sum = x - y;
		return sum;
	}
}
