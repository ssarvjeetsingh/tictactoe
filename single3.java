package game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class single3 implements ActionListener
{
JFrame f1;
JButton b1,b2;
JLabel l1;
static JTextField t1;
ImageIcon im;
JLabel back;
single3()
{
f1=new JFrame("single");
l1=new JLabel("player name");
t1=new JTextField();
b1=new JButton("Play");
b2=new JButton("Back");
im=new ImageIcon("tk5.jpg");
Image newim=im.getImage();
	    Image modif=newim.getScaledInstance(1366,768,java.awt.Image.SCALE_SMOOTH);
		ImageIcon ic=new ImageIcon(modif);
l1.setFont(new Font("Bold",Font.PLAIN,20));


b1.setFont(new Font("Bold",Font.PLAIN,20));
b2.setFont(new Font("Bold",Font.PLAIN,20));


t1.setFont(new Font("Bold",Font.PLAIN,20));

 back=new JLabel("",ic,JLabel.CENTER);
f1.setLayout(null);
l1.setBounds(400,300,120,30);
t1.setBounds(520,300,80,30);
b1.setBounds(450,350,80,30);
b2.setBounds(540,350,80,30);
back.setBounds(0,0,1366,768);

f1.add(l1);
f1.add(t1);
f1.add(b1);
f1.add(b2);
f1.add(back);
f1.setVisible(true);
f1.setSize(1366,768);
b1.addActionListener(this);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
	//f1.setVisible(false);
new splay();
}
else
if(e.getSource()==b2)
{
	f1.setVisible(false);
new option();
}
}

public static void main(String ar[])
{

new single3();
}
}