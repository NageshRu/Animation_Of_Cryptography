import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

class Menu extends Frame implements ActionListener
{
	JButton jsec;
	JButton jbs,jbsc,jbsv;
	JButton jbt,jbtr,jbtc;
	
	Menu()
	{
		super("Menu");
		
		setLayout(null);
		
		
		jsec=new JButton("SECURITY");
		jsec.setBounds(1366/2-200,-100,300,50);
		jsec.setForeground(Color.white);
		jsec.setFont(new Font("Comic Sans Serif",Font.BOLD,25));
		
		Border b2=BorderFactory.createLineBorder(Color.green,2);
		jsec.setBackground(Color.blue);
		jsec.setBorder(b2);
		add(jsec);
		
		jbt=new JButton("Transposition");
		jbt.setBounds(800,650,300,50);
		jbt.setForeground(Color.white);
		jbt.setFont(new Font("Comic Sans Serif",Font.BOLD,25));
		
		b2=BorderFactory.createLineBorder(Color.green,2);
		jbt.setBackground(Color.blue);
		jbt.setBorder(b2);
		add(jbt);
		
		
		
		
		jbs=new JButton("Substitution");
		jbs.setBounds(200,650,300,50);
		jbs.setForeground(Color.white);
		jbs.setFont(new Font("Comic Sans Serif",Font.BOLD,25));
		
		b2=BorderFactory.createLineBorder(Color.green,2);
		jbs.setBackground(Color.blue);
		jbs.setBorder(b2);
		add(jbs);
		
		
		
		jbsc=new JButton("Ceaser Chipher");
		jbsc.setBounds(0,700,300,50);
		jbsc.setForeground(Color.white);
		jbsc.setFont(new Font("Comic Sans Serif",Font.BOLD,25));
		
		b2=BorderFactory.createLineBorder(Color.green,2);
		jbsc.setBackground(Color.blue);
		jbsc.setBorder(b2);
		add(jbsc);
		
		jbtr=new JButton("Relfense");
		jbtr.setBounds(980,700,300,50);
		jbtr.setForeground(Color.white);
		jbtr.setFont(new Font("Comic Sans Serif",Font.BOLD,25));
		
		b2=BorderFactory.createLineBorder(Color.green,2);
		jbtr.setBackground(Color.blue);
		jbtr.setBorder(b2);
		add(jbtr);
		
		
		jbtc=new JButton("Columnar");
		jbtc.setBounds(980,700,300,50);
		jbtc.setForeground(Color.white);
		jbtc.setFont(new Font("Comic Sans Serif",Font.BOLD,25));
		
		b2=BorderFactory.createLineBorder(Color.green,2);
		jbtc.setBackground(Color.blue);
		jbtc.setBorder(b2);
		add(jbtc);
		
		
		
		jbsv=new JButton("Vegener Chipher");
		jbsv.setBounds(400,700,300,50);
		jbsv.setForeground(Color.white);
		jbsv.setFont(new Font("Comic Sans Serif",Font.BOLD,25));
		
		b2=BorderFactory.createLineBorder(Color.green,2);
		jbsv.setBackground(Color.blue);
		jbsv.setBorder(b2);
		add(jbsv);
		
		
		jbs.setVisible(false);
		jbsc.setVisible(false);
		jbsv.setVisible(false);
		
		jbt.setVisible(false);
		jbtr.setVisible(false);
		jbtc.setVisible(false);
		
		
		
		setBackground(Color.black);
		setUndecorated(true);
		setSize(1366,768);
		setVisible(true);
		
		
		int delay=2;
		Graphics g=getGraphics();
		g.setColor(Color.white);
		
		
		
		for(int y=-100;y<50;y++)
		{
			try{Thread.sleep(delay);}catch(Exception e11){}
			jsec.setBounds(483,y,300,50);
		}
		
		
		
		//first line
		for(int y=100;y<150;y++)
		{
			g.fillRect(631,y,4,1);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		//line to substitution 1
		for(int x=634;x>350;x--)
		{
			g.fillRect(x,150,1,4);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		//line to substitution 2
		for(int y=150;y<250;y++)
		{
			g.fillRect(350,y,4,1);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		jbs.setVisible(true);
		//Substitution button is coming
		for(int y=650;y>250;y--)
		{
			try{Thread.sleep(delay);}catch(Exception e11){}
			jbs.setBounds(200,y,300,50);	
		}
		
		//line from substitution
		for(int y=300;y<400;y++)
		{
			g.fillRect(350,y,4,1);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		//line to Ceaser Chiper 1
		for(int x=353;x>150;x--)
		{
			g.fillRect(x,400,1,4);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		//line to Ceaser chipher 2
		for(int y=400;y<500;y++)
		{
			g.fillRect(150,y,4,1);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		jbsc.setVisible(true);
		//coming chipher Button
		for(int y=700;y>500;y--)
		{
			try{Thread.sleep(delay);}catch(Exception e11){}
			jbsc.setBounds(0,y,300,50);	
		}
		
		//line to vegerner Chiper 1
		for(int x=353;x<556;x++)
		{
			g.fillRect(x,400,1,4);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		//line to Vegerner chipher 2
		for(int y=400;y<500;y++)
		{
			g.fillRect(556,y,4,1);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		jbsv.setVisible(true);
		//coming Vegener Chipher Button
		for(int y=700;y>500;y--)
		{
			try{Thread.sleep(delay);}catch(Exception e11){}
			jbsv.setBounds(400,y,300,50);	
		}
		
		
		
		/******Transpotision*******/
		
		//line to substitution 1
		for(int x=634;x<634+300;x++)
		{
			g.fillRect(x,150,1,4);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		//line to substitution 2
		for(int y=150;y<250;y++)
		{
			g.fillRect(634+300,y,4,1);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		jbt.setVisible(true);
		//Transpotision button is coming
		for(int y=650;y>250;y--)
		{
			try{Thread.sleep(delay);}catch(Exception e11){}
			jbt.setBounds(800,y,300,50);	
		}
		
		
		//line from transposition
		for(int y=300;y<450;y++)
		{
			g.fillRect(634+300,y,4,1);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}

		
		//line from transposition to relfense
		for(int x=634+300;x<934+50;x++)
		{
			g.fillRect(x,450,4,4);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		jbtr.setVisible(true);
		//coming of relfense button
		for(int y=700;y>425;y--)
		{
			try{Thread.sleep(delay);}catch(Exception e11){}
			jbtr.setBounds(980,y,300,50);	
		}
		
		
		for(int y=450;y<550;y++)
		{
			g.fillRect(634+300,y,4,1);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		//line from transposition to columnar
		for(int x=634+300;x<934+50;x++)
		{
			g.fillRect(x,550,4,4);
			try{Thread.sleep(delay);}catch(Exception e11){}
		}
		
		
		jbtc.setVisible(true);
		//coming of columnar button
		for(int y=700;y>525;y--)
		{
			try{Thread.sleep(delay);}catch(Exception e11){}
			jbtc.setBounds(980,y,300,50);	
		}
		
	
		
		jbsc.addActionListener(this);
		jbsv.addActionListener(this);
		jbtc.addActionListener(this);
		jbtr.addActionListener(this);
	
		addWindowListener(new WindowAdapter()
		{
			public void windowDeIconified(WindowEvent ee)
			{
				repaint();
			}
		});
		
	}
	
	
	public void actionPerformed(ActionEvent ee)
	{
		new Relfense();
	}
	
	
	public static void main(String []args)
	{
		Menu m=new Menu();
	}
}