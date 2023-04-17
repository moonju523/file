package file;
import java.util.Scanner;
import java.util.*; 
public class Sentence2 { 
	public static void main(String args[]) { 
		HashSet<String> set = new HashSet<String>(); 
		
		char num = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("노래가사:");
		num = (char) input.nextInt();
		
			
		set.add("Milk"); 
		set.add("Bread"); 
		set.add("Butter"); 
		set.add("Cheese"); 
		set.add("Ham"); 
		set.add("Ham"); 
		System.out.println(set);
	
	} 
}