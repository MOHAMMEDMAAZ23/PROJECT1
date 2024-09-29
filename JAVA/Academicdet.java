import java.awt.*;
import java.awt.event.*;
public class Academicdet extends WindowAdapter implements ActionListener
{
Frame fm;
Button bt1;
Dialog dl;
Academicdet()
{
Frame fm=new Frame();
Button bt1=new Button("Academic Details");
fm.setLayout(new FlowLayout());
fm.setSize(800,800);
fm.setVisible(true);
fm.setTitle("my academic details");
fm.add(bt1);
bt1.setBounds(2000,70,320,30);
/*colg.setBounds(20,150,600,30);
course.setBounds(20,250,600,30);
sem.setBounds(20,300,600,30);
lang.setBounds(20,350,600,30);
oe.setBounds(20,350,600,30);*/
fm.addWindowListener(this);
bt1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand().equals("Academic Details"))
{
dl=new Dialog(fm,"my academic details",true);
Font myFont=new Font("courier",Font.BOLD,16);
dl.setFont(myFont);
dl.setForeground(Color.RED);
Label colg=new Label("college:SSMRV college");
Label course=new Label("course:BCA");
Label sem=new Label("studying in:2 sem");
Label lang=new Label("language: kannada");
Label oe=new Label("Open elective opted: Retail management");
dl.add(colg);
dl.add(course);
dl.add(sem);
dl.add(lang);
dl.add(oe);
dl.setLayout(new FlowLayout());
dl.setLocationRelativeTo(fm);
dl.setSize(400,400);
dl.setVisible(true);
dl.addWindowListener(this);
}
}
public void WindowClosing(WindowEvent we)
{
System.exit(0);
}
public static void main(String[]args)
{
new Academicdet();
}
}

