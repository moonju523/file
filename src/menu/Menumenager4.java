package menu;

import java.util.Scanner;

public class Menumenager4 {

	public static void main(String[] args) {
		System.out.println("*** Student Management System Menu ***");
		System.out.println("0. Show a menu");
		System.out.println("1. Add Books");
		System.out.println("2. Delete Books");
		System.out.println("3. Check rental status");
		System.out.println("4. View Books Location");
		
		
	    int num = 0;
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Select one number between 0-5:");
			num = input.nextInt();
		}
        
		String[] bac = new String[5];
		String as = null;
		bac[0] = as;
		
		if(num == 0)
			System.out.println(bac[0]);
	}


}