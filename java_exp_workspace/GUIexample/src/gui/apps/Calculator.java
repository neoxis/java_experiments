package gui.apps;

import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	//button text strings
	String dBText[] = {"7","8","9","4","5","6","1","2","3","0","+/-","."};
	String oBText[] = {"/","sqrt","*","%","-","1/X","+","="};
	String mBText[] = {"MC","MR","MS","M+"};
	String sBText[] = {"BKSP","C","CE"};
	
	//button object arrays
	DigitButton digitB[] = new DigitButton[dBText.length];
	OperatorButton operatorB[] = new OperatorButton[oBText.length];
	MemoryButton memoryB[] = new MemoryButton[mBText.length];
	SpecialButton specialB[] = new SpecialButton[sBText.length];
	
	//'display' variables
	JLabel display = new JLabel("0", JLabel.RIGHT);
	JLabel memLab = new JLabel(" ", JLabel.RIGHT);
	
	//spacing variables
	final int F_WIDTH = 325, F_HEIGHT = 325;
	final int HEIGHT = 30, WIDTH = 30, H_SPACE = 10, V_SPACE = 10;
	final int TOPX = 30, TOPY = 50;
	
	Calculator()
	{
		super("Calculator - JFrame");
		
		//jframe layout
		setLayout(null);
		setSize(F_WIDTH, F_HEIGHT);
		setVisible(true);
		
	}
	
	public static void main(String[] args) { new Calculator(); }
}

class DigitButton extends JButton implements ActionListener
{
	Calculator calc;
	
	DigitButton(int x, int y, int width, int height, String bText, Calculator c)
	{
		
	}
	
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
	
}

class OperatorButton extends JButton implements ActionListener
{
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		addActionListener(this);
	}
	
}

class MemoryButton extends JButton implements ActionListener
{
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
	
}

class SpecialButton extends JButton implements ActionListener
{
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
	
}