package file;
import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int coin=0;
		int sw=0;
		
		while(true) {
			System.out.printf("동전선택(H or T) :" );
			input=sc.next();
			coin=(int)(Math.random()*(2-1+1)+1);
			String str1 = "H";
			String str2 = "T";
			
			if(input == str1)
				coin = '1';
			else
				coin = '2';
			
			if(input == str2)
			{
				System.out.println("맞췄습니다!");
			}else {
				System.out.println("틀렸습니다!");
			}
			sw=Integer.parseInt(sc.nextLine());
			if(sw==2) 
				break;
		}
	}
}

	//동전 앞면 뒷면 맞추기 프로그램 작성 랜덤함수 사용 138쪽 4번 참고
	//동전 선책 (H or T):T
	//틀렸습니다.


