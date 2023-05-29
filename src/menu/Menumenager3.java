package menu;
import java.util.Scanner;
public class Menumenager3 {

	public static void main(String[] args) {
		selectMenu(input, bookManager);
		int num = 0;
		try (Scanner input = new Scanner(System.in)) {
			while(num !=6) {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					addBooks();
					break;
				case 2:
					deleteBooks();
					break;
				case 3:
					checkStatus();
					break;
				case 4:
					viewlocation();
					break;
				default:
					continue;
				}
			}
		}
	}
	
	
	public static void selectMenu(Scanner input, Bookmanager bookmanager) {
		int num = 0;
		while(num !=6) {
			try {
				showMenu();
				num = input.nextInt(); 
				switch(num) {
				case 1:
					addBooks();
					break;
				case 2:
					deleteBooks();
					break;
				case 3:
					checkStatus();
					break;
				case 4:
					viewlocation();
					break;
				default:
					continue;
				}
			}
			catch(INputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = 0;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Student Management System Menu ***");
		System.out.println("1. Add Books");//책이름 (설정 - 일련번호) 저자 장르 입력받아서 책 추가하기
		System.out.println("2. Delete Books");//책이름 일련번호 하나만 입력받아서 책 삭제하기
		System.out.println("3. Check rental status");//책이름 일련번호 둘중에 하나 받아서 대여상태 알려주기
		System.out.println("4. View Books Location");//일련번호 받아서 위치 알려주기 
		System.out.println("5. Show a menu");// 메뉴보여주기
		System.out.println("6. Exit");// 끝
		System.out.println("Select one number between 1-6:");
	}
	

	public static void addBooks() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Book Number:");
			int BookNumber = scanner.nextInt();
			System.out.print("Book Name:");
			String BookName = scanner.next();
			System.out.print("Book Genre:");
			String BookGenre = scanner.next();
			System.out.println("입력하신" + BookName+ "이 추가되었습니다.");
		}
	}


	public static void deleteBooks() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int BookNumber2 = input.nextInt();
	}
	public static void checkStatus() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int BookNumber3 = input.nextInt();
	}
	public static void viewlocation() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number:");
		int BookNumber4 = input.nextInt();
	}

}


