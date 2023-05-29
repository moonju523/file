package book;

import java.util.Scanner;

public class Novel extends Book {
	
	public Novel(String name, int number, Bookgenre genre) {
		super(name, number, genre);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Book Number:");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Book Name:");
		String name = input.next();
		this.setName(name);
	}
 
}
