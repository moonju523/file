package file;
import java.util.Scanner;
public class Menumenager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num !=6) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Books");//책이름 일련번호 등록일자 입력받아서 책 추가하기
			System.out.println("2. Delete Books");//책이름 일련번호 하나만 입력받아서 책 삭제하기
			System.out.println("3. Check rental status");//책이름 일련번호 둘중에 하나 받아서 대여상태 알려주기
			System.out.println("4. View Books Location");//책이름 일련번호 둘중에 하나 받아서 위치 알려주기 
			System.out.println("5. Show a menu");// 메뉴보여주기
			System.out.println("6. Exit");// 끝
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("Book Number:");
				int BookNumber = input.nextInt();
				System.out.print("Book Name:");
				String BookName = input.next();
				break;
			case 2:
				System.out.print("Book Number:");
				int BookNumber2 = input.nextInt();
				break;
			case 3:
				System.out.print("Book Number:");
				int BookNumber3 = input.nextInt();
				break;
			case 4:
				System.out.print("Book Number:");
				int BookNumber4 = input.nextInt();
				break;
			}
		}
	}

}
