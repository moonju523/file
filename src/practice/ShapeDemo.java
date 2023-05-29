package practice;

public class ShapeDemo {

	public static void main(String[] args) {
		int size;
		Shape sha[] = new Shape[3];
		sha[0] = new Triangle();
		sha[1] = new Rectangle();
		sha[2] = new Circle();
		
		for (int i = 0; i<3; i++)
		{
			sha[i].getArea();
		}
	}
}
