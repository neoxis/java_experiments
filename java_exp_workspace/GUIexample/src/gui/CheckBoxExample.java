package gui;

import javax.swing.*;
import java.awt.event.*;

public class CheckBoxExample extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	//variables
	JLabel l;
	JCheckBox cb1, cb2, cb3;
	JButton b;

	CheckBoxExample()
	{
		//title label
		l = new JLabel("Food Ordering System");
		l.setBounds(50,50,300,20);
		
		//pizza check box
		cb1 = new JCheckBox("Pizza 2.00");
		cb1.setBounds(100,100,150,20);
		
		//burger check box
		cb2 = new JCheckBox("Burger 3.50");
		cb2.setBounds(100,150,150,20);
		
		//tea check box
		cb3 = new JCheckBox("Tea 1.50");
		cb3.setBounds(100,200,150,20);
		
		//order button
		b = new JButton("Order");
		b.setBounds(100, 250, 80, 30);
		b.addActionListener(this);
		
		//add components
		add(l);
		add(cb1);
		add(cb2);
		add(cb3);
		add(b);
		
		//jframe layout
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//order button
		if(e.getSource() == b)
		{
			float amount = 0;
			String order = "";
			if(cb1.isSelected()) {amount += 2.00; order += "Pizza: 2.00\n"; }
			if(cb2.isSelected()) {amount += 3.50; order += "Burger: 3.50\n"; }
			if(cb3.isSelected()) {amount += 1.50; order += "Tea: 1.50\n"; }
			
			order += "--------------------\n";
			JOptionPane.showMessageDialog(this, order + "Total: " + amount);
		}
		
	}

	public static void main(String[] args) { new CheckBoxExample(); }
}
