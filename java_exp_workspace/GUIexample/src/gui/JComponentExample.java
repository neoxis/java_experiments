package gui;

import java.awt.*;
import javax.swing.*;

//java can not inherit two from two classes
public class JComponentExample extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	JComponentExample()
	{
		//my j component
		MyJComponent mc = new MyJComponent();
		//JFrame.setDefaultLookAndFeelDecorated(true);
		setTitle("JComponent Example");
		
		//add components
		add(mc);
		
		//jframe layout
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) { new JComponentExample(); }
}

class MyJComponent extends JComponent
{
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) { g.setColor(Color.GREEN); g.fillRect(30, 30, 100, 100); }
}
