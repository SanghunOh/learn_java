import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class tempJava {
	public static void main(String args[]) {
		JWECallBack callBack = new JWECallBack();
		MathOperation addition = (int a, int b) -> a + b;
		System.out.printf("CallBack Mothod = "+ callBack.operate(10, 5, addition));
	}

}
interface MathOperation {
	int operation(int a, int b);
}
class JWECallBack{
	public int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}