package school;

import java.util.Scanner;

public class MyExceptionTest{
	public static void main(String[] args){
		try{
			int num= readNum();
			} catch(MyException e) {
				System.out.printf("Error, the number %d is odd!", e.getNum());
				}
		}
	public static int readNum() throws MyException{
		Scanner in = new Scanner(System.in);
		int num= in.nextInt();
		if(num%2 != 0) {
			throw new MyException(num);
		}
		return num;
	}
}