package gui;

import javax.swing.*;
import java.awt.event.*;

public class ScrollBarExample extends JFrame implements AdjustmentListener
{
	private static final long serialVersionUID = 1L;
	JLabel l;
	JScrollBar s;
	
	ScrollBarExample()
	{
		//jframe title
		setTitle("Scrollbar Example");
		
		//output label
		l = new JLabel();
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(400,100);
		
		//scrollbar
		s = new JScrollBar();
		s.setBounds(100,100,50,100);
		s.addAdjustmentListener(this);
		
		//add components
		add(s);
		add(l);
		
		//jframe layout
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		l.setText("Vertical ScrollBar value is: " + s.getValue());
		
	}
	
	public static void main(String[] args) { new ScrollBarExample(); }
}
