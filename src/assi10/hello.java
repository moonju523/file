package assi10;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class hello {
	public static void main(String[] args){
		JFrame f = new JFrame("title");
		JPanel p = new JPanel();
		JButton b = new JButton("press me");
		JTextField tf= new JTextField("type here");
		p.add(b);// add button to panel
		p.add(tf);// add textfield to panel
		f.setContentPane(p);    // add panel to frame
		f.setVisible(true);
	}
}