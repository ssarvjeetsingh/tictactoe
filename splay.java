 package game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class splay implements ActionListener
{
JFrame f1;
JButton bo[]=new JButton[9];
Panel p;
Random ran=new Random();
int d,pp;
int ch;
int count,finish;
int s[];
JButton j1,j2;
Color clr;
splay()
{


f1=new JFrame("splay");
s=new int[9];
p=new Panel();
j1=new JButton(game.single3.t1.getText());
j2=new JButton("computer");
for(int i=0;i<9;i++)
{
s[i]=8;	
bo[i]=new JButton(" ");
}
j1.setBackground(Color.blue);
j2.setBackground(Color.red);
p.setLayout(new GridLayout(3,3));
for(int i=0;i<9;i++)
{
p.add(bo[i]);
}

f1.add(p,BorderLayout.CENTER);
f1.add(j1,BorderLayout.WEST);
f1.add(j2,BorderLayout.EAST);

j1.setBackground(Color.white);
j2.setBackground(Color.white);
j2.setForeground(Color.red);
j1.setForeground(Color.blue);
j1.setFont(new Font("Bold",Font.PLAIN,20));
j2.setFont(new Font("Bold",Font.PLAIN,20));

f1.setVisible(true);
f1.setSize(500,500);
for(int i=0;i<9;i++)
{
	bo[i].setFont(new Font("Bold",Font.PLAIN,50));

bo[i].setBackground(Color.WHITE);	

bo[i].addActionListener(this);
}

}

public void actionPerformed(ActionEvent e)
{
int h=0,ranch=0,auto=0,per=0;        	
for(int i=0;i<9;i++)
{
if(e.getSource()==bo[i])
{
 auto=1;
 h=i;
  break;
}
}

if(auto==1)
{
String st=bo[h].getLabel();///manual
if(st.equals(" "))
{
bo[h].setForeground(Color.blue);
d++;
count=count+1;
s[h]=2;
bo[h].setLabel("0");
handle();
per=1;

}
}

if(count!=5)    ////for last chance////comp
{
if(per==1)      /////not repeat 
{
while(ranch!=10)   ////for random//
{
random();

String st1=bo[ch].getLabel();
if(st1.equals(" "))
{

bo[ch].setForeground(Color.red);
	d++;
s[ch]=1;
ranch=10;
bo[ch].setLabel("X");
//bo[ch].setBackground(Color.blue);

handle();
}

}/// while

}///repeat


}///count
}

void random()
{
ch=ran.nextInt(9);
}


void handle()
{

if((s[0]+s[1]+s[2]==3)||(s[0]+s[1]+s[2]==6))
{
if(s[0]==1)
{
	System.out.print("1 k 1 wala");
	clr=Color.red;
	colr(0,1,2);
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[0]==2)
{

	clr=Color.blue;
	colr(0,1,2);
System.out.print("1 k 2 wala");

JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);
}

count=5;
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
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
if(s[0]==2)
{
	System.out.print("2 k 2 wala");
	clr=Color.blue;
	colr(0,3,6);
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);
}
count=5;
finish=1;
}

else
if((s[0]+s[4]+s[8]==3)||(s[0]+s[4]+s[8]==6))
{
if(s[0]==1)
{System.out.print("3 k 1 wala");
clr=Color.red;
	colr(0,4,8);
	JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[0]==2)
{
	clr=Color.blue;
	colr(0,4,8);
	System.out.print("3 k 2 wala");
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
count=5;
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
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);
}
else
	if(s[1]==2)
{
	clr=Color.blue;
	colr(1,4,7);
	System.out.print("4 k 2 wala");
	JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);
}
count=5;
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
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[2]==2)
{
	clr=Color.blue;
	colr(2,5,8);
	System.out.print("5 k 2 wala");
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
count=5;
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
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[2]==2)
{
		clr=Color.blue;
	colr(2,4,6);
	System.out.print("6 k 2 wala");
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
count=5;
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
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[3]==2)
{
		clr=Color.blue;
	colr(3,4,5);
	System.out.print("7 k 2 wala");
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}

count=5;
finish=1;
}
else
if((s[6]+s[7]+s[8]==3)||(s[6]+s[7]+s[8]==6))
{

if(s[6]==1)
{	clr=Color.red;
	colr(6,7,8);
	System.out.print("8 k 1 wala");
JOptionPane.showMessageDialog(f1,"youlose","resultbox",JOptionPane.INFORMATION_MESSAGE);

}
else
if(s[6]==2)
{
		clr=Color.blue;
	colr(6,7,8);

JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
count=5;
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
 	f1.setVisible(false);
new splay();	
}
else
{
f1.setVisible(false);

}
}

}

void colr(int i,int j,int k)
{
bo[i].setBackground(clr);
bo[j].setBackground(clr);
bo[k].setBackground(clr);
}



public static void main(String ar[])
{

new splay();
}
}