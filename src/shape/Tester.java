package shape;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tester {
	public static void main(String[] args) {
		JFrame f = new JFrame("title");
		JPanel p = new JPanel( );
		JButton b = new JButton("press me");
		f.setSize(300, 200);
	
		p.setLayout(null);

		p.add(b);
		f.setContentPane(p);
		f.setVisible(true);
	}
}