package shape;

import java.awt.*;
import javax.swing.*;

public class ComponentExample extends JFrame{
	/** Constructor: a window with title t and 5 components */
	public Component Example(String t) {
		//super(t);
		Container cp=  getContentPane();
		cp.add(new JButton("click me"), BorderLayout.EAST);
		cp.add(new JTextField("type here", 22), BorderLayout.NORTH);
		cp.add(new JCheckBox("I got up today"), BorderLayout.SOUTH);
		cp.add(new JLabel("label 2"), BorderLayout.WEST);
		cp.add(new JTextArea("type\nhere", 4, 10), BorderLayout.CENTER);
		pack();
		return cp;
		}
}