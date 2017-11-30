package jwejavaadvance.inter;

public class JWEInterface implements BasketballTeam, FootballTeam {

	private String name = null;
	
	public JWEInterface(String name) {
		this.name = name;
	}

	@Override
	public void printFootballName() {
		System.out.println("Football JWEInterface: \"" + name + " F.C.\"");
	}

	@Override
	public void printBasketballName() {
		System.out.println("Basketball JWEInterface: \"" + name + " B.C.\"");
	}
	
	public static void main(String[] args) {
		JWEInterface t = new JWEInterface("JWEInterface A");
		t.printBasketballName();
		t.printFootballName();
	}
}
