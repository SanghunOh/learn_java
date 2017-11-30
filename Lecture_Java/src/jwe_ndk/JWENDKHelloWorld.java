// On MacOS
// javac JWENDKHelloWorld.java
// mkdir -p jwe_ndk
// mv JWENDKHelloWorld.class ./jwe_ndk/
// javah jwe_ndk.JWENDKHelloWorld

package jwe_ndk;

public class JWENDKHelloWorld {

	static{
		System.load("/Users/ohsanghun/Documents/Programming/workspace/workspace_java/jwe_JavaBasic/src/jwe_ndk/helloworld.so");
	}
	public static void main(String[] args) {
		JWENDKHelloWorld helloWorld = new JWENDKHelloWorld();
		
		String a = "AA \n";
		int[] b = {1,2,3};
		char[] c = {'a', 'b', 'c'};
		
		System.out.println(a);
		
		helloWorld.show1();
		helloWorld.show2(9);
		helloWorld.show3(b);
		helloWorld.show4('d');
		helloWorld.show5(c);
		helloWorld.show6(a);
		helloWorld.show6();
	}
	
	public void func(){
		System.out.println("func()");
	}
	
	public native void show1();
	public native void show2(int i);
	public native void show3(int i[]);
	public native void show4(char c);
	public native void show5(char c[]);
	public native void show6(String s);
	public native void show6();
}
