package gui;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class JToggleButtonExample extends JFrame implements ItemListener
{
	//variables
	private static final long serialVersionUID = 1L;
	JToggleButton tb;
	
	JToggleButtonExample()
	{
		setTitle("JToggleButton with ItemListener Example");
		setLayout(new FlowLayout());
		
		//initialize toggle button & action listener
		setJToggleButton();
		setAction();
		
		//jframe layout
		setSize(200,200);
		setVisible(true);
	}

	private void setJToggleButton() { tb = new JToggleButton("ON"); add(tb); }
	
	private void setAction() { tb.addItemListener(this); }
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if(tb.isSelected()) tb.setText("OFF");
		else tb.setText("ON");	
	}
	
	public static void main(String[] args) { new JToggleButtonExample(); }
}
