package school;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tester {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("text.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String s = bufferedReader.readLine();
			System.out.println(s);
			bufferedReader.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}