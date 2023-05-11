//project 2
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

class Game{
public static void main(String args[]){
Number obj=new Number();
}
}

class Number extends JFrame{
int score=10;
public Number(){

setSize(550,1000);
setVisible(true);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel l=new JLabel("Welcome to Number Game !!");
add(l);
JTextArea textOnScreen = new JTextArea(1,400);
textOnScreen.setEditable(false);
add(textOnScreen);
JLabel l1=new JLabel("INSTRUCTIONS");
add(l1);
JLabel l2=new JLabel("1.The System thinks of a number and you have to guess it");
add(l2);
JLabel l3=new JLabel("2.Enter your choice in the box");
add(l3);
JLabel l4=new JLabel("3.Based on your input, you recieve clues");
add(l4);
JLabel l5=new JLabel("4.You will be awarded with 10 points in the begining");
add(l5);
JLabel l6=new JLabel("5.If you take n chances, n gets deducted from 10");
add(l6);
JLabel l7=new JLabel("6.The number choosed by the computer is between 0 to 100");
add(l7);
JLabel l8=new JLabel("Score = 10");
add(l8);
JLabel l9=new JLabel("ALL THE BEST !");
add(l9);


JTextArea textOnScreen1 = new JTextArea(1,400);
textOnScreen1.setEditable(false);
add(textOnScreen1);

JLabel l10=new JLabel("Please enter your choice");
add(l10);
JTextField t1=new JTextField(10);
add(t1);

int sysn=1+(int)(100*Math.random());
JButton b1=new JButton("Enter");
add(b1);

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
int usern=Integer.parseInt(t1.getText());

/*JLabel ans=new JLabel("the no is "+sysn);
add(ans);*/

if(score!=0){
if(usern==sysn){
JLabel l11=new JLabel("Congratulations you won ! your score is "+score);
add(l11);
JTextArea textOnScreen2 = new JTextArea(1,400);
textOnScreen2.setEditable(false);
add(textOnScreen2);
}
if(usern>sysn){//50>65
JLabel l11=new JLabel("Ooops! Enter the number less than "+usern);
add(l11);
score=score-1;
JTextArea textOnScreen2 = new JTextArea(1,400);
textOnScreen2.setEditable(false);
add(textOnScreen2);
}
if(usern<sysn){//20<65
JLabel l11=new JLabel("Ooops! Enter the number greater than "+usern);
add(l11);
score=score-1;
JTextArea textOnScreen2 = new JTextArea(1,400);
textOnScreen2.setEditable(false);
add(textOnScreen2);
}
}
else{
JLabel l11=new JLabel("YOUR SCORE IS 0");
add(l11);
JLabel l12=new JLabel("The number chosed by the system is "+sysn);
add(l12);
JTextArea textOnScreen2 = new JTextArea(1,400);
textOnScreen2.setEditable(false);
add(textOnScreen2);

}
}
});
}
}