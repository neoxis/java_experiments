package gui;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample extends JFrame
{
	private static final long serialVersionUID = 1L;
	DefaultMutableTreeNode style, color, font, red, blue, black, green;;
	JTree t;
	
	TreeExample()
	{
		//initialize
		init();
		
		//tree structure
		t = new JTree(style);
		
		//add components
		add(t);
		
		//jframe layout
		setSize(200,200);
		setVisible(true);
	}
	
	private void init()
	{
		/**
		 * Initialize
		 */
		//main
		style = new DefaultMutableTreeNode("Style");
		color = new DefaultMutableTreeNode("color");
		font = new DefaultMutableTreeNode("font");
		//colors
		red = new DefaultMutableTreeNode("red");
		blue = new DefaultMutableTreeNode("blue");
		black = new DefaultMutableTreeNode("black");
		green = new DefaultMutableTreeNode("green");
		
		/**
		 * Add nodes
		 */
		//style
		style.add(color);
		style.add(font);
		//color
		color.add(red);
		color.add(blue);
		color.add(black);
		color.add(green);
		
	}
	
	public static void main(String[] args) { new TreeExample(); }

}
