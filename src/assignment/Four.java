package assignment;

class Car{
	int year;
	String maker;
	double speed;
	
	void setYear(int number) {
		year = number;
	}
	void setMaker(String str) {
		maker = str;
	}
	void setSpeed(double count) {
		speed = count;
	}
	int getYear() {
		return year;
	}
	String getMaker() {
		return maker;
	}
	double getSpeed() {
		return speed;
	}
}

public class Four {
	private static Car constructor;

	public static void main(String[] args) {
		constructor = new Car();
		
		constructor.setYear(2015);
		constructor.setMaker("Honda");
		constructor.setSpeed(85.0);
		
		System.out.println("년도:"+ constructor.getYear());
		System.out.println("만든 회사:" + constructor.getMaker());
		System.out.println("속도:" + constructor.getSpeed());
	}
}
