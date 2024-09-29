import java.io.*;
import java.util.*;
public class negativea
{
public static void main(String[]args)
{
try
{
int a[]=new int[-5];
Scanner sc=new Scanner(System.in);
System.out.println("enter the array");
for(int i=0;i<-5;i--)
a[i]=sc.nextInt();
}
catch(NegativeArraySizeException e)
{
e.printStackTrace();
}
System.out.println("continuing execution");
}
}