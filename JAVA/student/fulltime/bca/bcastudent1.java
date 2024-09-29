package student.fulltime.bca;
import java.util.Scanner;

public class bcastudent1
{
String name,sex;
int age;
Scanner sc= new Scanner(System.in);
public void getdet()
{
System.out.println("Enter the student details::");
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter the sex");
sex=sc.nextLine();
System.out.println("Enter the age");
age=sc.nextInt();
}
public void display()
{
System.out.println("The student details are::");
System.out.println("student name is : "+name);
System.out.println("student sex is : "+sex);
System.out.println("student age is : "+age);
}
}