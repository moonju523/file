package file;

import java.util.Scanner;
public class assignment {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("화씨온도를 입력하세요 : ");
	     int        f = scanner.nextInt();
	        
	     float c = (float)5/9 * (f-32);
	     System.out.printf("입력한 화씨온도를 섭씨온도로 변환한 값 : %.2f " , c);
	     scanner.close();

	}

}
