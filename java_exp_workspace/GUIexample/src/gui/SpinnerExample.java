package gui;

import javax.swing.*;
import javax.swing.event.*;

public class SpinnerExample extends JFrame implements ChangeListener
{
	private static final long serialVersionUID = 1L;
	JLabel l;
	SpinnerModel sm;
	JSpinner s;
	
	SpinnerExample()
	{
		//jframe title
		setTitle("Spinner Example");
		
		//output label
		l = new JLabel("Move the spinner");
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(250,100);
		
		//spinner <init><min><max><step>
		sm = new SpinnerNumberModel(5,0,10,1);
		
		//spinner
		s = new JSpinner(sm);
		s.setBounds(100, 100, 50, 30);
		s.addChangeListener(this);
		
		//add components
		add(s);
		add(l);
		
		//jframe layout
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) { l.setText("Value: " + ((JSpinner)e.getSource()).getValue()); }
	
	public static void main(String[] args) { new SpinnerExample(); }
}
