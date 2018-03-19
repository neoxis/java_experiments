package gui;

import java.awt.Color;

import javax.swing.*;

public class ColorExample extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	
	ColorExample()
	{
		super("Color (Built-in) Example");
		
		//row 1
		Color r1c[] = { Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY };
		String r1s[] = {"Black","Blue","Cyan","Dark Gray","Gray"};
		row(0,r1c,r1s);
		
		//row 2
		Color r2c[] = { Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK };
		String r2s[] = {"Green","Light Gray","Magenta","Orange","Pink"};
		row(50,r2c,r2s);
		
		//row 3 -ran out of built in colors
		Color r3c[] = { Color.RED, Color.WHITE, Color.YELLOW, Color.BLACK, Color.BLUE };
		String r3s[] = {"Red","White","Yellow","Black","Blue"};
		row(100,r3c,r3s);
		
		//jframe layout
		setLayout(null);
		setSize(505,195);
		setResizable(false);
		setVisible(true);
	}
	
	public void row(int y, Color c[], String s[])
	{
		JButton b[] = new JButton[5];
		
		for(int i = 0; i < 5; i++)
		{
			b[i] = new JButton();
			b[i].setBounds(i*100,y,100,50);
			b[i].setBackground(c[i]);
			b[i].setToolTipText(s[i]);
			add(b[i]);
		}
	}
	
	public static void main(String[] args) { new ColorExample(); }
}
