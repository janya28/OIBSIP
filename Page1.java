//page 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

class Page1{
public static void main(String args[]){
First obj=new First();
}
}
class First extends JFrame{
public First(){
setSize(400,400);
setVisible(true);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel l1=new JLabel("Welcome to JAVA Bank !");
add(l1);

JTextArea textOnScreen = new JTextArea(1,400);
textOnScreen.setEditable(false);
add(textOnScreen);
/*ImageIcon image=new ImageIcon("bank.webp");
add(new JLabel(image));*/

JLabel label1=new JLabel("Enter your username",JLabel.LEFT);
JLabel label2=new JLabel("Enter your password");
JTextField t1=new JTextField(20);
JPasswordField password1=new JPasswordField(20);
add(label1);
add(t1);
add(label2);
add(password1);

JButton login=new JButton("LOGIN");
add(login);

JTextArea textOnScreen1 = new JTextArea(1,400);
textOnScreen1.setEditable(false);
add(textOnScreen1);

JLabel suggestion=new JLabel("CREATE AN ACCOUNT");
add(suggestion);
JButton create=new JButton("CREATE ACCOUNT");
add(create);
create.setSize(20,20);

create.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
new Details();
}
});

login.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
new Instruction();
}
});

}
}