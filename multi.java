package game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class multi implements ActionListener
{
JFrame f1;
JButton b1,b2;
JLabel l1,l2;
static JTextField t1,t2;
ImageIcon im;
JLabel back;
multi()
{
f1=new JFrame("multi");
l1=new JLabel("1.player name");
l2=new JLabel("2.player name");
//l1.setFont()
t1=new JTextField();
t2=new JTextField();

b1=new JButton("Play");
b2=new JButton("Back");
l1.setFont(new Font("Bold",Font.PLAIN,20));
l2.setFont(new Font("Bold",Font.PLAIN,20));

b1.setFont(new Font("Bold",Font.PLAIN,20));
b2.setFont(new Font("Bold",Font.PLAIN,20));


t1.setFont(new Font("Bold",Font.PLAIN,20));
t2.setFont(new Font("Bold",Font.PLAIN,20));

im=new ImageIcon("tk3.jpg");
Image newim=im.getImage();
	    Image modif=newim.getScaledInstance(1366,768,java.awt.Image.SCALE_SMOOTH);
		ImageIcon ic=new ImageIcon(modif);

 back=new JLabel("",ic,JLabel.CENTER);
f1.setLayout(null);
l1.setBounds(500,200,100,30);
t1.setBounds(590,200,80,30);

l2.setBounds(500,250,100,30);
t2.setBounds(590,250,80,30);

b1.setBounds(500,300,80,30);
b2.setBounds(600,300,80,30);
back.setBounds(0,0,1366,768);

f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
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
new mplay();
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

new multi();
}
}