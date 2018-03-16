package gui;

import javax.swing.*;
import java.awt.*;

public class SeparatorExample extends JFrame
{
	//variables
	private static final long serialVersionUID = 1L;
	JLabel top, bot;
	JSeparator s;
	
	SeparatorExample()
	{
		//jframe title and layout
		setTitle("Separator Example");
		setLayout(new GridLayout(0,1));
		
		//initialize components
		top = new JLabel("Above the separator");
		bot = new JLabel("Below the separator");
		s = new JSeparator();
		
		//add components
		add(top);
		add(s);
		add(bot);
		
		//jframe size and visability
		setSize(400,100);
		setVisible(true);
	}
	
	public static void main(String[] args) { new SeparatorExample(); }
}
