package gui;

import javax.swing.*;
import java.awt.event.*;

public class TextAreaExample implements ActionListener
{
	//word count variables
	JLabel l1, l2;
	JTextArea ta;
	JButton b;
	
	//password variables
	JLabel p_l1, p_l2;
	JButton p_b;
	JPasswordField pass;
	JTextField user;
	
	TextAreaExample()
	{
		JFrame f = new JFrame();
		
		/**
		 * Word Count Example
		 */
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
		
		/**
		 * Password Example
		 */
		//username label
		p_l1 = new JLabel("Username:");
		p_l1.setBounds(280,25,80,30);
		
		//username field
		user = new JTextField();
		user.setBounds(360,25,100,30);
		
		//password label
		p_l2 = new JLabel("Password:");
		p_l2.setBounds(280,75,80,30);
		
		//password field
		pass = new JPasswordField();
		pass.setBounds(360,75,100,30);
		
		//login button
		p_b = new JButton("Login");
		p_b.setBounds(360,120,80,30);
		p_b.addActionListener(this);
		
		/**
		 * Add components
		 */
		//word count
		f.add(l1);
		f.add(l2);
		f.add(ta);
		f.add(b);
		
		//password
		f.add(p_l1);
		f.add(user);
		f.add(p_l2);
		f.add(pass);
		f.add(p_b);
		
		//jframe layout
		f.setSize(600,450);
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
		//login button
		else if(e.getSource() == p_b)
		{
			l1.setText("User: " + user.getText());
			l2.setText("Pass: " + new String(pass.getPassword()));
		}
	}
	
	public static void main(String[] args) { new TextAreaExample(); }
}
