package shape;  

import javax.swing.*;
public class FrameTest3{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame Test");
		JPanel panel = new JPanel();
		JButton button = new JButton("click me");
		JLabel label = new JLabel("example:");
		
		
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
}