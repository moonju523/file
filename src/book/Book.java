package book;

import java.util.Scanner;

public class Book {
	protected Bookgenre genre = Bookgenre.Novel; //책의 장르는 소설 -기본값
	protected String name;
	protected int number;
	
	public Book(String name, int number, Bookgenre genre) {
		this.name = name;
		this.number = number;
		this.genre = genre;
	}
	
	public Bookgenre getGenre() {
		return genre;
	}
	public void setGenre(Bookgenre genre) {
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public void printInfo() {
		System.out.println("name"+name+"number"+number);
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
