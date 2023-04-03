package file;
import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		String str;
		int cnt = 0; int i;//
		System.out.println("노래가사:");//0
		Scanner sc = new Scanner(System.in);//0
		str = sc.nextLine();//0
		
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