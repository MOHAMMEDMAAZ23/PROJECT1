import java.awt.*;
import java.awt.event.*;
public class mlex extends Frame implements MouseListener
{
Label l;
mlex()
{
addMouseListener(this);
l= new Label();
l.setBounds(25,50,100,20);
add(l);
setLayout(null);
setSize(300,300);
setVisible(true);
}

public void mouseClicked(MouseEvent e)
{
l.setText("Mouse clicked");
}
public void mouseEntered(MouseEvent e)
{
l.setText("Mouse Entered");
}
public void mouseExited(MouseEvent e)
{
l.setText("Mouse Exited");
}
public void mousePressed(MouseEvent e)
{
l.setText("Mouse Pressed");
}
public void mouseReleased(MouseEvent e)
{
l.setText("Mouse Released");
}
public static void main(String[]args)
{
new mlex();
}
}
