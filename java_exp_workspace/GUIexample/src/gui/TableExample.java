package gui;

import javax.swing.*;
import javax.swing.event.*;

public class TableExample extends JFrame implements ListSelectionListener
{
	private static final long serialVersionUID = 1L;
	String col[] = {"ID","NAME","SALARY"};
	String data[][] = { {"101","Amit","670000"},
						{"102","Jai","780000"},
						{"103","Sachin","700000"} };
	JTable jt;
	TableExample()
	{
		//set jframe title
		setTitle("Table Example");
		
		//jtable
		jt = new JTable(data,col);
		jt.setCellSelectionEnabled(true);
		
		//list selector
		ListSelectionModel s = jt.getSelectionModel();
		s.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		s.addListSelectionListener(this);
		
		//scroll pane
		JScrollPane sp = new JScrollPane(jt);
		
		//add component
		add(sp);
		
		//jframe layout
		setSize(300,200);
		setVisible(true);
	}

	@Override
	public void valueChanged(ListSelectionEvent e)
	{
		String sel = "";
		int[] rows = jt.getSelectedRows();
		int[] cols = jt.getSelectedColumns();
		
		for(int i = 0; i < rows.length; i++)
		{
			for(int j = 0; j < cols.length; j++)
			{
				sel = jt.getValueAt(rows[i], cols[j]).toString();
			}
		}
		JOptionPane.showMessageDialog(this, sel);
	}
	
	public static void main(String[] args) { new TableExample(); }
}
