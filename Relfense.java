import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Relfense extends Frame implements ActionListener
{
	JLabel jen;
	JTextArea jten;
	JButton jben,jbdc;
	JLabel jl[]=null;
	Rel1 r=null;
	Rel2 r1=null;
	
	Relfense()
	{
		super("Relfense");
		

		setLayout(null);
		
		
		jen=new JLabel("<html><u>Enter Text</u></html>");
		jen.setBounds(50,50,300,50);
		jen.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		jen.setForeground(Color.white);
		add(jen);
	
	
		Border b=BorderFactory.createLineBorder(Color.yellow,7);
		jten=new JTextArea();
		jten.setBounds(200,100,400,50);
		jten.setBorder(b);
		add(jten);

		Border b1=BorderFactory.createLineBorder(Color.green,4);
		jben=new JButton("Encrypt");
		jben.setBounds(650,100,150,50);
		jben.setBackground(Color.blue);
		jben.setBorder(b1);
		jben.addActionListener(this);
		add(jben);
		
		
		b1=BorderFactory.createLineBorder(Color.green,4);
		jbdc=new JButton("Decrypt");
		jbdc.setBounds(850,100,150,50);
		jbdc.setBackground(Color.blue);
		jbdc.setBorder(b1);
		jbdc.addActionListener(this);
		add(jbdc);
		
	
		setBackground(Color.black);
		setSize(1368,740);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JButton jj=(JButton)e.getSource();
		
		
		if(jj==jben)
		{
			String es=jten.getText();
			r=new Rel1(es,this,jten,jben,jen);
			Thread t=new Thread(r);
			t.start();
			r.setBounds(100,50,1000,500);
			r.setBackground(Color.black);
			r.setFont(new Font("Comic Sans MS",Font.BOLD,30));
			Border bb=BorderFactory.createLineBorder(Color.blue,10);
			//r.setBorder(bb);
			add(r);
			
			
			System.out.println("Enter");
		}
		
		if(jj==jbdc)
		{
			String es=jten.getText();
			r1=new Rel2(es,this,jten,jben,jen);
			Thread t=new Thread(r1);
			t.start();
			r1.setBounds(100,50,1000,500);
			r1.setBackground(Color.black);
			r1.setFont(new Font("Comic Sans MS",Font.BOLD,30));
			Border bb=BorderFactory.createLineBorder(Color.blue,10);
			//r.setBorder(bb);
			add(r1);
			
			
			System.out.println("Enter1");
			
		}
	}
	
	
	public static void main(String []args)
	{
		new Relfense();
	}
}

class Rel1 extends JPanel implements Runnable 
{
	String s;
	Relfense f;
	Label jl[]=null;
	

	Rel1(String ss,Relfense f,JTextArea jt,JButton jb,JLabel jll)
	{
		s=ss;
		this.f=f;
		//setLocation(200,150);
		//setSize(800,500);
		f.remove(jt);
		f.remove(jb);
		f.remove(jll);
		f.repaint();
	}
	
	public void run()
	{
		int ls=s.length();
			
			jl=new Label[ls];
			
			
			for(int i=0;i<ls;i++)
			{
				jl[i]=new Label(""+s.charAt(i));
				jl[i].setForeground(Color.white);
				jl[i].setBackground(Color.yellow);
				add(jl[i]);
			}
			
			
			for(int x=0,i=0;i<ls;i++,x+=60)
			{
				for(int y=50;y<300;y++)
				{
					jl[i].setBounds(x,y,50,50);
					//try{Thread.sleep(1);}catch(Exception e1){}
					jl[i].setBackground(Color.black);
					//try{Thread.sleep(5);}catch(Exception ee1){}
				}
			}
			//setBounds(100,200,1000,500);	
		
			Rectangle rr=jl[0].getBounds();
			int x=(int)rr.getX();
			int y=(int)rr.getY();
			
			
			jl[0].setBounds(x,y-30,50,50);
			jl[0].setBackground(Color.yellow);		
			rr=jl[1].getBounds();
			x=(int)rr.getX();
			y=(int)rr.getY();
			
			
			jl[1].setBounds(x,y+30,50,50);
			jl[1].setBackground(Color.green);
	
			for(int i=2;i<ls;i++)
			{
				rr=jl[i].getBounds();
				x=(int)rr.getX();
				y=(int)rr.getY();
				
				
				if(i%2==0)
				{
					jl[i].setBounds(x,y-30,50,50);
					jl[i].setBackground(Color.yellow);
				}
				else
				{
					jl[i].setBounds(x,y+30,50,50);
					jl[i].setBackground(Color.green);
				}
				try{Thread.sleep(250);}catch(Exception ee1){}
			}
	
			//try{Thread.sleep(2000);}catch(Exception ee1){}
			int flg=2;
			
			int y1=100;
			int x1=0;
			
			for(int i=0,a=50;i<ls;i+=2,x1+=50)
			{	
				if(i%2==0||i==0)
					jl[i].setBounds(x1,y1,50,50);
				try{Thread.sleep(50);}catch(Exception ee1){}
			}
	
			int x2=x1-50;
	
			for(int i=1;i<ls;i++)
			{	
				if(i%2!=0)
				{
					x2+=50;
					jl[i].setBounds(x2,y1,50,50);
				}
				try{Thread.sleep(50);}catch(Exception ee1){}
			}
			
			int xx1=0;int yy1=300;
			
			//try{Thread.sleep(2000);}catch(Exception ee1){}
			
	
			int flag=1;
	
			for(int i=1;i<ls;i++)
			{
				if(i%2==0)
					flag++;
			}
			
			/*x=0;y=300;
			jl[0].setBounds(x,y,50,50);
			jl[1].setBounds(x+=50,y,50,50);
			
			for(int i=2;i<ls;i++)
			{
				if(i%2==0)
					jl[i].setBounds(x+=50,y,50,50);
				if(i%2!=0)
					jl[i].setBounds(x+=50,y,50,50);
			}
				*/
			
				
	}
	
}

class Rel2 extends JPanel implements Runnable 
{
	String s;
	Relfense f;
	Label jl[]=null;
	

	Rel2(String ss,Relfense f,JTextArea jt,JButton jb,JLabel jll)
	{
		s=ss;
		this.f=f;
		//setLocation(200,150);
		//setSize(800,500);
		f.remove(jt);
		f.remove(jb);
		f.remove(jll);
		f.repaint();
	}
	
	public void run()
	{
		int ls=s.length();
			
			jl=new Label[ls];
			
			
			for(int i=0;i<ls;i++)
			{
				jl[i]=new Label(""+s.charAt(i));
				jl[i].setForeground(Color.white);
				jl[i].setBackground(Color.yellow);
				add(jl[i]);
			}
			
			
			for(int x=0,i=0;i<ls;i++,x+=60)
			{
				for(int y=50;y<300;y++)
				{
					jl[i].setBounds(x,y,50,50);
					//try{Thread.sleep(1);}catch(Exception e1){}
					jl[i].setBackground(Color.yellow);
					//try{Thread.sleep(5);}catch(Exception ee1){}
				}
			}
			//setBounds(100,200,1000,500);	
		
			Rectangle rr=jl[0].getBounds();
			int x=(int)rr.getX();
			int y=(int)rr.getY();
			
			
			jl[0].setBounds(x,y-30,50,50);
			//jl[0].setBackground(Color.yellow);		
			rr=jl[1].getBounds();
			x=(int)rr.getX();
			y=(int)rr.getY();
			
			
			int x1=0;y=200;
	
			for(int i=0;i<ls;i++)
			{
				jl[i].setBounds(x1+=50,y,50,50);
				try{Thread.sleep(250);}catch(Exception ee1){}
			}
	
					
			rr=jl[1].getBounds();
			x=(int)rr.getX();
			y=(int)rr.getY();
			
			
			
			
	
			int flag=1;
	
			for(int i=1;i<ls;i++)
			{
				if(i%2==0)
					flag++;
			}
			
			int min=ls-flag;
			
			int x111=0,y111=300;

			System.out.println(""+flag+"    "+min);
			
			int j=min,k=0;
			
			for(int i=0;i<ls;i++)
			{
				if(k<flag)
				{
					x111+=50;
					jl[k++].setBounds(x111,y111,50,50);
					System.out.println(y111+"in first   "+k);
				}
				
				if(j<=ls)
				{
					x111+=50;
					jl[j++].setBounds(x111,y111,50,50);			
					System.out.println(y111+"in second   "+j);
				}
			}
			
			
	}
	
}


