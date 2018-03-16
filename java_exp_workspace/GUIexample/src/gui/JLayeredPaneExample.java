package gui;

import javax.swing.*;
import java.awt.*;

public class JLayeredPaneExample extends JFrame
{
	private static final long serialVersionUID = 1L;
	JLayeredPane lp;
	JButton top, mid, bot;
	
	JLayeredPaneExample()
	{
		//jframe title
		super("LayeredPane Example"); //works the same as setTitle()
		
		//initialize
		init();
		
		//jframe layout
		setSize(200,200);
		setVisible(true);
	}
	
	private void init()
	{
		/**
		 * Initialize
		 */
		//top
		top = new JButton();
		top.setBounds(20,20,50,50);
		top.setBackground(Color.WHITE);
		//middle
		mid = new JButton();
		mid.setBounds(40,40,50,50);
		mid.setBackground(Color.RED);
		//bottom
		bot = new JButton();
		bot.setBounds(60,60,50,50);
		bot.setBackground(Color.BLUE);
		//layered pane
		lp = getLayeredPane();
		
		/**
		 * Add components
		 */
		lp.add(bot, new Integer(1));
		lp.add(mid, new Integer(2));
		lp.add(top, new Integer(3));
	}
	
	public static void main(String[] args) { new JLayeredPaneExample(); }
}
