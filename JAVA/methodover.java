public class methodover
{
int addition()
{
return(10+10);
}
int addition(int x,int y)
{
return(x+y);
}
float addition(float a,float b)
{
return(a+b);
}
public static void main(String[]args)
{
methodover a= new methodover();
System.out.println("the sum of default values"+a.addition());
System.out.println("the sum of integer values"+a.addition(10,20));
System.out.println("the sum of float values"+a.addition(10.5f,20.5f));
}
}