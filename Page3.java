//page 3
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Page3{
public static void main(String args[]){
Instruction obj=new Instruction();
}
}

class Instruction extends JFrame{
JButton b1,b2,b3,b4,b5;
JLabel main;
JLabel main1;
JLabel main2;
int bal=10000;

public Instruction(){
setVisible(true);
setSize(550,500);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

b1=new JButton("1. Balance");
b2=new JButton("2. Withdraw");
b3=new JButton("3. Deposit");
b4=new JButton("4. Transfer");
//b5=new JButton("5. Quit");
add(b1);
add(b2);
add(b3);
add(b4);
//add(b5);

JLabel l1=new JLabel("Enter your choice: ");
add(l1);
JTextField choice=new JTextField(10);
add(choice);

JButton enter=new JButton("ENTER");
add(enter);

enter.addActionListener(new ActionListener(){//start of button
public void actionPerformed(ActionEvent ae){//start of action performed

int op=Integer.parseInt(choice.getText()); 


switch(op){//start of switch
case 1:{//caase 1 start
main=new JLabel("The balance = "+bal);
add(main);
JTextArea textOnScreen = new JTextArea(1,400);
textOnScreen.setEditable(false);
add(textOnScreen);
break;
}//end of case 1

case 2:{//start of case 2
main1=new JLabel("Please Enter the amount you want to withdraw");
add(main1);
JTextField amt=new JTextField(10);
add(amt);
JButton ok=new JButton("OK");
add(ok);

ok.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
int withdrawamt=Integer.parseInt(amt.getText());
if(withdrawamt>bal){//start of if
main2=new JLabel("The withdraw amount is greater than the balance");
add(main2);
JTextArea textOnScreen = new JTextArea(1,400);
textOnScreen.setEditable(false);
add(textOnScreen);

}//end of if

else{//start of else
main2=new JLabel("Amount of "+withdrawamt+" is withdrawn");
add(main2);
bal=bal-withdrawamt;
JTextArea textOnScreen = new JTextArea(1,400);
textOnScreen.setEditable(false);
add(textOnScreen);

}//end of else
}
});
break;
}//end of case 2

case 3:{//start of case 3
main=new JLabel("Please enter the amount you want to deposit");
add(main);
JTextField deposit=new JTextField(10);
add(deposit);

JButton ok1=new JButton("OK");
add(ok1);
ok1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
int dep=Integer.parseInt(deposit.getText());
bal=bal+dep;
JLabel s=new JLabel("amount of "+dep+" has been deposited");
add(s);
JTextArea textOnScreen = new JTextArea(1,400);
textOnScreen.setEditable(false);
add(textOnScreen);

}
});
break;
}//end of case 3

case 4:{
main=new JLabel("Please enter the amount you want to transfer");
add(main);
JTextField t1=new JTextField(10);
add(t1);
main1=new JLabel("Please enter the user to whom you want to transfer the amount");
add(main1);
JTextField t2=new JTextField(10);
add(t2);
JButton ok2=new JButton("OK");
add(ok2);

ok2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
String user=t2.getText();
int transfer=Integer.parseInt(t1.getText());
if(transfer>bal){//start of if
JLabel label=new JLabel("The transfer amount is greater than the balance");
add(label);
JTextArea textOnScreen = new JTextArea(1,400);
textOnScreen.setEditable(false);
add(textOnScreen);

}//end of if

else{//start of else
JLabel label1=new JLabel("Amount of "+transfer+" is transfered to "+user);
add(label1);
bal=bal-transfer;
JTextArea textOnScreen = new JTextArea(1,400);
textOnScreen.setEditable(false);
add(textOnScreen);

}//end of else
}
});
break;
}

default: {
JLabel w=new JLabel("Enter a correct choice");
JTextArea textOnScreen = new JTextArea(1,400);
textOnScreen.setEditable(false);
add(textOnScreen);

}



}//end of switch
}//end of action performed
});//end of button 1

}//end of constructor



}//end of class