package practice;

public class Student extends People{
	private int id;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void studentPrint()
	{
		System.out.println("---학생---");
		peoplePrint();
		System.out.println("학번:"+ this.id);
	}
}
