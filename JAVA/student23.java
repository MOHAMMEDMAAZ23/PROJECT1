import java.util.*;
class firstyear
{
String classname;
String classt;
int stdcount;
int stdmarks[]=new int[50];
String stdname[]=new String[50];
Scanner sc=new Scanner(System.in); 
public firstyear()
{
getinfo();
}
public void getinfo()
{
System.out.println("enter the classname");
classname=sc.nextLine();
System.out.println("enter the class teacher");
classt=sc.nextLine();
System.out.println("enter the stdcount");
stdcount=Integer.parseInt(sc.nextLine());
System.out.println("enter the stdname");
for(int i=0;i<stdcount;i++)
stdname[i]=sc.nextLine();
System.out.println("enter the stdmarks");
for(int i=0;i<stdcount;i++)
stdmarks[i]=sc.nextInt();
}
public void beststudent()
{
int best=0,k=-1;
for(int i=0;i<stdcount;i++)
{
if(stdmarks[i]>best)
{
best=stdmarks[i];
k=i;
}
}
System.out.println("best student is"+stdname[k]);
}
}
public class student23
{
public static void main(String[]args)
{
firstyear fy=new firstyear();
fy.beststudent();
}
}

