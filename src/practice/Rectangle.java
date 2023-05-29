package practice;

public class Rectangle implements Shape {

	@Override
	public void getArea() {
		int i=4 ,j=4;
		int Rectangle = i*j;
		System.out.println("사각형의 크기:"+Rectangle);

	}

	public static void main(String[] args) {
		Shape sha[] = new Shape[3];
		sha[1].getArea();
	}
}
