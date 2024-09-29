import java.applet.Applet;
import java.awt.*;
import java.awt.*;
public class appletgrid extends Applet
{
public void init()
{
setLayout(new GridLayout(5,5));
for(int i=1;i<5;i++)
{
Button b1=new Button();
bt1.setBackground(Color.black);
Button bt2=new Button();
Button bt3=new Button();
bt3.setBackground(Color.black);
Button bt4=new Button();
add(bt1);
add(bt2);
add(bt3);
add(bt4);
}
}
}


