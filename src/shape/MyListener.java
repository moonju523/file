package shape;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyListener implements MouseListener{
	@Override
	public void mouseClicked(MouseEvent e) {
		JPanel panel = new JPanel();
		if (e.getButton() == MouseEvent.BUTTON1) {  // 좌클릭 버튼
            Graphics g = panel.getGraphics();
            g.drawRect(e.getX(), e.getY(), 20, 20);
        }
	}@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed");
	}@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released");
	}@Override 
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered");
	}@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited");
	}
}