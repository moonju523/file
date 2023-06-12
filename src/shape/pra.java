package shape;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class pra {
	public void mouseClicked(MouseEvent e) {
		JPanel panel = new JPanel();
		Graphics g= panel.getGraphics();
		g.drawRect(e.getX(), e.getY(), 20, 20);
	}

}
