package gui;

import javax.swing.*;

public class JRootPaneExample extends JFrame
{
	private static final long serialVersionUID = 1L;

	JRootPaneExample()
	{
		//initialize
		JRootPane root = getRootPane();
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		
		//add menu to menu bar
		mb.add(file);
		
		//add items to file menu
		file.add("Open");
		file.add("Close");
		
		//add menu bar to root pane
		root.setJMenuBar(mb);
		
		//add button to root pane
		root.getContentPane().add(new JButton("Click Me"));
		
		//jframe layout
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) { new JRootPaneExample(); }
}
