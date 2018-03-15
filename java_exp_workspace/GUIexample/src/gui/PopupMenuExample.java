package gui;

import javax.swing.*;
import java.awt.event.*;

public class PopupMenuExample implements ActionListener
{
	//variables
	JLabel l;
	JPopupMenu pm;
	JMenuItem cut, copy, paste;
	JFrame f;
	
	PopupMenuExample()
	{
		//jframe
		f = new JFrame();
		
		//mouse click action listener
		f.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e) { pm.show(f, e.getX(), e.getY()); }	
		});
		
		//initialize
		init();
		
		//add action listener
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		
		//add components
		f.add(pm);
		f.add(l);
		
		//jframe layout
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == cut) { l.setText("'Cut' MenuItem clicked"); }		//cut
		if(e.getSource() == copy) { l.setText("'Copy' MenuItem clicked"); }		//copy
		if(e.getSource() == paste) { l.setText("'Paste' MenuItem clicked"); }	//paste
	}
	
	public void init()
	{
		//output label
		l = new JLabel("Click anywhere inside the window");
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(400,100);
		
		//object creation
		pm = new JPopupMenu("Edit");
		cut = new JMenuItem("Cut");
		copy =new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		
		//add items to popup menu
		pm.add(cut);
		pm.add(copy);
		pm.add(paste);	
	}
	
	public static void main(String[] args){ new PopupMenuExample(); }
}
