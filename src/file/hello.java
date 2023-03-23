package file;

import java.util.Scanner;

public class hello {

   public static void main(String[] args) {
	   float a,num1,num2,b,c,d; //a 덧셈 b 뺄셈 c 곱셈 d 나눗셈
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("첫번째 정수 입력:");
			num1=sc.nextFloat();
			System.out.print("두번째 정수 입력:");
			num2=sc.nextFloat();
		}
		
		a=num1+num2;
		b=num1-num2;
		c=num1*num2;
		d=num1/num2;
			
		System.out.printf("더한값:%.2f\n",a);
		System.out.printf("뺸값:%.2f\n",b);	
		System.out.printf("곱한값:%.2f\n",c);	
		System.out.printf("나눈값:%.2f\n",d);	
	}
}

	
	