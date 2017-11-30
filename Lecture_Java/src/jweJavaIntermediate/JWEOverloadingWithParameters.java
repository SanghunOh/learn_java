package jweJavaIntermediate;

class DisplayOverloading {
	public void display(String c) {
		System.out.println("One parameter Method : "+c);
	}

	public void display(String c, int num) {
		System.out.println("Two parameters Method : " + c + ", " + num);
	}
	
    public void display(int c){
       System.out.println(c);
    }
}

public class JWEOverloadingWithParameters {

	public static void main(String[] args) {
		DisplayOverloading displayOverloading = new DisplayOverloading();
		displayOverloading.display("Overloading");
		displayOverloading.display("Overloading", 10);
		displayOverloading.display(10);
	}

}
