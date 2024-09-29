#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,c=0;
clrscr();
printf("enter the number\n");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c==2)
{
printf("it is a prime number\n");
}
else
{
printf("it is not a prime number\n");
}
getch();
}