package jweJavaIntermediate;

import java.io.File;
import java.lang.reflect.Constructor;

public class JWEReflaction {

	public static void main(String[] args) {
		for(Constructor<?> constructor : File.class.getConstructors()){
			String name = constructor.getName();
			Class<?>[] type = constructor.getParameterTypes();
			System.out.println("Class Name : " + name);
			System.out.println("Class type : " + type);
		}
	}

}
