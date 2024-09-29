class addsub
{
int n1,n2;
public addsub(int x,int y)
{
n1=x;
n2=y;
}
public int add()
{
return(n1+n2);
}
public int sub()
{
return(n1-n2);
}
}

class muldiv extends addsub
{
public muldiv(int x,int y)
{
super(x,y);
}
public int mul()
{
return(n1*n2);
}
public int div()
{
return(n1/n2);
}
}
class ap
{
public static void main(String[]args)
{
muldiv obj= new muldiv(10,20);
System.out.println("addition of variables : "+obj.add());
System.out.println("addition of variables : "+obj.sub());
System.out.println("addition of variables : "+obj.mul());
System.out.println("addition of variables : "+obj.div());
}
}

