package gui;

import javax.swing.*;
import java.awt.event.*;

public class MenuBarExample extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JMenuBar mb;
	JMenu file, edit, help;
	JMenuItem cut, copy, paste, selectAll;
	JTextArea ta;
	
	MenuBarExample()
	{
		//initialize
		init();
		
		//add components
		add(mb);
		add(ta);
		
		//jframe layout
		setJMenuBar(mb);
		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//file
		//edit
		if(e.getSource() == cut) ta.cut();
		if(e.getSource() == paste) ta.paste();
		if(e.getSource() == copy) ta.copy();
		if(e.getSource() == selectAll) ta.selectAll();
		//help
	}
	
	private void init()
	{
		/**
		 * Initialize
		 */
		//text area
		ta = new JTextArea();
		ta.setBounds(5,5,360,320);
		ta.setWrapStyleWord(true);
		//menu items
		cut = new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		selectAll = new JMenuItem("selectAll");
		//menu bar items
		mb = new JMenuBar();
		//menu
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		
		/**
		 * Add to menu
		 */
		//file
		//edit
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		//help
		//menubar
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		
		/**
		 * Action Listener
		 */
		//menu items
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		
	}
	
	public static void main(String[] args) { new MenuBarExample(); }
}
