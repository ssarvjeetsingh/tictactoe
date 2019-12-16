package game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class option implements ActionListener
{
JFrame f1;
JButton b1,b2;
ImageIcon im;
JLabel back;
option()
{
f1=new JFrame("option");
b1=new JButton("Single player");
b2=new JButton("Two player");
im=new ImageIcon("tk1.jpg");
Image newim=im.getImage();
	    Image modif=newim.getScaledInstance(1366,768,java.awt.Image.SCALE_SMOOTH);
		ImageIcon ic=new ImageIcon(modif);
b1.setFont(new Font("normal",Font.PLAIN,20));
b2.setFont(new Font("normal",Font.PLAIN,20));
 back=new JLabel("",ic,JLabel.CENTER);
f1.setLayout(null);
b1.setBounds(250,350,200,50);
b2.setBounds(470,350,200,50);
back.setBounds(0,0,1366,768);
f1.add(b1);
f1.add(b2);
f1.add(back);
f1.setVisible(true);
f1.setSize(1366,786);

b1.addActionListener(this);
b2.addActionListener(this);

}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
	
f1.setVisible(false);
new single3();
}

else
if(e.getSource()==b2)
{
	
f1.setVisible(false);
new multi();
}

}

public static void main(String ar[])
{
new option();
}

}