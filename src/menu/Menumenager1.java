package menu;
import java.util.Scanner;
public class Menumenager1 {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num !=6) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Books");//책이름 (설정 - 일련번호) 저자 장르 입력받아서 책 추가하기
			System.out.println("2. Delete Books");//책이름 일련번호 하나만 입력받아서 책 삭제하기
			System.out.println("3. Check rental status");//책이름 일련번호 둘중에 하나 받아서 대여상태 알려주기
			System.out.println("4. View Books Location");//일련번호 받아서 위치 알려주기 
			System.out.println("5. Show a menu");// 메뉴보여주기
			System.out.println("6. Exit");// 끝
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			if(num == 1) {
				addBooks();
			}
			else if(num == 2) {
				deleteBooks();
			}
			else if(num == 3) {
				checkStatus();
			}
			else if(num == 4) {
				viewlocation();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addBooks() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int BookNumber = input.nextInt();
		System.out.print("Book Name:");
		String BookName = input.next();
		System.out.print("Book Date:");
		int BookDate = input.nextInt();
	}
	public static void deleteBooks() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Book Number:");
			int BookNumber2 = input.nextInt();
		}
	}
	public static void checkStatus() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Book Number:");
			int BookNumber3 = input.nextInt();
		}
	}
	public static void viewlocation() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int BookNumber4 = input.nextInt();
	}

}
