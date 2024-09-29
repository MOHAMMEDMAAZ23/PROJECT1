import java.awt.*;
import java.awt.event.*;
public class keydemo extends Frame implements KeyListener
{
Label l;
keydemo()
{
addKeyListener(this);
l= new Label();
l.setBounds(100,100,100,100);
l.setFont(new Font("Calibri",Font.BOLD,8));
add(l);
setLayout(null);
setSize(400,400);
setVisible(true);
}

public void keyPressed(KeyEvent e)
{
if(e.getKeyChar()=='M'||e.getKeyChar()=='m')
l.setText("Good Morning");
if(e.getKeyChar()=='A'||e.getKeyChar()=='a')
l.setText("Good Afternoon");
if(e.getKeyChar()=='E'||e.getKeyChar()=='e')
l.setText("Good Evening");
if(e.getKeyChar()=='N'||e.getKeyChar()=='n')
l.setText("Good Night");
}
public void keyReleased(KeyEvent e)
{}
public void keyTyped(KeyEvent e)
{}
public static void main(String[]args)
{
new keydemo();
}
}