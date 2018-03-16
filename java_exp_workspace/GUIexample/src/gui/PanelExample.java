package gui;

import java.awt.*;
import javax.swing.*;

public class PanelExample extends JFrame
{
	private static final long serialVersionUID = 1L;
	JPanel p;
	JButton b1, b2;
	
	PanelExample()
	{
		//jframe title
		setTitle("Panel Example");
		
		//panel
		p = new JPanel();
		p.setBounds(40,80,200,200);
		p.setBackground(Color.GRAY);
		
		//button 1
		b1 = new JButton("Button 1");
		b1.setBounds(50,100,80,30);
		b1.setBackground(Color.yellow);
		
		//button 2
		b2 = new JButton("Button 2");
		b2.setBounds(100,100,80,30);
		b2.setBackground(Color.GREEN);
		
		//add buttons to panel
		p.add(b1);
		p.add(b2);
		
		//add components
		add(p);
		
		//jframe layout
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) { new PanelExample(); }
}
