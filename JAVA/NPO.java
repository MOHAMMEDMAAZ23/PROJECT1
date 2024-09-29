import java.io.*;
public class NPO
{
public static void main(String[]args)
{
try
{
String str=null;
if(str.equals("SSMRV"))
System.out.println("Both the strings are same.");
else
System.out.println("Both the strings are not equal");
}
catch(NullPointerException e)
{
System.out.println("-Null Pointer exception raised-");
}
finally
{
System.out.println("this will get executed after try and catch block");
}
}
}