package gui;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BookAdder extends JFrame{
   
   public BookAdder() {
      JPanel panel = new JPanel();
      panel.setLayout(new SpringLayout());
      
      JLabel labelName = new JLabel("Book name: ", JLabel.TRAILING);
      JTextField fieldName = new JTextField(10);
      labelName.setLabelFor(fieldName);
      panel.add(labelName);
      panel.add(fieldName);
      
      JLabel labelAuthor = new JLabel("Author: ", JLabel.TRAILING);
      JTextField fieldAuthor = new JTextField(10);
      labelAuthor.setLabelFor(fieldAuthor);
      panel.add(labelAuthor);
      panel.add(fieldAuthor);
      
      JLabel labelGenre = new JLabel("Genre: ", JLabel.TRAILING);
      JTextField fieldGenre = new JTextField(10);
      labelGenre.setLabelFor(fieldGenre);
      panel.add(labelGenre);
      panel.add(fieldGenre);
      
      panel.add(new JButton("save"));
      panel.add(new JButton("cancel"));
      
      SpringUtilities.makeCompactGrid(panel, 4, 2, 6,6,6,6);
      
      this.setSize(300, 300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setContentPane(panel);
      this.setVisible(true);
      
   }
}