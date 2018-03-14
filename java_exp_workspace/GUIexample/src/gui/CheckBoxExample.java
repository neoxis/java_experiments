package gui;

import javax.swing.*;
import java.awt.event.*;

public class CheckBoxExample extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	//variables
	JLabel l;
	JCheckBox cb1, cb2, cb3;
	JRadioButton rb1, rb2, rb3;
	JButton b;

	CheckBoxExample()
	{
		//title label
		l = new JLabel("Food Ordering System");
		l.setBounds(50,50,300,20);
		
		//pizza check box
		cb1 = new JCheckBox("Pizza 2.00");
		cb1.setBounds(100,100,150,20);
		
		//pizza radio button
		rb1 = new JRadioButton();
		rb1.setBounds(50,100,50,20);
		
		//burger check box
		cb2 = new JCheckBox("Burger 3.50");
		cb2.setBounds(100,150,150,20);
		
		//burger radio button
		rb2 = new JRadioButton();
		rb2.setBounds(50,150,50,20);
		
		//tea check box
		cb3 = new JCheckBox("Tea 1.50");
		cb3.setBounds(100,200,150,20);
		
		//tea radio button
		rb3 = new JRadioButton();
		rb3.setBounds(50,200,50,20);
		
		//order button
		b = new JButton("Order");
		b.setBounds(100, 250, 80, 30);
		b.addActionListener(this);
		
		//add components
		add(l);
		add(cb1);
		add(rb1);
		add(cb2);
		add(rb2);
		add(cb3);
		add(rb3);
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
			
			//pizza
			if(cb1.isSelected() || rb1.isSelected())
			{
				if(cb1.isSelected() && rb1.isSelected()) { amount += 2*(2.00); order += "2 x Pizza: 4.00\n"; }
				else { amount += 2.00; order += "Pizza: 2.00\n"; }
			}
			//burger
			if(cb2.isSelected() || rb2.isSelected())
			{
				if(cb2.isSelected() && rb2.isSelected()) { amount += 2*(3.50); order += "2 x Burger: 7.00\n"; }
				else {amount += 3.50; order += "Burger: 3.50\n"; }
			}
			//tea
			if(cb3.isSelected() || rb3.isSelected())
			{
				if(cb3.isSelected() && rb3.isSelected()) { amount += 2*(1.50); order += "2 x Tea: 1.50\n"; }
				else { amount += 1.50; order += "Tea: 1.50\n"; }
			}
			
			order += "--------------------\n";
			JOptionPane.showMessageDialog(this, order + "Total: " + String.format("%.02f", amount)); //show order in 2 decimal places
		}
		
	}

	public static void main(String[] args) { new CheckBoxExample(); }
}
