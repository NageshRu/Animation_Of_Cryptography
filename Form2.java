import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Form2 extends Frame
{
	JLabel ln;
	Form2()
	{
		super("Second Page");
		setBackground(Color.black);
		setLayout(null);
		ln=new JLabel("<html><body><div style=width:700;height=100>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Animation</u><br> <br>&nbsp;&nbsp;&nbsp; <u>Of</u><br><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Cryptology</u></div></body></html>");
		ln.setBounds(364,204,400,300);
		ln.setForeground(Color.yellow);
		//ln.setBorder(new LineBorder(Color.blue,2));
		ln.setFont(new Font("Comic Sans MS 14",Font.PLAIN,40));
		add(ln);	
	
		
		setUndecorated(true);
		setSize(1367,768);
		setVisible(true);
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e1){}
		
		Form3 f=new Form3();
		
	}

	


	public static void main(String []args)
	{
		new Form2();
	}
}
		
		