 package game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class mplay implements ActionListener
{
JFrame f1;
JButton b[]=new JButton[9];
Panel p,p2,p3;
int s[],d;
JButton jb1,jb2;
int a,finish;
Color clr;
JButton l1,l2,l3,l4;
int sum=0,sum2=0;
mplay()
{
f1=new JFrame("mplay");
s=new int[9];
p=new Panel();
p2=new Panel();
p3=new Panel();
l1=new JButton("0");
l2=new JButton("0");
l3=new JButton("score");
l4=new JButton("score");
jb1=new JButton(game.multi.t1.getText());
jb2=new JButton(game.multi.t2.getText());
for(int i=0;i<9;i++)
{
	s[i]=8;
b[i]=new JButton(" ");
}

p.setLayout(new GridLayout(3,3));
for(int i=0;i<9;i++)
{
p.add(b[i]);
}
l4.setBackground(Color.white);
l3.setBackground(Color.white);
l4.setForeground(Color.red);
l3.setForeground(Color.blue);




l1.setBackground(Color.white);
l2.setBackground(Color.white);
p2.setLayout(new GridLayout(1,1));
p3.setLayout(new GridLayout(1,1));
l1.setFont(new Font("Bold",Font.PLAIN,20));
l2.setFont(new Font("Bold",Font.PLAIN,20));

l2.setForeground(Color.red);
l1.setForeground(Color.blue);

p2.add(jb1);
//p2.add(l3);
//p2.add(l1);
p3.add(jb2);
//p3.add(l4);
///p3.add(l2);
f1.add(p,BorderLayout.CENTER);
f1.add(p2,BorderLayout.EAST);
f1.add(p3,BorderLayout.WEST);
jb1.setBackground(Color.white);
jb2.setBackground(Color.white);
jb2.setForeground(Color.red);
jb1.setForeground(Color.blue);
jb1.setFont(new Font("Bold",Font.PLAIN,20));
jb2.setFont(new Font("Bold",Font.PLAIN,20));
f1.setVisible(true);
f1.setSize(500,500);
for(int i=0;i<9;i++)
{
b[i].setFont(new Font("Bold",Font.PLAIN,50));

b[i].setBackground(Color.WHITE);	
b[i].addActionListener(this);
}

}

public void actionPerformed(ActionEvent e)
{
String sd=e.getActionCommand();
	for(int i=0;i<9;i++)
	{
		if(e.getSource()==b[i])
		{

			if(sd.equals(" "))
			{

				
				d=d+1;
				a=a+1;
				if(a%2==0)
				{
				    
					
					s[i]=1;
					b[i].setForeground(Color.red);
					b[i].setLabel("X");
					handle();
				}

				else
				if(a%2!=0)
				{
				
					
					
					s[i]=2;
					b[i].setForeground(Color.blue);
					b[i].setLabel("o");
					handle();
				}
			}

		}
	}

}///count


void handle()
{

if((s[0]+s[1]+s[2]==3)||(s[0]+s[1]+s[2]==6))
{
if(s[0]==1)
{
	System.out.print("1 k 1 wala");
	clr=Color.red;
	colr(0,1,2);
JOptionPane.showMessageDialog(f1,game.multi.t2.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[0]==2)
{

	clr=Color.blue;
	colr(0,1,2);
System.out.print("1 k 2 wala");

JOptionPane.showMessageDialog(f1,game.multi.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);
}
finish=1;


}
else
if((s[0]+s[3]+s[6]==3)||(s[0]+s[3]+s[6]==6))
{

if(s[0]==1)
{

	clr=Color.red;
	colr(0,3,6);
	System.out.print("2 k 1 wala");
JOptionPane.showMessageDialog(f1,game.multi.t2.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
if(s[0]==2)
{
	System.out.print("2 k 2 wala");
	clr=Color.blue;
	colr(0,3,6);
JOptionPane.showMessageDialog(f1,game.multi.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);
}

finish=1;
}

else
if((s[0]+s[4]+s[8]==3)||(s[0]+s[4]+s[8]==6))
{
if(s[0]==1)
{System.out.print("3 k 1 wala");
clr=Color.red;
	colr(0,4,8);
	JOptionPane.showMessageDialog(f1,game.multi.t2.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[0]==2)
{
	clr=Color.blue;
	colr(0,4,8);
	System.out.print("3 k 2 wala");
JOptionPane.showMessageDialog(f1,game.multi.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
finish=1;
}

else
if((s[1]+s[4]+s[7]==3)||(s[1]+s[4]+s[7]==6))
{

if(s[1]==1)

{
	clr=Color.red;
	colr(1,4,7);
	System.out.print("4 k 1 wala");
//b13=new Label(t4.getText()+"  "+"Wins");
JOptionPane.showMessageDialog(f1,game.multi.t2.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);
}
else
	if(s[1]==2)
{
	clr=Color.blue;
	colr(1,4,7);
	System.out.print("4 k 2 wala");
	JOptionPane.showMessageDialog(f1,game.multi.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);
}
finish=1;
}

else
if((s[2]+s[5]+s[8]==3)||(s[2]+s[5]+s[8]==6))
{

if(s[2]==1)
{
	clr=Color.red;
	colr(2,5,8);
	System.out.print("5 k 1 wala");
JOptionPane.showMessageDialog(f1,game.multi.t2.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[2]==2)
{
	clr=Color.blue;
	colr(2,5,8);
	System.out.print("5 k 2 wala");
JOptionPane.showMessageDialog(f1,game.multi.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
finish=1;
}

else
if((s[2]+s[4]+s[6]==3)||(s[2]+s[4]+s[6]==6))
{

if(s[2]==1)
{
	clr=Color.red;
	colr(2,4,6);
	System.out.print("6 k 1 wala");
JOptionPane.showMessageDialog(f1,game.multi.t2.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[2]==2)
{
		clr=Color.blue;
	colr(2,4,6);
	System.out.print("6 k 2 wala");
JOptionPane.showMessageDialog(f1,game.multi.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
finish=1;
}
else
if((s[3]+s[4]+s[5]==3)||(s[3]+s[4]+s[5]==6))
{

if(s[3]==1)
{
		clr=Color.red;
	colr(3,4,5);
	System.out.print("7 k 1 wala");
JOptionPane.showMessageDialog(f1,game.multi.t2.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[3]==2)
{
		clr=Color.blue;
	colr(3,4,5);
	System.out.print("7 k 2 wala");
JOptionPane.showMessageDialog(f1,game.multi.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
finish=1;
}
else
if((s[6]+s[7]+s[8]==3)||(s[6]+s[7]+s[8]==6))
{

if(s[6]==1)
{	clr=Color.red;
	colr(6,7,8);
	System.out.print("8 k 1 wala");
JOptionPane.showMessageDialog(f1,game.multi.t2.getText()+" Win","resultbox",JOptionPane.INFORMATION_MESSAGE);

}
else
if(s[6]==2)
{
		clr=Color.blue;
	colr(6,7,8);

JOptionPane.showMessageDialog(f1,game.multi.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
finish=1;
}
else
if(d==9)
{
System.out.print("draw wala");

JOptionPane.showMessageDialog(f1,"MatchDraw","result box",JOptionPane.INFORMATION_MESSAGE);
finish=1;

}
if(finish==1)
{
int v=JOptionPane.showConfirmDialog(f1,"replay","confirm box",JOptionPane.YES_NO_OPTION);
if (v==JOptionPane.YES_OPTION)
 {
 
    for(int i=0;i<9;i++)
    {


    	b[i].setLabel(" ");
    	b[i].setBackground(Color.WHITE);
    	s[i]=8;
    	
    }
    d=0;
    a=0;
finish=0;
}
else
{
f1.setVisible(false);

}
}

}

void colr(int i,int j,int k)
{



b[i].setBackground(clr);
b[j].setBackground(clr);
b[k].setBackground(clr);


}


public static void main(String ar[])
{

new mplay();
}
}