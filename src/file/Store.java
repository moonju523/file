package file;
import java.util.*;
public class Store {

	public static void main(String[] args) {
		int []number = new int[5];
		Scanner input = new Scanner(System.in);
		
		System.out.println("노래가사:");
		for (int i=0;i<number.length;i++)
		{
			int inputData = input.nextInt();
			number[i] = inputData;
		}
		
		System.out.println("입력받은거:");
		for(int data : number)
		{
			System.out.print(data +" ");
		}

	}

}