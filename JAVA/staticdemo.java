class student
{
static String college="SSMRV College";
int rollno;
String name;
student(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
void display()
{
System.out.println(college+" "+rollno+" "+name);
}
}
public class staticdemo
{
public static void main(String[]args)
{
student s1= new student(1001,"maaz");
student s2= new student(1002,"ifra");
System.out.println("objects using static college name");
s1.display();
s2.display();
System.out.println("objects after changing clgname using anyone variable");
s1.college="DSI";
s1.display();
s2.display();
}
}

