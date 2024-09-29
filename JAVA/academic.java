import java.awt.*;
import java.awt.event.*;
public class Academic extends WindowAdapter implements ActionListener
{
Frame fm;
Button bt1;
Dialog dl;
Academic()
{
Frame fm= new Frame();
Button bt1=new Button("Academic Details");
fm.setLayout(new FlowLayout());
fm.setSize(800,800);
fm.setTitle("My Academic Details");
fm.setVisible(true);
fm.add(bt1);
bt1.setBounds(210,70,320,30);
/*colg.setBounds(20,100,600,30);
course.setBounds(20,150,600,30);
sem.setBounds(20,200,600,30);
lang.setBounds(20,250,600,30);
oe.setBounds(20,300,600,30);*/
fm.addWindowListener(this);
bt1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand().equals("Academic Details"));
{
dl=new Dialog(fm,"My Academic Details",true);
Font myfont=new Font("calibri",Font.BOLD,16);
dl.setFont(myfont);
dl.setForeground(Color.RED);
Label colg= new Label("College : SSMRV");
Label course= new Label("Course : BCA");
Label sem= new Label("Sem : 2nd sem");
Label lang= new Label("Language : hindi");
Label oe= new Label("Open Elective : PM");
dl.add(colg);
dl.add(course);
dl.add(sem);
dl.add(lang);
dl.add(oe);
dl.setLocationRelativeTo(fm);
dl.setLayout(new FlowLayout());
dl.setSize(400,400);
dl.addWindowListener(this);
}
}
public void windowClosing(WindowEvent e)
{
dl.dispose();
System.exit(0);
}
public static void main(String[]args)
{
new Academic();
}
}