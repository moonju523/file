package school;

import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Tester3 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos= new FileOutputStream("ot.bak");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			Point p = new Point();
			oos.writeObject(p);
			oos.close();
			fos.close();
		}catch(FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
