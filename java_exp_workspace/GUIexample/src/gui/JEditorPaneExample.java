package gui;

import javax.swing.*;

public class JEditorPaneExample extends JFrame
{
	private static final long serialVersionUID = 1L;

	JEditorPaneExample()
	{
		//jframe title
		super("JEditorPane Test");
		
		JEditorPane ep = new JEditorPane();
		
		/**
		 * You can also write normal text in here as well
		 * Or you can limit to only text by changing content type = text/plain
		 */
		//html example
		ep.setContentType("text/html");
		ep.setText("<h1>Wahoo! A Header</h1><p>Normal text... How amazing!?</p>");
		
		//jframe layout
		setSize(400,200);
		setContentPane(ep);
		setVisible(true);
	}
	
	public static void main(String[] args) { new JEditorPaneExample(); }

}
