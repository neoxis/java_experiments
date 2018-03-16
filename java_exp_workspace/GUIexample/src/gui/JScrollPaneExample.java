package gui;

import java.awt.*;
import javax.swing.*;

public class JScrollPaneExample extends JFrame
{
	private static final long serialVersionUID = 1L;

	JScrollPaneExample()
	{
		//jframe title
		super("Scroll Pane Example");
		
		JTextArea ta = new JTextArea(20,20);
		JScrollPane sp = new JScrollPane(ta);
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		//add components
		add(sp);
		
		//jframe layout
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) { new JScrollPaneExample(); }
}
