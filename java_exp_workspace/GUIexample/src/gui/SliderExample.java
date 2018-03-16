package gui;

import javax.swing.*;

public class SliderExample extends JFrame
{
	//variables
	private static final long serialVersionUID = 1L;
	JSlider s;
	JPanel p;
	
	SliderExample()
	{
		//slider
		s = new JSlider(JSlider.HORIZONTAL,0,50,25);
		s.setMinorTickSpacing(2);
		s.setMajorTickSpacing(10);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		
		//panel
		p = new JPanel();
		p.add(s);
		
		//add components
		add(p);
		
		//jframe layout
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) { new SliderExample(); }
}
