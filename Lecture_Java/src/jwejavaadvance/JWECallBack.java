package jwejavaadvance;
public class JWECallBack {
	public static void main(String args[]) {
		JWECallBack callBack = new JWECallBack();
		MathOperation addition = (int a, int b) -> a + b;
		System.out.println("CallBack Mothod = " + callBack.operate(10, 5, addition));
	}

	interface MathOperation {
		int operation(int a, int b);
	}
	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}