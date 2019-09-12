import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Column extends Frame implements ActionListener 
{
	String s;
	int key;
	Label jl[]=null;
	Label head[]=null;
	String ss;
	int a;
	JTextField jt,jtkey;
	JButton jb;
	JLabel jll,jl1,jl2,l3,l4;
	Column()
	{
		super("Column");
		setLayout(null);
		setBackground(Color.black);
		jl1=new JLabel("Columnar");
		jl1.setFont(new Font("Comic Sans MS 14",Font.ITALIC,50));
		jl1.setForeground(Color.yellow);
		jl1.setBounds(550,10,300,50);
		add(jl1);

	

		 l3=new JLabel();
		l3.setBounds(800,660,200,30);
		l3.setFont(new Font("Comic Sans MS 14",Font.PLAIN,20));
		l3.setForeground(Color.yellow);
		add(l3);
	
		 l4=new JLabel();
		l4.setBounds(800,600,200,30);
		l4.setFont(new Font("Comic Sans Ms 14",Font.PLAIN,20));
		l4.setForeground(Color.blue);
		add(l4);

		jll=new JLabel("Enter Text");
		jll.setBounds(200,100,100,30);
		jll.setForeground(Color.blue);
		
		jll.setFont(new Font("Comic Sans MS 14",Font.ITALIC,20));
		jll.setBorder(new LineBorder(Color.blue,2));
		add(jll);

		jt=new JTextField();
		jt.setBounds(400,100,150,30);
		jt.setForeground(Color.blue);
		jt.setBorder(new LineBorder(Color.black,2));
		jt.setFont(new Font("Comic Sans MS 14",Font.ITALIC,20));
		add(jt);


		jl2=new JLabel("Enter Key Order");
		jl2.setFont(new Font("Comic Sans MS 14",Font.ITALIC,20));
		jl2.setForeground(Color.blue);
		jl2.setBorder(new LineBorder(Color.blue,2));
		jl2.setBounds(200,180,150,30);
		add(jl2);

		jtkey=new JTextField();
		jtkey.setBounds(400,180,150,30);
		jtkey.setForeground(Color.blue);
		jtkey.setBorder(new LineBorder(Color.black,2));
		jtkey.setFont(new Font("Comic Sans MS 14",Font.ITALIC,20));
		add(jtkey);
		
		jb=new JButton("Ok");
		jb.setBounds(650,150,100,30);
		jb.setForeground(Color.blue);
		jb.setBackground(Color.black);
		jb.setBorder(new LineBorder(Color.green,2));
		jb.setFont(new Font("Comic Sans MS 14",Font.ITALIC,20));
		jb.addActionListener(this);
		add(jb);
		
		setUndecorated(true);
		setSize(1367,768);
		setVisible(true);	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		JButton b=(JButton)ae.getSource();
		s=jt.getText();
		key=Integer.parseInt(jtkey.getText());
		
		if(b==jb){
		int ls=s.length();
			
		head=new Label[key];
		
		int col=0;
		
		for(int i=0;i<ls;i++)
		{
			if(i*key>=ls)
			{
				col=i;
				break;
			}
		}
		
		String ss[][]=new String[col][key];
		
		for(int i=0,x=50;i<key;i++,x+=50)
		{
			head[i]=new Label(""+(i+1));
			head[i].setBounds(x,300,50,50);
			head[i].setFont(new Font("Comic Sans MS 14",Font.PLAIN,25));
			add(head[i]);
			head[i].setBackground(Color.red);
			try{Thread.sleep(250);}catch(Exception eee1){}
		}
			
		jl=new Label[ls];	
			
			
		
		for(int i=0,x=450;i<ls;i++,x+=50)
		{
				jl[i]=new Label(""+s.charAt(i));
				jl[i].setForeground(Color.blue);
				jl[i].setBackground(Color.yellow);
				jl[i].setFont(new Font("Comic Sans MS 14",Font.PLAIN,25));
				add(jl[i]);
			
				jl[i].setBounds(x,400,50,50);
				try{Thread.sleep(250);}catch(Exception eee1){}
		}
		
		
		int flg=ls;		
		int k=0;
		for(int i=0,y=350;i<col;i++,y+=50)
		{
			for(int j=0,x=50;j<key;j++,x+=50)
			{
				if(k<ls)
				{
					jl[k].setBounds(x,y,50,50);
					jl[k].setFont(new Font("Comic Sans MS 14",Font.PLAIN,25));	
					//add(jl[k]);
					//flg--;
					k++;
					try{Thread.sleep(250);}catch(Exception eee1){}
				}
				else
					break;
			}
		}
			
			
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<key;j++)
			{
				ss[i][j]="";
			}
		}
			
			
		int k1=0;
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<key;j++)
			{
				if(k1<ls)
				ss[i][j]=jl[k1++].getText();
			}
		}
			k1=0;
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<key;j++)
			{
					System.out.println(" "+ss[i][j]);
			}
		}
			
		
		int order[]=new int[key];
		
		order[0]=6;order[1]=3;order[2]=2;order[3]=4;order[4]=1;order[5]=5;
		//int order=Integer.parseInt(jtkey.getText());
			
		String s="";
		for(int z=0;z<key;z++)
		{
			for(int i=0;i<col;i++)
			{
				for(int j=0;j<key;j++)
				{
					if(j==order[z]-1)
					{
						s+=ss[i][j];
						System.out.println("z:"+z+" i:"+i+" j:"+j+"      "+ss[i][j]);
						l4.setText("Cipher Text Is");
						l3.setText(" "+s);
					
					}
				}
			}
	
		}
		
		System.out.println(s);
		//l3.setText(" "+s);
		//l3.setForeground(Color.white);
		}
		
	}

	public static void main(String []args)
	{
		new Column();
	}
	
}