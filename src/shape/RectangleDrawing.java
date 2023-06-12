package shape;

import javax.swing.JPanel;
import java.awt.Graphics;

import javax.swing.*;
import java.awt.*;

public class RectangleDrawing extends JFrame {
    private JPanel panel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RectangleDrawing::new);
    }
}

