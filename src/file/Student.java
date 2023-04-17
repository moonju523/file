package file;

class Tester{
	static void doSomething(int x,int[]ys, Student b) {
		x = 99;
		ys[0] = 99;
		b.name = "99";
	}
	public static class main(String[]arguments) {
		int i = 0;
		int[]j = {0};
		Student k = new Student("50",true);
		doSomething(i,j,k);
	}
}
