package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import log.EventLogger;

import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import log.EventLogger;

public class MenuSelection extends JFrame{
   
   public MenuSelection() {
      this.setSize(300, 300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      JLabel label = new JLabel("Menu Selection");
      
      JButton button1= new JButton ("Add Books");
      JButton button2= new JButton ("Delete Books");
      JButton button3= new JButton ("Check rental status");
      JButton button4= new JButton ("View Books Location");
      JButton button5= new JButton ("Show a menu");
      JButton button6= new JButton ("Exit");
      
      
      panel1.add(label);
      
      panel2.add(button1);
      panel2.add(button2);
      panel2.add(button3);
      panel2.add(button4);
      panel2.add(button5);
      panel2.add(button6);
      
      
      this.add(panel1, BorderLayout.NORTH);
      this.add(panel2, BorderLayout.CENTER);
      
      
      this.setVisible(true);
   }
}