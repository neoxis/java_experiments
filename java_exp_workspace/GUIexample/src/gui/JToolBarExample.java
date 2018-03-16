package gui;

import javax.swing.*;
import java.awt.*;

public class JToolBarExample extends JFrame
{
	private static final long serialVersionUID = 1L;
	JToolBar tb;
	JButton b;
	Container c;
	JTextArea ta;
	JScrollPane sp;
	
	JToolBarExample()
	{
		//jframe title
		setTitle("JToolBar Example");
		
		//file button
		b = new JButton("File");
		
		//tool bar
		tb = new JToolBar();
		tb.setRollover(true);
		tb.add(b);
		//edit button
		tb.add(new JButton("Edit"));
		//combo box dropdown
		tb.add(new JComboBox<>(new String[] {"One","Two","Three","Four"}));
		
		//text area
		ta = new JTextArea();
		sp = new JScrollPane(ta);
		
		//add components
		c = this.getContentPane();
		c.add(tb, BorderLayout.NORTH);
		c.add(sp, BorderLayout.EAST);
		
		//jframe layout
		setSize(450,250);
		setVisible(true);
	}
	
	public static void main(String[] args) { new JToolBarExample(); }
}
