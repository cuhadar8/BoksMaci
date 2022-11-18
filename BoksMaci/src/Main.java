
public class Main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("A", 7, 100, 80, 100);
		Fighter f2 = new Fighter("B", 11, 100, 80, 60);
		
		Match match = new Match(f1, f2, 60, 100);
		match.run();
	}

}
