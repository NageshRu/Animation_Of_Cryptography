import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import javax.swing.border.*;


public class Ceaser1 extends Frame implements ActionListener,Runnable
{
	Label []b;
	JLabel l1;
	
	Panel p,q,r;
	
	int index=0;
	String []s={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	JButton ok;

	String []dup;
	
	JTextField jt1,jtxt;
	
	int x1=51,x2=51,y1=51,y2=90;
	int x3=0,y3=0;
			
			
	Ceaser1()
	{
		super("Ceaser Class");
			
		setLayout(null);
		setBackground(new Color(25,25,25));
				
		JLabel jl3=new JLabel("<html><u><bg color=blue>Ceaser Cipher</u><html>");
		jl3.setFont(new Font("Comic Sans MS 14",Font.PLAIN,50));
		//jl3.setBorder(new LineBorder(Color.yellow,2));
		jl3.setForeground(Color.yellow);
		jl3.setBounds(1360/2-200,10,330,50);
		add(jl3);
			
				
		b=new Label[26];
		setLayout(null);
				
		p=new Panel();
					
		p.setLayout(null);
				
		for(int i=0,x=50,y=90;i<26;i++,x+=50)
		{
			b[i]=new Label(s[i]);
			b[i].setFont(new Font("Times New Romen",Font.PLAIN,20));
			b[i].setForeground(new Color(167,68,221));
			b[i].setBounds(x,y,50,50);
			add(b[i]);
					
		}
		add(p,"North");
				
		l1=new JLabel("Enter Shift Key");
		l1.setBounds(180,170,140,30);
		l1.setBorder(new LineBorder(Color.blue,2));
		l1.setFont(new Font("Comic Sans MS 14",Font.PLAIN,20));
		l1.setForeground(Color.yellow);
		add(l1);
				

		jt1=new JTextField();
		jt1.setBackground(Color.white);
		jt1.setBorder(new LineBorder(Color.black,2));
		jt1.setBounds(360,170,100,30);
		add(jt1);

				
		JLabel l2=new JLabel("Enter Cipher Text");
		l2.setBounds(180,230,160,30);
		l2.setBorder(new LineBorder(Color.blue,2));
		l2.setFont(new Font("Comic Sans MS 14",Font.PLAIN,20));
		l2.setForeground(Color.yellow);
		add(l2);	

		jtxt=new JTextField();
		jtxt.setBackground(Color.white);
		jtxt.setBorder(new LineBorder(Color.black,2));
		jtxt.setBounds(360,230,100,30);
		
		add(jtxt);


				
								
				
		ok=new JButton("OK");
		ok.setBounds(500,200,55,30);
		ok.setFont(new Font("Times New Romen",Font.PLAIN,12));
		ok.setForeground(Color.blue);
		ok.setBackground(Color.black);
		ok.addActionListener(this);
		add(ok);
				
				
				
				
				
				setUndecorated(true);
				setSize(1368,768);
				setVisible(true);
					repaint();
		

			
			dup=new String[26];
			for(int i=0;i<26;i++)
				dup[i]="";

		}
	
	
		
	
	
		public void run()
		{
			try{Thread.sleep(10);}catch(Exception e1){}	
		
		}
		
		
		public void actionPerformed(ActionEvent ae)
		{
			JButton b1=(JButton)ae.getSource();
			System.out.println("hello");
			int a=Integer.parseInt(jt1.getText());
			int y=600,x=10;
			
			int dups=0;

			for(int i=a;i<26;i++,x+=50)
			{
				b[i]=new Label(s[i]);
				b[i].setFont(new Font("Times New Romen",Font.PLAIN,20));
				b[i].setForeground(new Color(167,68,221));
				b[i].setBackground(Color.yellow);	
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e1){}
					b[i].setBounds(x,y,50,50);
					add(b[i]);
				dup[dups++]=s[i];
					
			}
			x+=10;
			for(int i=0;i<a;i++,x+=50)
			{
				b[i]=new Label(s[i]);
				b[i].setFont(new Font("Times New Romen",Font.PLAIN,20));
				b[i].setForeground(new Color(167,68,221));
				b[i].setBackground(Color.yellow);
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e1){}
				b[i].setBounds(x,y,50,50);
				add(b[i]);
					
				dup[dups++]=s[i];
			}

			String txt=jtxt.getText();
			int len=txt.length();
			
			String txt1="";
			
			for(int i=0;i<len;i++)
			{
				txt1+=txt.substring(i,i+1);
			}

			
			System.out.println("Your Text=");
			
			for(int i=0;i<len;i++)
			{
				System.out.print(""+dup[i]);
			}
			
			
			
			for(int i=0;i<26;i++)
				System.out.print("  "+dup[i]);				
							
		}

		public static void main(String []args)
		{
			Ceaser1 c=new Ceaser1();
			Thread t=new Thread(c);
			
			t.start();
			
		}
}