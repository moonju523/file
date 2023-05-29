package practice;

public class Triangle implements Shape {
	@Override
	public void getArea() {
		int i=3 ,j=4;
		int Triangle = i*j/2;
		System.out.println("삼각형의 크기:"+ Triangle);
	}

	public static void main(String[] args) { 
		Shape sha[] = new Shape[3];
		sha[0].getArea();
	}

}
