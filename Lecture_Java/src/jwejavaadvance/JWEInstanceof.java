package jwejavaadvance;

import java.util.ArrayList;

public class JWEInstanceof {

	public static void main(String[] args) {
		Object object01 = "ABC";
		Object object02 = new ArrayList();
		Object object03 = 4;

		if(object01 instanceof String){
			System.out.println("True instanceof String : "+object01);
		}
		if(object02 instanceof ArrayList){
			System.out.println("True instanceof ArrayList : "+object02);
		}
		if(object03 instanceof Integer){
			System.out.println("True instanceof Integer : "+object03);
		}
		if(object01 instanceof Integer){
			System.out.println("False instanceof String : "+object01);
		}
	}

}
