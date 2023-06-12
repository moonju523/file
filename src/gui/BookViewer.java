package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.table.TableColumn;


public class BookViewer extends JPanel{
	
	WindowFrame frame;

   public BookViewer(WindowFrame frame) {
	   this.frame = frame;
      
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn("Book Name");
      model.addColumn("Author");
      model.addColumn("Genre");
      
      JTable table = new JTable(model);
      JScrollPane sp=new JScrollPane(table);
      
      this.add(sp);
   }
}