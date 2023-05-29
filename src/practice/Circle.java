package practice;

public class Circle implements Shape {

	@Override
	public void getArea() {
		int i=5;
		double Circle = i * i *3.14;
		System.out.println("원의 크기:"+ Circle);

	}

	public static void main(String[] args) {
		Shape sha[] = new Shape[3];
		sha[2].getArea();
	}
}
