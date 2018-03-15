package gui;

import java.awt.event.*;
import javax.swing.*;

public class CheckBoxMenuItem extends JFrame implements ActionListener
{
	//variables
	private static final long serialVersionUID = 1L;
	JMenuBar mb;
	JMenu file;
	JCheckBoxMenuItem cmi;
	JMenuItem o;
	
	CheckBoxMenuItem()
	{
		//jframe title
		setTitle("Jmenu Example");
		
		//menu bar
		mb = new JMenuBar();
		//file menu
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		mb.add(file);
		
		//open menu item
		o = new JMenuItem("Open", KeyEvent.VK_N);
		file.add(o);
		
		//check box menu item
		cmi = new JCheckBoxMenuItem("Option_1");
		file.add(cmi);
		cmi.addActionListener(this);
		
		//jframe layout
		setJMenuBar(mb);
		setSize(350,250);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		AbstractButton ab = (AbstractButton) e.getSource();
		boolean sel = ab.getModel().isSelected();
		String val;
		if(sel) val = "Value-1";
		else val = "Value-2";
		ab.setText(val);
	}
	
	public static void main(String[] args) { new CheckBoxMenuItem(); }
}
