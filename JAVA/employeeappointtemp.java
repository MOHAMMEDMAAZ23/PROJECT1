import java.util.*;
import java.text.*;
class employeedetails
{
int empid;
String empname;
String empappdate1;
Date empappdate2;
void getData() throws ParseException
{
Scanner sc= new Scanner(System.in);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
System.out.println("\n\tEnter Employee ID:");
empid=sc.nextInt();
System.out.println("\n\tEnter Employeeb Name:");
empname=sc.next();
System.out.println("\n\tEnter employee appoint date:");
empappdate1=sc.next();
empappdate2=sdf.parse(empappdate1);
}
void display()
{
System.out.println(empid +"\t\t"+ empname +"\t\t"+ empappdate2);
}
}
class employeeappointtemp
{
public static void main(String[]args) throws ParseException
{
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the total number of employees::");
n=sc.nextInt();
employeedetails emp[]=new employeedetails[n];
for(i=0;i<n;i++)
emp[i]=new employeedetails();
for(i=0;i<n;i++)
{
System.out.println("\n enter details of "+ (i+1) +"employee\n");
emp[i].getData();
}
System.out.println("*********employee details********\n");
System.out.println("employee id \t employee name \t employee date of join");
for(i=0;i<n;i++)
{
emp[i].display();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(emp[i].empappdate2.after(emp[j].empappdate2))
{
employeedetails temp=emp[i];
emp[i]=emp[j];
emp[j]=temp;
}
}
}
System.out.println("*****employee details as per date of join*****\n");
System.out.println("employee id \t employee name \t employee date of join");
for(i=0;i<n;i++)
{
emp[i].display();
}
}
}


