package file;

public class Scope2 {
	static void increaseA(int a){
		a++;
	}
	public static void main(String[]args){
		int a = 45;
		System.out.println("1:"+a);
		increaseA(a);
		System.out.println("2:"+a);
		}
}
//값이 바뀐 다음에 호출이 끝나면 a의 메소드가 사라져서 메인의 a 값만 남게되어서 45가 출력된다.