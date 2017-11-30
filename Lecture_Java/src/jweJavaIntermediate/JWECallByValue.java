package jweJavaIntermediate;

public class JWECallByValue {

	public static void main(String[] args) {
		int argValue = 50 ;
		System.out.println("before change " + argValue);
		argValue = change(500);
		System.out.println("after change " + argValue);
	}

	public static int change(int data) {
		int retrunValue;
		retrunValue = data + 100;// changes will be in the local variable only
		return retrunValue;
	}
}
