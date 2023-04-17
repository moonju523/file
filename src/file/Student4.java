package file;


class Student {
	String name;
	int id;
	
}

public class Student4 {
	public static void main(String[] args) {
		Student std = new Student ();
		
		std.id = 12345;
		std.name = "Kim";
			
		System.out.println("이름: " + std.name + " 학번: "+std.id);	
    }
}




