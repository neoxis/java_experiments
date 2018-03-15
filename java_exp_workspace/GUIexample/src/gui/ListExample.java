package gui;

import javax.swing.*;
import java.awt.event.*;

public class ListExample extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JLabel l;
	JButton b;
	DefaultListModel<String> list1 = new DefaultListModel<>();
	DefaultListModel<String> list2 = new DefaultListModel<>();
	JList<String> l1, l2;
	
	ListExample()
	{
		setTitle("List Example");
		
		fill();
		
		l = new JLabel();
		l.setSize(500,100);
		
		b = new JButton("Show");
		b.setBounds(200,150,80,30);
		b.addActionListener(this);
		
		l1.setBounds(100,100,75,75);
		l2.setBounds(100,200,75,75);
		
		add(l);
		add(l1);
		add(l2);
		add(b);
		
		setSize(450,450);
		setLayout(null);
		setVisible(true);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String data = "";
		if(l1.getSelectedIndex() != -1)
		{
			data = "Programming language: " + l1.getSelectedValue();
			l.setText(data);
		}
		if(l2.getSelectedIndex() != -1)
		{
			data += "| Framework: ";
			for(Object f: l2.getSelectedValues()) data += f + " ";
		}
		l.setText(data);
	}
	
	private void fill()
	{
		String l_1[] = {"C","C++","Java","PHP"};
		String l_2[] = {"Turbo C++","Struts","Spring","YII"};
		for(int i = 0; i < 4; i++)
		{
			list1.addElement(l_1[i]);
			list2.addElement(l_2[i]);
		}
		
		l1 = new JList<>(list1);
		l2 = new JList<>(list2);
	}
	public static void main(String[] args) { new ListExample(); }
}
