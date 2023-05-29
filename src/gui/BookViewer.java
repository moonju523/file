package gui;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.table.TableColumn;


public class BookViewer extends JFrame{

   public BookViewer() {
      
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn("Book Name");
      model.addColumn("Author");
      model.addColumn("Genre");
      
      JTable table = new JTable(model);
      JScrollPane sp=new JScrollPane(table);
      
      this.add(sp);
      this.setSize(300, 300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
   }
}