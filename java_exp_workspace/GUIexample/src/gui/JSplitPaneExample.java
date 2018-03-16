package gui;

import java.awt.*;
import javax.swing.*;

public class JSplitPaneExample extends JFrame
{
	private static final long serialVersionUID = 1L;
	String[] opt1 = {"A","B","C","D","E"}, opt2 = {"1","2","3","4","5"};
	JComboBox<String> b1, b2;
	Panel p1,p2;
	JSplitPane sp;
	
	JSplitPaneExample()
	{
		//jframe title
		super("JSpltiPane Example");
		
		//combo box
		b1 = new JComboBox<>(opt1);
		b2 = new JComboBox<>(opt2);
		
		//panel
		p1 = new Panel();
		p1.add(b1);
		p2 = new Panel();
		p2.add(b2);
		
		//split pane
		//horizontal
		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1,p2);
		//vertical
		//sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, p1,p2);
		
		//add components
		add(sp);
		
		//jframe layout
		setLayout(new FlowLayout());
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) { new JSplitPaneExample(); }
}
