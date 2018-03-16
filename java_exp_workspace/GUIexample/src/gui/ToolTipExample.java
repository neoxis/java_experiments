package gui;

import javax.swing.*;

public class ToolTipExample extends JFrame
{
	private static final long serialVersionUID = 1L;

	ToolTipExample()
	{
		//jframe title
		super("Password Field Example");
		
		//password entry field
		JPasswordField pass = new JPasswordField();
		pass.setBounds(100,100,100,30);
		pass.setToolTipText("Enter your password");
		
		//password label
		JLabel l = new JLabel("Password:");
		l.setBounds(20,100,80,30);
		
		//add components
		add(pass);
		add(l);
		
		//jframe layout
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) { new ToolTipExample(); }

}
