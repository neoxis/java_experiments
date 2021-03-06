package gui.apps;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Calculator extends JFrame
{
	//screen scaler
	final private int s = 2;
	
	private static final long serialVersionUID = 1L;
	
	//calc variables
	public boolean clr = true;
	double num, memVal;
	char op;
	
	//button text strings
	String dBText[] = {"7","8","9","4","5","6","1","2","3","\u00B1","0","\uff65"};
	String oBText[] = {"\u00F7","\u221A","\u00D7","%","\u2212","1/X","+","="};
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
	final int F_WIDTH = 325*s, F_HEIGHT = 325*s;
	final int HEIGHT = 30*s, WIDTH = 30*s, H_SPACE = 10*s, V_SPACE = 10*s;
	final int TOPX = 30*s, TOPY = 50*s;
	
	int tempX, y;
	
	Calculator()
	{
		super("Calculator - JFrame");
		
		//display
		display.setBounds(TOPX,TOPY,240*s,HEIGHT);
		display.setFont(new Font(display.getName(), Font.PLAIN, HEIGHT));
		add(display);
		
		memLab.setBounds(TOPX,TOPY+HEIGHT+V_SPACE,WIDTH,HEIGHT);
		memLab.setFont(new Font(memLab.getName(), Font.PLAIN, HEIGHT));
		add(memLab);
		
		//memory buttons
		tempX = TOPX;
		y = TOPY + 2*(HEIGHT + V_SPACE);
		for(int i = 0; i < memoryB.length; i++)
		{
			memoryB[i] = new MemoryButton(tempX,y,WIDTH,HEIGHT,mBText[i],this);
			memoryB[i].setForeground(Color.RED);
			y+=HEIGHT+V_SPACE;
		}
		
		//special buttons
		tempX = TOPX + WIDTH + H_SPACE;
		y = TOPY + HEIGHT + V_SPACE;
		
		for(int i = 0; i < specialB.length; i++)
		{
			specialB[i] = new SpecialButton(tempX,y,WIDTH*2,HEIGHT,sBText[i],this);
			specialB[i].setForeground(Color.RED);
			tempX = tempX + 2*WIDTH + H_SPACE;
		}
		
		//digit buttons
		int digX = TOPX + WIDTH + H_SPACE;
		int digY = TOPY + 2*(HEIGHT + V_SPACE);
		tempX = digX;
		y = digY;
		
		for(int i = 0; i < digitB.length; i++)
		{
			digitB[i] = new DigitButton(tempX,y,WIDTH,HEIGHT,dBText[i],this);
			digitB[i].setForeground(Color.BLUE);
			tempX += WIDTH + V_SPACE;
			if((i+1)% 3 == 0) {tempX=digX; y+=HEIGHT+V_SPACE;}
		}
		
		//operator buttons
		int optX = digX + 2*(WIDTH + H_SPACE) + H_SPACE;
		int optY = digY;
		
		tempX = optX;
		y = optY;
		for(int i = 0; i < operatorB.length; i++)
		{
			tempX += WIDTH + H_SPACE;
			operatorB[i] = new OperatorButton(tempX,y,WIDTH,HEIGHT,oBText[i],this);
			operatorB[i].setForeground(Color.RED);
			if((i+1)%2==0) { tempX = optX; y += HEIGHT + V_SPACE; }
		}
		
		
		//jframe layout
		setLayout(null);
		setSize(F_WIDTH, F_HEIGHT);
		setVisible(true);
		
	}
	
	public static void main(String[] args) { new Calculator(); }
}

class DigitButton extends JButton implements ActionListener
{
	private static final long serialVersionUID = 1L;
	Calculator calc;
	
	DigitButton(int x, int y, int width, int height, String bText, Calculator c)
	{
		super(bText);
		if(bText.length() > 1) setFont(new Font(this.getName(), Font.PLAIN, height/4));
		else setFont(new Font(this.getName(), Font.PLAIN, height/2));
		setBounds(x,y,width,height);
		calc = c;
		calc.add(this);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String temp = ((DigitButton)e.getSource()).getLabel();
		
		if(temp.equals("\uff65"))
		{
			if(calc.clr)
			{
				calc.display.setText("0."); calc.clr = false;
			}
			else
			{
				calc.display.setText(calc.display.getText()+".");
			}
			return;
		}
		
		int index = 0;
		try
		{
			index = Integer.parseInt(temp);
		}
		catch(Exception ex) { return; }
		
		if(index == 0 && calc.display.getText().equals("0")) return;
		if(calc.clr) { calc.display.setText(""+index); calc.clr = false; }
		else calc.display.setText(calc.display.getText()+index);
	}
	
}

class OperatorButton extends JButton implements ActionListener
{
	private static final long serialVersionUID = 1L;
	Calculator calc;
	
	OperatorButton(int x, int y, int width, int height, String bText, Calculator c)
	{
		super(bText);
		if(bText.length() > 1 || bText.equals("%")) setFont(new Font(this.getName(), Font.PLAIN, height/4));
		else setFont(new Font(this.getName(), Font.PLAIN, height/2));
		setBounds(x,y,width,height);
		calc = c;
		calc.add(this);
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String temp = ((OperatorButton)e.getSource()).getLabel();
	}
	
}

class MemoryButton extends JButton implements ActionListener
{
	private static final long serialVersionUID = 1L;
	Calculator calc;
	
	MemoryButton(int x, int y, int width, int height, String bText, Calculator c)
	{
		super(bText);
		setBounds(x,y,width,height);
		setFont(new Font(this.getName(), Font.PLAIN, height/4));
		calc = c;
		calc.add(this);
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String temp = ((MemoryButton)e.getSource()).getLabel();
		calc.clr = true;
		
		double n = Double.parseDouble(calc.display.getText());
		
		switch(temp)
		{
			case "MC":
				calc.memLab.setText(" ");
				break;
			case "MR":
				calc.display.setText(""+calc.memVal);
				break;
			case "MS":
				calc.memVal = 0.0;
			case "M+":
				calc.memVal += Double.parseDouble(calc.display.getText());
				if(calc.display.getText().equals("0") || calc.display.getText().equals("0.0"))
				{
					calc.memLab.setText(" ");
				}
				else
				{
					calc.memLab.setText("M");
				}
				break;
		}
	}
	
}

class SpecialButton extends JButton implements ActionListener
{
	private static final long serialVersionUID = 1L;
	Calculator calc;
	
	SpecialButton(int x,int y,int width,int height,String bText,Calculator c)
	{
		super(bText);
		setBounds(x,y,width,height);
		setFont(new Font(this.getName(), Font.PLAIN, height/2));
		calc = c;
		calc.add(this);
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String temp = ((SpecialButton)e.getSource()).getLabel();
		
		//backspace button
		if(temp.equals("BKSP"))
		{
			String del = calc.display.getText().substring(0, calc.display.getText().length()-1);
			if(del.equals("")) calc.display.setText("0");
			else calc.display.setText(del);
			return;
		}
		
		//clear button
		if(temp.equals("C"))
		{
			calc.num = 0.0;
			calc.op = ' ';
			calc.memVal = 0.0;
			calc.memLab.setText("");
		}
		
		//CE button
		calc.display.setText("0");
		calc.clr = true;
	}
	
}