package gui;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class FileChooserExample extends JFrame implements ActionListener
{
	//variables
	private static final long serialVersionUID = 1L;
	JMenuBar mb;
	JMenu file;
	JMenuItem open;
	JTextArea ta;
	
	FileChooserExample()
	{
		//initialize
		init();
		
		//add action listener
		open.addActionListener(this);
		
		//add components
		add(mb);
		add(ta);
		
		//jframe layout
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	}
	
	private void init()
	{
		//open jmenu item
		open = new JMenuItem("Open File");
		
		//file menu
		file = new JMenu("File");
		file.add(open);
		
		//menu bar
		mb = new JMenuBar();
		mb.setBounds(0,0,800,20);
		mb.add(file);
		
		//text area
		ta = new JTextArea();
		ta.setBounds(0,20,800,800);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == open)
		{
			JFileChooser fc = new JFileChooser();
			int i = fc.showOpenDialog(this);
			if(i == JFileChooser.APPROVE_OPTION)
			{
				File f = fc.getSelectedFile();
				String fp = f.getPath();
				try
				{
					BufferedReader br = new BufferedReader(new FileReader(fp));
					String s1 ="", s2 ="";
					
					while((s1=br.readLine()) != null) { s2 += s1 + "\n"; }
					
					ta.setText(s2);
					br.close();
				}
				catch(Exception ex) { ex.printStackTrace(); }
			}
			
		}
		
	}
	
	public static void main(String[] args) { new FileChooserExample(); }
}
