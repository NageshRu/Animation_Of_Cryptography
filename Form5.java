import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Form5 extends Frame implements ActionListener
{
	JButton brel,bver;
	Form5()
	{
		super("Third Page");
		setBackground(Color.black);
		
         		setLayout(null);
		brel=new JButton("Rel Fence Technique");
		brel.setBounds(100,100,400,60);		
		brel.setForeground(Color.yellow);
		brel.setBackground(Color.black);
		brel.setBorder(new LineBorder(Color.blue,1));
		brel.setFont(new Font("Comic Sans MS 14",Font.PLAIN,40));
		brel.addActionListener(this);
		add(brel);
		
		bver=new JButton("Vigener Technique");
		bver.setBounds(700,500,430,60);
		bver.setForeground(Color.yellow);
		bver.setBackground(Color.black);
		bver.setBorder(new LineBorder(Color.blue,1));
		bver.setFont(new Font("Comic Sans MS 14",Font.PLAIN,40));
		bver.addActionListener(this);
		add(bver);


		

		setUndecorated(true);
		setSize(1367,768);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		JButton b=(JButton)ae.getSource();
		if(b==brel)
		{
			Relfense r=new Relfense();
		}
		if(b==bver)
		{
			Vigener v=new Vigener();
		}
	}
		

	public static void main(String []args)
	{
		new Form5();
	}
}
		
		