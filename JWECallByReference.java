public class JWECallByReference {
	public static void main(String[] args) {
		Number a = new Number();		a.x = 3;
		System.out.printf("before calling increment() is " + a.x);	
increment(a);
		System.out.printf("after calling increment() is " + a.x);
	}
	public static void increment(Number n) {
		System.out.printf("before incrementing x is " + n.x);	
n.x = n.x + 10;
		System.out.printf("after incrementing x is " + n.x);
	}
}
class Number {		int x;	}			