package student.fulltime.bca;
import java.util.Scanner;

public class bcastudent
{
String name,sex;
int age;
Scanner sc=new Scanner(System.in);
public void getdata()
{
System.out.println("enter the name");
name=sc.nextLine();
System.out.println("enter the sex");
sex=sc.nextLine();
System.out.println("enter the age");
age=sc.nextInt();
}
public void display()
{
System.out.println("the name is: "+name);
System.out.println("the sex is: "+sex);
System.out.println("the age is: "+age);
}
}