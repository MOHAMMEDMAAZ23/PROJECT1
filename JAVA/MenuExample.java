import java.awt.*;
import java.awt.event.*;
public class MenuExample extends WindowAdapter
{
MenuExample()
{
Frame fm=new Frame("Menu and MenuItem Example");
MenuBar mb=new MenuBar();
Menu menu=new Menu("File");
Menu submenu=new Menu("Zoom");
MenuItem i1=new MenuItem("New");
MenuItem i2=new MenuItem("Open");
MenuItem i3=new MenuItem("Save");
MenuItem i4=new MenuItem("Zoom in");
MenuItem i5=new MenuItem("Zoom Out");
menu.add(i1);
menu.add(i2);
menu.add(i3);
submenu.add(i4);
submenu.add(i5);
menu.add(submenu);
mb.add(menu);
fm.setMenuBar(mb);
fm.setSize(400,400);
fm.setLayout(null);
fm.setVisible(true);
fm.addWindowListener(this);
}
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
public static void main(String[]args)
{
new MenuExample();
}
}




