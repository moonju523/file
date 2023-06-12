package shape;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyListener1 implements MouseListener{
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered");
	} 
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited");
	}
}