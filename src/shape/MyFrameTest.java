package shape;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameTest{
	public static void main(String[] args) {
		JFrame f= new JFrame("Frame Test");
		f.setLayout(new FlowLayout());
		
		JButton button1= new JButton("press me");
		MyListener myListener= new MyListener();
		button1.addMyListener(myListener);
		f.add(button1);
		
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
