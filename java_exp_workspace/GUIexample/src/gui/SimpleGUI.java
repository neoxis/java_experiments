package gui;

import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI
{
	private static boolean b_opt = false; //boolean for text toggle
	public static void main(String[] args)
	{
		//jframe panel
		JFrame f = new JFrame("Swing Examples");
		
		JLabel l = new JLabel("Experiment 1 - Toggle Text");
		l.setBounds(50,0,200,20);
		
		//text field
		final JTextField tf = new JTextField();
		tf.setBounds(50,50,150,20);
		
		//button
		JButton b = new JButton("Click Here");
		b.setBounds(50, 100, 95, 30);
		
		//button action listener
		b.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(!b_opt) { tf.setText("Press Again To Clear"); b_opt = true; }
				else { tf.setText(""); b_opt = false; }
			}	
		});
		
		//exp 2 label
		JLabel l1 = new JLabel("Experiment 2 - Find IP Address");
		l1.setBounds(50,150,200,20);
		
		//ip text entry field
		JTextField ip_tf = new JTextField("www.");
		ip_tf.setBounds(50,200,150,20);
		
		//label for ip output
		JLabel ip_l = new JLabel("Enter web address");
		ip_l.setBounds(50,250,250,20);
		
		//find ip button
		JButton ip_b = new JButton("Find IP");
		ip_b.setBounds(50, 300, 95, 30);
		
		//ip button action listener
		ip_b.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String host = ip_tf.getText();
					String ip = java.net.InetAddress.getByName(host).getHostAddress();
					ip_l.setText("IP of " + host + " is: " + ip);
				}
				catch(Exception ex){ System.out.println(e); }		
			}
		});
		
		///////ADD STUFF//////////
		//jframe add
		f.add(l);	//ex1
		f.add(b);
		f.add(tf);
		f.add(l1);	//ex2
		f.add(ip_tf);
		f.add(ip_l);
		f.add(ip_b);
		
		//jframe layout
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
