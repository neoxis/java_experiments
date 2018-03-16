package gui;

import javax.swing.*;

public class ProgressBarExample extends JFrame
{
	//variables
	private static final long serialVersionUID = 1L;
	JProgressBar pb;
	int i = 0, num = 0;
	
	ProgressBarExample()
	{
		//progress bar
		pb = new JProgressBar(0,2000);
		pb.setBounds(40,40,160,30);
		pb.setValue(0);
		pb.setStringPainted(true);
		
		//add components
		add(pb);
		
		//jframe layout
		setSize(250,150);
		setLayout(null);
		setVisible(true);
	}
	
	//increments the progress bar
	public void iterate()
	{
		while(i<= 2000)
		{
			pb.setValue(i+=20);
			try { Thread.sleep(150); } catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) { new ProgressBarExample().iterate(); }

}
