package gui;

import javax.swing.*;
import java.awt.event.*;

public class TextAreaExample implements ActionListener
{
	//variables
	JLabel l1, l2;
	JTextArea ta;
	JButton b;
	
	TextAreaExample()
	{
		JFrame f = new JFrame();
		
		//word count
		l1 = new JLabel();
		l1.setBounds(50,25,100,30);
		
		//character count
		l2 = new JLabel();
		l2.setBounds(160,25,100,30);
		
		//text area
		ta = new JTextArea();
		ta.setBounds(20,75,250,200);
		ta.setLineWrap(true);
		
		//count button
		b = new JButton("Count Words");
		b.setBounds(100,300,120,30);
		b.addActionListener(this);
		
		//add components
		f.add(l1);
		f.add(l2);
		f.add(ta);
		f.add(b);
		
		//jframe layout
		f.setSize(450,450);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//count words button
		if(e.getSource() == b)
		{
			String text = ta.getText();
			String words[] = text.split("\\s+");
			
			//label 1
			if(text.length() != 0) l1.setText("Words: " + words.length);
			else l1.setText("Words: 0");
			
			//label 2
			l2.setText("Characters: " + text.length());
		}
	}
	
	public static void main(String[] args) { new TextAreaExample(); }
}
