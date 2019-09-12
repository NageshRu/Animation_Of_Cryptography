import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Form4 extends Frame implements ActionListener
{
	JButton bce,bco;
	Form4()
	{
		super("Third Page");
		setBackground(Color.black);
		
         		setLayout(null);
		bce=new JButton("Ceaser Cipher Technique");
		bce.setBounds(100,100,500,60);		
		bce.setForeground(Color.yellow);
		bce.setBackground(Color.black);
		bce.setBorder(new LineBorder(Color.blue,1));
		bce.setFont(new Font("Comic Sans MS 14",Font.PLAIN,40));
		bce.addActionListener(this);
		add(bce);
		
		bco=new JButton("Columnar Technique");
		bco.setBounds(700,500,550,60);
		bco.setForeground(Color.yellow);
		bco.setBackground(Color.black);
		bco.setBorder(new LineBorder(Color.blue,1));
		bco.setFont(new Font("Comic Sans MS 14",Font.PLAIN,40));
		bco.addActionListener(this);
		add(bco);


		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e1){}
		

		setUndecorated(true);
		setSize(1367,768);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		JButton b=(JButton)ae.getSource();
		if(b==bce)
		{
			Ceaser1 c=new Ceaser1();
		}
		if(b==bco)
		{
			Column c1=new Column();
		}
	}
			


	public static void main(String []args)
	{
		new Form4();
	}
}
		
		