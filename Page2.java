//Page2

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

class Page2{
public static void main(String args[]){
Details obj=new Details();
}
}
class Details extends JFrame //implements ActionListener
{
private static JPasswordField password2;
private static JPasswordField password1;
private static JLabel l1;
private static JTextField t1;
private static JLabel l2;
private static JTextField t2;
private static JLabel l3;
private static JLabel l4;
public Details()
{
setSize(350,400);
setVisible(true);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel l=new JLabel("CREATING AN ACCOUNT");
JLabel label=new JLabel("ENTER YOUR DETAILS");
add(l);
add(label);

l1=new JLabel("Enter your name");
add(l1);
t1=new JTextField(20);
add(t1);

l2=new JLabel("Enter your phone number");
add(l2);
t2=new JTextField(20);
add(t2);
JButton otp=new JButton("OK");
add(otp);

JLabel l3=new JLabel("Enter your address");
add(l3);
JTextField password1=new JTextField(50);
add(password1);

JLabel user=new JLabel("Enter your username");
add(user);
JTextField s=new JTextField(20);
add(s);
JLabel k1=new JLabel("An OTP is sent to your phone!!");
JLabel k2=new JLabel("Enter your OTP");
add(k1);
add(k2);



JPasswordField pwd=new JPasswordField(20);
add(pwd);

JLabel l5=new JLabel("Select your Gender",JLabel.LEFT);
add(l5);

JRadioButton r1=new JRadioButton("MALE");
JRadioButton r2=new JRadioButton("FEMALE");
add(r1);
add(r2);
ButtonGroup bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);

JLabel l6=new JLabel("Select your Marital Status",JLabel.LEFT);
add(l6);
JRadioButton r3=new JRadioButton("MARRIED");
JRadioButton r4=new JRadioButton("UNMARRIED");
add(r3);
add(r4);
ButtonGroup bg1=new ButtonGroup();
bg1.add(r3);
bg1.add(r4);



JLabel done=new JLabel("");
add(done);
JButton b=new JButton("LOGIN");
add(b);

b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
new Instruction();
}
});

}
}