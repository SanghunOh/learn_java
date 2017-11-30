package jweJavaIntermediate.outer;

public class Fruits {
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
