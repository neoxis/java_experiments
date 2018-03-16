package gui;

import javax.swing.*;

public class TabbedPaneExample extends JFrame
{
	private static final long serialVersionUID = 1L;
	JTextArea ta;
	JPanel p1,p2,p3;
	JTabbedPane tp;
	
	TabbedPaneExample()
	{
		//jframe title
		setTitle("Tabbed Pane Example");
		
		//initialize components
		init();
		
		//add components
		add(tp);
		
		//jframe layout
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	
	private void init()
	{
		/**
		 * Initialize
		 */
		//panels
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		//tabbed pane
		tp = new JTabbedPane();
		tp.setBounds(50, 50, 200, 200);
		//text area
		ta = new JTextArea(200,200);
		
		//add panels
		tp.add("main", p1);
		tp.add("visit", p2);
		tp.add("help", p3);
		
		//add text area
		p1.add(ta);
	}
	
	public static void main(String[] args) { new TabbedPaneExample(); }
}
