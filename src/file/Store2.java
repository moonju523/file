package file;
import java.util.*;
public class Store2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		char []number = new char[45];
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("노래가사:");
			for (char num=0;num<number.length;num++)
			{
				char inputData = (char) input.nextInt();
				set.add("num") = inputData;
			}
		}
		
		System.out.println("입력받은거:");
		for(char data : number)
		{
			System.out.print(data +" ");
		}

	}

}