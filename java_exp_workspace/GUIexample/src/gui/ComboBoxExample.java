package gui;

import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample implements ActionListener
{
	//variables
	final JLabel l;
	JButton b;
	final JComboBox<String> cb;

	ComboBoxExample()
	{
		JFrame f = new JFrame("ComboBox Example");
		
		//selection label
		l = new JLabel();
		//l.setBounds(50,50,165,20);
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(400,100);
		
		//show button
		b = new JButton("Show");
		b.setBounds(200,100,75,20);
		b.addActionListener(this);
		
		//language combo box
		String langs[] = {"C","C++","C#","HTML","Java","JavaScript","PHP"};
		cb = new JComboBox<>(langs);
		cb.setBounds(50,100,90,20);
		
		//add components
		f.add(cb);
		f.add(l);
		f.add(b);
		
		//jframe layout
		f.setLayout(null);
		f.setSize(350, 350);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//show
		if(e.getSource() == b)
		{
			String data = "Programming Language Selected: " + cb.getItemAt(cb.getSelectedIndex());
			l.setText(data);
		}
	}
	
	public static void main(String[] args) { new ComboBoxExample(); }
}
