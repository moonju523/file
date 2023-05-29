package menu;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Bookmanager {
	ArrayList<Book> books = new ArrayList<Book>();
	Scanner input;
	Bookmanager(Scanner input){
		this.input = input;
	}
	public void addBooks() {
		int genre = 0;
		Book book = null;
		while(genre != 1 && genre!= 2) {
			try {
				System.out.print("1 for Novel");
				System.out.print("2 for essay");
				System.out.print("Select num for Book Genre between 1 and 2:");
				genre = input.nextInt();
				if(genre == 1) {
					book = new Book();
					break;
				}
				else if (genre == 2) {
					book = new Book();
					break;
				}
				else {
					System.out.print("Select num for Book Genre between 1 and 2:");
				}
			}
			catch(INputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				genre = 0;
			}
		books.add(book);
	}
	public static void deleteBooks() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Book Number:");
			int number = input.nextInt();
		}
	}
	public static void checkStatus() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Book Number:");
			int number = input.nextInt();
		}
	}
	public static void viewlocation() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Book Number:");
			int number = input.nextInt();
		}
	}
}
