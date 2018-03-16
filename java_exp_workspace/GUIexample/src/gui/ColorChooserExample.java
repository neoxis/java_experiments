package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserExample extends JFrame implements ActionListener
{
	//variables
	private static final long serialVersionUID = 1L;
	JButton b;
	JTextArea ta;
	
	ColorChooserExample()
	{
		//jframe title
		setTitle("Color Chooser Example");
		
		//color change button
		b = new JButton("Change Pad Color");
		b.setBounds(200,250,150,30);
		b.addActionListener(this);
		
		// text area
		ta = new JTextArea();
		ta.setBounds(10,10,350,200);
		
		//add components
		add(b);
		add(ta);
		
		//frame layout
		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Color c = JColorChooser.showDialog(this, "Color Options", Color.CYAN);
		ta.setBackground(c);
	}
	
	public static void main(String[] args) { new ColorChooserExample(); }

}
