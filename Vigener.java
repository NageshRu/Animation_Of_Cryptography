import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Vigener extends Frame implements Runnable,ActionListener
{
	JLabel jkey,jtext;
	JTextField jtkey,jttext;
	
	
	JButton jok;
	
	String txt="",key="";
	String k[]=null,t[]=null;
	Label jk[]=null,jt[]=null;
	
	String [][]alpha=new String[27][28];
	
	Vigener()
	{
		super("Vigener Technique");
		setBackground(Color.black);
		setLayout(null);
		
	
		jkey=new JLabel("Enter Text");
		jkey.setBounds(200,50,120,30);
		jkey.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		jkey.setForeground(Color.yellow);
		jkey.setBackground(Color.black);
		jkey.setBorder(new LineBorder(Color.blue,2));
		add(jkey);
		
		
		jtext=new JLabel("Enter Plain Text");
		jtext.setBounds(200,150,170,30);
		jtext.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		jtext.setForeground(Color.yellow);
		jtext.setBackground(Color.blue);
		jtext.setBorder(new LineBorder(Color.blue,2));
		add(jtext);
		
		
		jtkey=new JTextField();
		jtkey.setBounds(400,50,150,30);
		jtkey.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		jtkey.setBorder(new LineBorder(Color.black,2));
		add(jtkey);
		
		
		jttext=new JTextField();
		jttext.setBounds(400,150,150,30);
		jttext.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		jttext.setBorder(new LineBorder(Color.black,2));
		add(jttext);
		
		
		jok=new JButton("Encrypt");
		jok.setBounds(400,250,100,30);
		jok.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		jok.setBackground(Color.black);
		jok.setBorder(new LineBorder(Color.green,2));
		jok.addActionListener(this);
		add(jok);
		
		setUndecorated(true);
		setSize(1367,768);
		setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		txt=jttext.getText();
		key=jtkey.getText();
		
		
		
		remove(jtext);
		remove(jok);
		remove(jtkey);
		remove(jttext);
		remove(jkey);
		repaint();
		
		Thread t=new Thread(this);
		t.start();
		
		
	}
	
	public void run()
	{
		jkey.setText("Key");
		jtext.setText("Text");
		jkey.setBounds(50,50,70,50);
		jtext.setBounds(50,100,70,50);
		
		add(jkey);
		add(jtext);
		repaint();
		
		int a=200;
		try{Thread.sleep(a);}catch(Exception e1){}
		jkey.setBackground(Color.black);
		try{Thread.sleep(a);}catch(Exception e1){}
		jkey.setForeground(Color.red);
		try{Thread.sleep(a);}catch(Exception e1){}
		jtext.setForeground(Color.red);
		try{Thread.sleep(a);}catch(Exception e1){}
		jkey.setBackground(Color.black);
	
	
		int ls=txt.length();
		jt=new Label[ls];
		jk=new Label[ls];
		
		k=new String[ls];
		t=new String[ls];
		
		int x=150;
		
		for(int i=0;i<ls;i++)
		{
			jk[i]=new Label();
			jt[i]=new Label();
			jk[i].setBackground(Color.black);
			jk[i].setForeground(Color.yellow);
			jk[i].setFont(new Font("Comic Sans MS",Font.BOLD,20));
			jt[i].setFont(new Font("Comic Sans MS",Font.BOLD,20));
			
			add(jk[i]);
			jk[i].setBounds(x,50,50,50);
			
			System.out.println("i"+i);
			
			jt[i].setBackground(Color.black);
			jt[i].setForeground(Color.blue);
			
			jt[i].setBounds(x,100,50,50);
			
			add(jt[i]);
			x+=50;
		}
		
		
		for(int i=0;i<ls;i++)
		{
			jt[i].setText(txt.substring(i,i+1));
		}
		
		String key1="";
		for(int i=0,j=0,j1=0;i<txt.length();i++)
		{
			if(j1<key.length())
			{
				jk[j].setText(key.substring(j1,j1+1));
				j++;
				j1++;
				System.out.print("Yes");
				
			}
			else
			{
				i--;
				j1=0;
				System.out.println("No");
			}
			System.out.println("i"+i+" j"+j+" j1"+j1);
		}
		
		for(int i=0;i<ls;i++)
		{
			key1+=jk[i].getText();
		}
	
		
		for(int i=0;i<27;i++)
		{
			for(int j=0;j<27;j++)
			{
				alpha[i][j]="";
			}
		}
	
		String ab[]=new String[26];
		
		for(int i=65,j=0;i<97;i++,j++)
		{
			if(j<25)
			{
				ab[j]=""+(char)i;
				System.out.println(" "+ab[j]);
			}
		}
		ab[25]=""+'Z';
		
		String abb[]=new String[26];
		for(int i=98,j=0;i<123;i++,j++)
		{
			if(j<25)
			{
				abb[j]=""+(char)i;
				System.out.println(" "+ab[j]);
			}
		}
		abb[25]=""+'z';
		
		
		
		
		for(int i=0;i<26;i++)
			System.out.print(" *"+ab[i]);
	
		int c=0;
		
		for(int i=1;i<27;i++)
		{
			for(int j=0;j<28;j++)
			{
				if(c<26)
				{
					alpha[i][j]=ab[c];
					c++;
				}
				else
					c=0;
			}
		}
		
		System.out.print("\n");
		
		//alpha[4][5]=null;
	
		int cc=97;
	
		for(int i=0;i<1;i++)
		{
			for(int j=1;j<28;j++)
			{
				if(cc<123)
				{
					alpha[i][j]=""+(char)cc;
					cc++;
				}
			}
		}
	
		for(int i=0;i<27;i++)
		{
			for(int j=0;j<27;j++)
			{
				String s=alpha[i][j];
				System.out.print(" "+s);
			}
			System.out.print("\n\n\n\n");
		}
		
		String etxt="";
		Character ss1=new Character('0'),ss2=new Character('0');
		int vv=txt.length();
		
		
		for(int i=0,c1=0;i<ls;i++,c1++)
		{
			if(c1+1<vv)
			{
				ss1=key1.charAt(c1);
				ss2=txt.charAt(c1);
			}
			
			//ss1.toUpperCase();ss2.toUpperCase();
			//char ckey=ss1.charAt(0);
			//char ctxt=ss2.charAt(0);
			
			
			
			etxt+=alpha[(int)ss2-64][(int)ss1-64];
			
			
			
			
			
			//System.out.println("ss1  "+ss1+"   ss2"+ss2);
			
			/*for(int m=1;m<27;m++)
			{
				//System.out.println(k+"  "+alpha[m][0]);
				if(alpha[m][0].equals(ss1))
				{
					System.out.println(ss1+" at location  "+(m));
					for(int j=1;j<28;j++)
					{
						if(alpha[0][j].equals(ss2))
						{
							etxt+=alpha[m-1][j];
						}
					}
				}			
			}*/
			//System.out.println(" ");
		}
		
		System.out.println("text"+etxt);
	}
	public static void main(String []args)
	{
		new Vigener();
	}
	
}