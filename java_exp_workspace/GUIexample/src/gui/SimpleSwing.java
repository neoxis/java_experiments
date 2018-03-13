package gui;

import javax.swing.*;

public class SimpleSwing
{
	public static void main(String[] args)
	{
		//create J frame instance
		JFrame f = new JFrame();
		
		//create button instance
		JButton b = new JButton("click");
		
		//button location and size
		b.setBounds(130, 100, 100, 40);
		
		//add button to J frame
		f.add(b);
		
		//set J frame size
		f.setSize(400,500);
		
		//no layout manager
		f.setLayout(null);
		
		//make J frame visible
		f.setVisible(true);

	}

}
