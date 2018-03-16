package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogExample extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JDialog d;
	JButton b;
	JLabel l;
	
	DialogExample()
	{
		//dialog init
		d = new JDialog(this, "Dialog Example", true);
		d.setLayout(new FlowLayout());
		
		//button
		b = new JButton("Ok");
		b.addActionListener(this);
		d.add(b);
		
		//label
		d.add(new JLabel("Click button to continue."));
		
		//dialog layout
		d.setSize(300, 300);
		d.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) { d.setVisible(false); }
	
	public static void main(String[] args) { new DialogExample(); }
}
