package file;

import java.util.ArrayList;

import java.util.Scanner;

public class Sentence6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("select:");
		num = input.nextInt();
		if(num == 1) 
			count();
		
		ArrayList<String> set = new ArrayList<>();
		
		System.out.println("노래가사:");
		String str = scanner.nextLine();
		String[] words = str.split("\\s");
		set.add(str);
		
		
		for (String wo : words ){
			System.out.println(wo);
		}
		System.out.println();

	}
	
	public static void count() {
		String str;
		int cnt = 0; int i;//
		System.out.println("노래가사:");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		str =str.replaceAll(" +"," ");
		str = str.trim();
		
		for(i = 0; i<str.length();i++) {
			if(' ' == str.charAt(i))
				cnt++;
		}
		if(i != 0)cnt++;
		System.out.println("갯수 :"+ cnt);
		
	}

}
