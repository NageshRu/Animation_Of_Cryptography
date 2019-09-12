import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Form3 extends Frame implements ActionListener
{
	JButton bs,bt;
	Form3()
	{
		super("Third Page");
		setBackground(Color.black);
		
         		setLayout(null);
		bs=new JButton("Substitution Technique");
		bs.setBounds(100,100,400,60);		
		bs.setForeground(Color.yellow);
		bs.setBackground(Color.black);
		bs.setBorder(new LineBorder(Color.blue,1));
		bs.setFont(new Font("Comic Sans MS 14",Font.PLAIN,40));
		bs.addActionListener(this);
		add(bs);
		
		bt=new JButton("Transposition Technique");
		bt.setBounds(700,500,430,60);
		bt.setForeground(Color.yellow);
		bt.setBackground(Color.black);
		bt.setBorder(new LineBorder(Color.blue,1));
		bt.setFont(new Font("Comic Sans MS 14",Font.PLAIN,40));
		bt.addActionListener(this);
		add(bt);


		

		setUndecorated(true);
		setSize(1367,768);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		JButton b=(JButton)ae.getSource();
		if(b==bs)
		{
			Form4 f=new Form4();
		}
		if(b==bt)
		{
			Form5 f1=new Form5();
		}
	}
			

	/*public void paint(Graphics g)
	{
		
		int x=0,y=0;
		for(y=0,x=0;y<400;x++,y++)
		{
			
			bs.setBounds(x,y,400,60);
		}

		if(y==390)
			bs.setBounds(100,390,200,60);		
	}*/

	public static void main(String []args)
	{
		new Form3();
	}
}
		
		