package gui;

import javax.swing.*;
import java.text.*;
import java.util.*;

public class DigitalWatch extends JFrame implements Runnable
{
	//variables
	private static final long serialVersionUID = 1L;
	Thread t;
	String time;
	JButton b;
	
	DigitalWatch()
	{
		//thread
		t = new Thread(this);
		t.start();
		
		//button
		b = new JButton();
		b.setBounds(100, 100, 100, 50);
		
		//add components
		add(b);
		
		//jframe layout
		setSize(300,400);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void run()
	{
		try
		{
			while(true)
			{
				//get system calendar instance
				Calendar cal = Calendar.getInstance();
				
				//format time
				SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
				Date date = cal.getTime();
				time = sdf.format(date);
			
				//change button text
				b.setText(time);
				
				//sleep
				Thread.sleep(1000);	//milliseconds
			}
		}
		catch(Exception e) { }
		
	}
	
	public static void main(String[] args) { new DigitalWatch(); }
}
