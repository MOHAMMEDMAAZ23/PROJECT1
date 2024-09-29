import java.io.*;
public class zeroex
{
public static void main(String[]args)
{
try
{
int a=50;
int c=a/0;
System.out.println("c: "+c);
}
catch(ArithmeticException e)
{
System.out.println("Arithematic Exception raised");
}
}
}