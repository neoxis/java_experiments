package gui;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

public class TextExamples implements ActionListener
{
	//text fields & buttons
	JTextField tf_1,tf_2,tf_3;
	JButton b1, b2, b3, b4;
	
	//textexamples jframe object
	TextExamples()
	{
		JFrame f = new JFrame();
		
		//text field 1
		tf_1 = new JTextField();
		tf_1.setBounds(50,50,200,20);
		
		//text field 2
		tf_2 = new JTextField();
		tf_2.setBounds(50,100,200,20);
		
		//text field 3
		tf_3 = new JTextField();
		tf_3.setBounds(50,150,200,20);
		
		//addition button
		b1 = new JButton("+");
		b1.setBounds(50, 200, 50, 50);
		b1.setFont(new Font("Arial", Font.PLAIN, 25));
		
		//subtraction button
		b2 = new JButton("-");
		b2.setBounds(100, 200, 50, 50);
		b2.setFont(new Font("Arial", Font.PLAIN, 25));
		
		//multiplication button
		b3 = new JButton("*");
		b3.setBounds(150, 200, 50, 50);
		b3.setFont(new Font("Arial", Font.PLAIN, 25));
		
		//division button
		b4 = new JButton("/");
		b4.setBounds(200, 200, 50, 50);
		b4.setFont(new Font("Arial", Font.PLAIN, 25));
		
		//add action listener
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
		//add components
		f.add(tf_1);
		f.add(tf_2);
		f.add(tf_3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		//jframe layout
		f.setSize(350,350);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		double a = Double.parseDouble(tf_1.getText());	//input a
		double b = Double.parseDouble(tf_2.getText());	//input b
		double c = 0;									//output c
		
		if(e.getSource() == b1) c=a+b;					//add
		else if(e.getSource() == b2) c=a-b;				//subtract
		else if(e.getSource() == b3) c=a*b;				//multiply
		else if(e.getSource() == b4) c=a/b;				//divide
		
		tf_3.setText(String.valueOf(c));				//set output text
	}

	public static void main(String[] args) { new TextExamples(); }
}
