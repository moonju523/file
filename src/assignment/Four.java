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
	private static Car con;

	public static void main(String[] args) {
		con = new Car();
		
		con.setYear(2015);
		con.setMaker("Honda");
		con.setSpeed(85.0);
		
		System.out.println("년도:"+ con.getYear());
		System.out.println("만든 회사:" + con.getMaker());
		System.out.println("속도:" + con.getSpeed());
	}
}
