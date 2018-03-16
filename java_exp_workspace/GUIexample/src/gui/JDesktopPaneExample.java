package gui;

import java.awt.*;
import javax.swing.*;

public class JDesktopPaneExample extends JFrame
{
	private static final long serialVersionUID = 1L;

	JDesktopPaneExample()
	{
		//jframe title
		super("JDesktopPane Example");
		
		// desktop pane
		CustomDesktopPane dp = new CustomDesktopPane();
		Container cp = getContentPane();
		cp.add(dp, BorderLayout.CENTER);
		dp.display(dp);
		
		//jframe layout
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) { new JDesktopPaneExample(); }
}

class CustomDesktopPane extends JDesktopPane
{
	private static final long serialVersionUID = 1L;
	int frames = 3, x = 30, y = 30;
	
	public void display(CustomDesktopPane cdp)
	{
		for(int i = 0; i < frames; i++)
		{
			//internal frames
			JInternalFrame f = new JInternalFrame("Internal Frame " + i,true,true,true,true);
			f.setBounds(x, y+(i*85), 250, 85); //increment y
			
			//add frame to container
			Container c = f.getContentPane();
			c.add(new Label("Move me around!"));
			
			//add component
			cdp.add(f);
			
			//set visibility
			f.setVisible(true);
		}
	}
}