package assignment;

public class Tester {
	public static void main(String[] args) {
		Wizard wizard1 = new Wizard();
		Dude dude1 = new Dude();
		wizard1.punchFace(dude1);
		System.out.println(dude1);
	}

}
