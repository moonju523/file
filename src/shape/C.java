package shape;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class C extends JFrame{
	public C() {
		Container cp= getContentPane();
		JButton jb= new JButton("Click here");
		JLabel jl= new JLabel("label 2");
		cp.add(jb, BorderLayout.EAST);
		cp.add(jl, BorderLayout.WEST);
		pack();
		setVisible(true);
		}
}