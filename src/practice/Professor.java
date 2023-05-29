package practice;

public class Professor extends People{
	private int office;
	
	public void setOffice(int no)
	{
		this.office = no;
	}
	
	public void professorPrint()
	{
		System.out.println("---교수---");
		peoplePrint();
		System.out.println("사무실:"+ this.office);
	}

}
