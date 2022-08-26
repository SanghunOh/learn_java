package jwe_JavaBasic;

import java.util.ArrayList;

public class JWEInFileClasses {

	static int temp;
	public static void main(String[] args) {
		ArrayList<Fruits> mFruitsList = new ArrayList<Fruits>();
		mFruitsList.add(new Fruits());
		mFruitsList.add(new Fruits("Good Fruits"));
		for (Fruits t : mFruitsList) {
			System.out.println("fruit : " + mFruitsList);
		}
		temp = 10;
	}
}

class Fruits {
	private String caption;

	public Fruits() {
		this("Not good Fruits");
	}

	public Fruits(String caption) {
		this.caption = caption;
	}

	public String toString() {
		return caption;
	}
}
