package file;

public class Scope {

	public static void main(String[] args) {
		int a=45;
		System.out.println("1:"+a);
		{
			a = 64;//ERROR! 메모리공간에 같은 블럭에서는 또다른(새로운) 공간을 잡을 수 없다 int a를 하게되면 에러가 난다.a라는 변수가 유효한 공간을 만들수없음.
			System.out.println("2:"+a);
		}

	}

}
