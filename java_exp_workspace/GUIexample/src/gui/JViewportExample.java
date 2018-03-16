package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class JViewportExample extends JFrame
{
	//variables
	private static final long serialVersionUID = 1L;
	JLabel l;
	JScrollPane sp;
	JButton b;
	
	JViewportExample()
	{
		//jframe title
		setTitle("Tabbed Pane Example");
		
		//label
		l = new JLabel("Label");
		l.setPreferredSize(new Dimension(1000,1000));
		
		//scroll pane
		sp = new JScrollPane(l);
		
		//button
		b = new JButton();
		
		//scroll pane
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setViewportBorder(new LineBorder(Color.RED));
		sp.getViewport().add(b, null);
		
		//jframe layout
		add(sp, BorderLayout.CENTER);
		setSize(400,150);
		setVisible(true);
	}
	
	public static void main(String[] args) { new JViewportExample(); }
}
