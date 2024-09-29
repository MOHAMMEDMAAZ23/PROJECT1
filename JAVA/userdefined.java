import java.io.*;
import java.util.*;
class PayOutOfBoundsException extends Exception
{
PayOutOfBoundsException(String msg)
{
System.out.println("PayOutOfBounds"+msg);
}
}
public class userdefined
{
public static void main(String[]args) throws PayOutOfBoundsException
{
float salary;
Scanner sc=new Scanner(System.in);
System.out.println("enter the salary");
salary=sc.nextFloat();
if(salary<10000 || salary>50000) 
throw new PayOutOfBoundsException(salary+"salary not in range");
else
System.out.println("salary is eligible for 30% hike");
}
}