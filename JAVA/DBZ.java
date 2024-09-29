import java.io.*;
public class DBZ
{
public static void main(String[]args)
{
try
{
int a=50;
int c=a/0;
System.out.println("c is:"+c);
}
catch(ArithmeticException e)
{
System.out.println("-Divide By Zero exception raised-");
}
}
}