package shape;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		JButton button= new JButton("BUTTON");
		this.add(button);
		setVisible(true);
	
		button.addActionListener(new MyListener());
		this.add(button);
	}
}

