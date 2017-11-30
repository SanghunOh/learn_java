package jwejavaadvance;

public class JWETryCatch {

	public static void main(String[] args) {
		int x = 0;
		int y = 10;
		try {
			int num = y / x;
			System.out.println("next-statement: Inside try block");
		} catch (Exception ex) {
			System.out.println("Exception Occurred");
		} finally {
			System.out.println("finally try-catch");
		}
		System.out.println("next-statement: Outside of try-catch");
	}
}
