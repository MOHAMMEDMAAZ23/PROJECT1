import java.io.*;
import java.util.*;
class student
{
int rollno;
String name;
int sub1,sub2,sub3,totmarks=0;

student(int roll,String nm,int s1,int s2,int s3,int tot)
{
rollno=roll;
name=nm;
sub1=s1;
sub2=s2;
sub3=s3;
totmarks=tot;
}
void displaystudent()
{
System.out.println(rollno+" "+name+" "+sub1+" "+sub2+" "+sub3+" "+totmarks);
}
}

public class studentarray
{
static int roll;
static String nm;
static int s1,s2,s3,tot=0;
static void acceptstudent()
{
Scanner sc=new Scanner(System.in);
System.out.println("details of student are::");
System.out.println("enter the rollno");
roll=sc.nextInt();
System.out.println("enter the name:");
nm=sc.next();
System.out.println("enter sub1 marks::");
s1=sc.nextInt();
System.out.println("enter sub2 marks:");
s2=sc.nextInt();
System.out.println("enter sub3 marks:");
s3=sc.nextInt();
if(s1>=50 && s2>=50 && s3>=50)
tot=s1+s2+s3;
else
tot=0;
}
public static void main(String[]args)
{
student st[]=new student[3];
int i;
for(i=0;i<3;i++)
{
acceptstudent();
st[i]= new student(roll,nm,s1,s2,s3,tot);
}
for(i=0;i<3;i++)
{
st[i].displaystudent();
}
}
}