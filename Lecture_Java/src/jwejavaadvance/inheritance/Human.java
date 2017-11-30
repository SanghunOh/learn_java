package jwejavaadvance.inheritance;

public class Human extends Animal {
	public Human() {
//		super();
		System.out.println("A new human has been created!");
	}
	
	@Override
	public void sleep() {
		System.out.println("A human sleeps...");
	}
	
	@Override
	public void eat() {
		System.out.println("A human eats...");
	}
	
	public void walk(){
		System.out.println("A human walks...");
	}
}
