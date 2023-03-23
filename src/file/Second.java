package file;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		//정수 2개를 받고 연산자 네개중 하나를 수신하는 계산기 프로그램(스위치 문 사용)
		
		float num1,num2; //a 덧셈 b 뺄셈 c 곱셈 d 나눗셈
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("첫번째 정수 입력:");
			num1=sc.nextFloat();
			System.out.print("두번째 정수 입력:");
			num2=sc.nextFloat();
		}
		
		String count = "+";
		
		switch(count) {
		case "+":
			System.out.println(num1+num2);
		    
		case "-":
			System.out.println(num1-num2);
			
		case "*":
			System.out.println(num1*num2);
			
		case "/":
			System.out.println(num1/num2);
				
		}	

	}
}
