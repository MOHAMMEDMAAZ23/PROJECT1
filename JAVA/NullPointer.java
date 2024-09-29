import java.io.*;
public  class NullPointer
{
public static void main(String[]args)
{
try
{
String str=null;
if(str.equals("SSMRV"))
System.out.println("The strings are same");
else
System.out.println("The strings are not same");
}
catch(NullPointerException e)
{
System.out.println("null pointer exception raised");
}
finally
{
System.out.println("this section gets printed finally after the exception is raised");
}
}
}
