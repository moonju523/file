package assignment;

public class Dude {
	public static void main(String[] args) {
		public String name;
		public int hp = 100;
		public int mp = 0;
		
		public void sayName() {
			System.out.println(name);
		}
		public void punchface(Dude target) {
			target.hp -= 10;
		}
	}

}                  