package assi10;

import javax.swing.*;
public class FrameTest{
	public static void main(String[] args) {
		JFrame frame = new JFrame("MyFrame");
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("Welcome to Java pizza. Choose the type of pizza.");
		panel.add(label1);
		
		JButton button = new JButton("Combination Pizza");
		JButton button1 = new JButton("Potato pizza");
		JButton button2 = new JButton("Roasted meat pizza");
		
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		
		frame.add(panel);
		frame.setSize(420, 150);
		
		JLabel label = new JLabel("count");
		panel.add(label);
		JTextField page= new JTextField("                 ");
		panel.add(page);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
