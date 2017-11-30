package jwejavaadvance;

public class JWEInnerClass {
	public static void main(String args[]) {
		GreetingService service = new GreetingService() {
			public void sayMessage(String message) {
				System.out.println("GreetingService - sayMessage() " + message);
			}
		};
		service.sayMessage("Annonymouse Class");
		JWEInnerClass innerClass = new JWEInnerClass();
		MathOperation addition = (int a, int b) -> a + b;
		 System.out.println("10 + 5 = " + innerClass.operate(10, 5,
		 addition));
		System.out.println("10 + 5 = " + addition);
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}