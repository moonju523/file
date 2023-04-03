package file;
import java.util.Scanner;
//동전 앞뒤 맞추기
//1 또는 2의 랜덤수를 추출한뒤 사용자가 입력한 값과 비교
//사용자에게 숫자값을 입력 받아서, 난수와 일치하면 맞췄습니다 틀렸습니다.
public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0;
		int coin=0;
		int sw=0;
		
		while(true) {
			System.out.println("==== 동전 앞 뒤 맞추기 ====");
			System.out.print("숫자를 입력해주세요 (1.앞면/2.뒷면) : ");
			input=Integer.parseInt(sc.nextLine());
			coin=(int)(Math.random()*(2-1+1)+1);
			
			System.out.println("-----------------------");
			if(input==1) {
				System.out.println("사용자 : 동전의 앞면을 선택했습니다.");
			}else {
				System.out.println("사용자 : 동전의 뒷면을 선택했습니다.");
			}
			
			if(coin==1) {
				System.out.println("PC : 동전의 앞면이 나왔습니다.");
			}else {
				System.out.println("PC : 동전의 뒷면이 나왔습니다.");
			}
			
			if(input==coin)
			{
				System.out.println("결과 : 맞췄습니다!");
			}else {
				System.out.println("결과 : 땡! 틀렸습니다!");
			}
			System.out.println("-----------------------");
			System.out.print("계속하시겠습니까? 1.Y / 2.N : ");
			sw=Integer.parseInt(sc.nextLine());
			if(sw==2) {
				System.out.println("동전맞추기 종료");
				break;
			}
		}
	}
}