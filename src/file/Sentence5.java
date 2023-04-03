package file;

import java.util.ArrayList;

import java.util.Scanner;

public class Sentence5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> set = new ArrayList<>();
		
		System.out.println("노래가사:");
		String str = scanner.nextLine();
		set.add(str);
		
		System.out.println("갯수 :"+ set.size());
			
		for(int i =0;i<set.size();i++)
		{
			System.out.print(set.get(i));
		}
		System.out.println();

	}

}
