package jwejavaadvance.inheritance;

public class JWEInheritanceMain {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird bird = new Bird();
		Human human = new Human();
		
		System.out.println();
		
//		animal.sleep();
		animal.eat();
//		
		bird.sleep();
		bird.eat();
		bird.fly();
//		
		human.sleep();
		human.eat();
		human.walk();
//		
//		Animal a1 = new Human();
//		Animal a2 = new Bird();
//		
//		a1.eat();
//		a2.sleep();
		
		// The following statements are incorrect.
		// Human d = new Animal();
		// Bird b = new Animal();
	}
}
