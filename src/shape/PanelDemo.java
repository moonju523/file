package shape;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelDemo extends JFrame{
	JPanel p1= new JPanel();
	JPanel p2= new JPanel();
	public PanelDemo() {
		super("Panel demo");
		p1.add(new JButton("JButton")); 
		p1.add(new JButton("JButton"));  
		p2.add(new JTextArea("JTextArea")); 
		Container cp= getContentPane();
		cp.add(p1, BorderLayout.NORTH);
		cp.add(p2, BorderLayout.CENTER);
		pack(); 
	}
}
