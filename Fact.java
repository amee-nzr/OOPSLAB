import java.awt.*;
import java.awt.event.*;
public class Fact extends Frame implements ActionListener
{
TextField tf1,tf2;
Button b;
Fact()
{
tf1=new TextField();
tf1.setBounds(50,50,150,20);
tf2=new TextField();
tf2.setBounds(50,100,150,20);
tf2.setEditable(false);

b=new Button("calculate");
b.setBounds(50,150,60,30);
b.addActionListener(this);

add(tf1);add(tf2);add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
int n=Integer.parseInt(tf1.getText());
int factorial=1;
int i;
for(i=1;i<=n;i++)
{
factorial=factorial*i;
}
tf2.setText(String.valueOf(factorial));
}
public static void main(String args[])
{
new Fact();
}
}


 
