package file;

public class Lab1 {

	public static void main(String[] args) {
		for (int i=2;i<10;i++) {
			for (int j=1;j<10;j++) {
				if(i==5) {
					continue;
				}	
				System.out.print(i+"x"+j+"="+ i*j+"\t");
			}
			System.out.println();
        }
	}
}

	

