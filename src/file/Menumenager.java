package file;

import java.util.Scanner;

public class Menumenager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num !=6) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Books");
			System.out.println("2. Delete Books");
			System.out.println("3. Edit Books");
			System.out.println("4. View Books Location");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("Book Number:");
				int bookNumber = input.nextInt();
				System.out.print("Book Name:");
				String bookName = input.next();
				break;
			case 2:
				System.out.print("Book Number:");
				int bookNumber2 = input.nextInt();
				break;
			case 3:
				System.out.print("Book Number:");
				int bookNumber3 = input.nextInt();
				break;
			case 4:
				System.out.print("Book Number:");
				int bookNumber4 = input.nextInt();
				break;
			}
		}
	}

}
