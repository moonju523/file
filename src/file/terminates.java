package file;
import java.util.Scanner;
public class terminates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int day,hour,minute,seconds;
		System.out.print("숫자 입력:");
		int count = scanner.nextInt();

		day=count/86400;
		hour=(count%86400)/3600;
		minute=((count%86400)%3600)/60;
		seconds=((count%86400)%3600)%60;
			
		System.out.printf("%d일",day);
		System.out.printf("%d시간",hour);	
		System.out.printf("%d분",minute);	
		System.out.printf("%d초",seconds);
		scanner.close();
		System.out.println();
		
		if (count>31536000) { //31536000 : 1년을 초로 나타낸 숫자
			System.out.printf("1년을 넘습니다.");
		}
		else
			System.out.printf("1년을 넘지 않습니다.");
	}
}