package practice;

public class StudentTest {
	public static void main(String[] args) {
		
		Student std = new Student();
		Professor prof = new Professor();
		
		std.setName("Kin");
		std.setId(12345);
		
		prof.setName("Pard");
		prof.setOffice(365);
		
		std.studentPrint();
		prof.professorPrint();
	}
}
