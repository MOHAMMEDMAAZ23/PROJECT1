import java.awt.*;
import java.awt.event.*;
public class Appletpi extends WindowAdapter
{
Appletpi()
{
Frame fm=new Frame();
fm.setSize(400,400);
fm.setTitle("My Personal Info");
fm.setVisible(true);

Label nm= new Label("Name : Maaz");
Label age= new Label("Age : 18");
Label addr= new Label("Address : ilyasnagar,JP Nagar");
Label city= new Label("City : Bangalore");
Label pin= new Label("pincode : 560078");

nm.setBounds(50,100,100,30);
age.setBounds(50,150,100,30);
addr.setBounds(50,200,100,30);
city.setBounds(50,250,100,30);
pin.setBounds(50,300,100,30);

fm.add(nm);
fm.add(age);
fm.add(addr);
fm.add(city);
fm.add(pin);
fm.setLayout(null);
fm.addWindowListener(this);
}
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
public static void main(String[]args)
{
new Appletpi();
}
}