package school;

public class ExceptionTest{
	public static void main(String[] args) {
		String s = null;
		int a;
		try{
			a= 4 / 0;
			} catch(ArithmeticException e) {
				a= -1;
				}
		System.out.println(a);
		System.out.println(s.length());
	}
}