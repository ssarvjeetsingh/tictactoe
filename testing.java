 package game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class testing implements ActionListener,Runnable
{
JFrame f1;
JButton bo[]=new JButton[9];
Panel p;
Random ran=new Random();
int s[],d,pp;
int ch,count;
JRadioButton j1,j2;
Thread t;
testing(String temp)
{
f1=new JFrame("splay");
s=new int[9];
p=new Panel();

j1=new JRadioButton();
j2=new JRadioButton("computer");
for(int i=0;i<9;i++)
{
	s[i]=8;
bo[i]=new JButton(" ");
}
j1.setBackground(Color.green);
j2.setBackground(Color.red);
p.setLayout(new GridLayout(3,3));
for(int i=0;i<9;i++)
{
p.add(bo[i]);
}

f1.add(p,BorderLayout.CENTER);
f1.add(j1,BorderLayout.WEST);
f1.add(j2,BorderLayout.EAST);


f1.setVisible(true);
f1.setSize(500,500);

for(int i=0;i<9;i++)
{
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

j1.setBackground(Color.red);
j2.setBackground(Color.green);


d++;
count=count+1;
s[h]=2;
bo[h].setLabel("0");
//handle();
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
t=new Thread(this);
t.start();
j1.setBackground(Color.green);
j2.setBackground(Color.red);

	d++;
s[ch]=1;
ranch=10;
bo[ch].setLabel("X");
//bo[ch].setBackground(Color.blue);

//handle();
}

}/// while

}///repeat


}///count
}

void random()
{
ch=ran.nextInt(9);
}

public void run()
{
for(int i=0;i<1;i++)
{

try
{
Thread.sleep(40);
}
catch(Exception ee)
{
System.out.print(ee);
}
}
}

/*void handle()
{

if((s[0]+s[1]+s[2]==3)||(s[0]+s[1]+s[2]==6))
{
if(s[0]==1)
{
	System.out.print("1 k 1 wala");
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
if(s[0]==2)
{
System.out.print("1 k 2 wala");
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);
}
count=5;
f1.setVisible(false);
//new single3();
}
else
if((s[0]+s[3]+s[6]==3)||(s[0]+s[3]+s[6]==6))
{

if(s[0]==1)
{
	System.out.print("2 k 1 wala");
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
if(s[0]==2)
{
	System.out.print("2 k 2 wala");
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);
}

count=5;
f1.setVisible(false);
//new single3();
}

else
if((s[0]+s[4]+s[8]==3)||(s[0]+s[4]+s[8]==6))
{
if(s[0]==1)
{System.out.print("3 k 1 wala");
	JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
	if(s[0]==2)
{
	System.out.print("3 k 2 wala");
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
count=5;
f1.setVisible(false);
//new single3();
}

else
if((s[1]+s[4]+s[7]==3)||(s[1]+s[4]+s[7]==6))
{

if(s[1]==1)
{System.out.print("4 k 1 wala");
//b13=new Label(t4.getText()+"  "+"Wins");
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);
}
else
if(s[1]==2)
{
	System.out.print("4 k 2 wala");
	JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);
}
count=5;
f1.setVisible(false);
//new single3();
}

else
if((s[2]+s[5]+s[8]==3)||(s[2]+s[5]+s[8]==6))
{

if(s[2]==1)
{
	System.out.print("5 k 1 wala");
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
if(s[2]==2)
{
	System.out.print("5 k 2 wala");
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
count=5;
f1.setVisible(false);
//new single3();
}

else
if((s[2]+s[4]+s[6]==3)||(s[2]+s[4]+s[6]==6))
{

if(s[2]==1)
{
	System.out.print("6 k 1 wala");
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
if(s[2]==2)
{
	System.out.print("6 k 2 wala");
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
count=5;
f1.setVisible(false);
//new single3();
}
else
if((s[3]+s[4]+s[5]==3)||(s[3]+s[4]+s[5]==6))
{

if(s[3]==1)
{
	System.out.print("7 k 1 wala");
JOptionPane.showMessageDialog(f1,"youlose","result box",JOptionPane.INFORMATION_MESSAGE);

}
else
if(s[3]==2)
{
	System.out.print("7 k 2 wala");
JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
count=5;
f1.setVisible(false);
//new single3();
}
else
if((s[6]+s[7]+s[8]==3)||(s[6]+s[7]+s[8]==6))
{

if(s[6]==1)
{
	System.out.print("8 k 1 wala");
JOptionPane.showMessageDialog(f1,"youlose","resultbox",JOptionPane.INFORMATION_MESSAGE);

}
else
if(s[6]==2)
{
System.out.print("8 k 2 wala");

JOptionPane.showMessageDialog(f1,game.single3.t1.getText()+" Win","result box",JOptionPane.INFORMATION_MESSAGE);

}
count=5;
f1.setVisible(false);
//new single3();
}
else
if(d==9)
{
System.out.print("draw wala");

JOptionPane.showMessageDialog(f1,"MatchDraw","result box",JOptionPane.INFORMATION_MESSAGE);
f1.setVisible(false);
//new single3();

}
}*/




public static void main(String ar[])
{

new testing("hii");
}
}