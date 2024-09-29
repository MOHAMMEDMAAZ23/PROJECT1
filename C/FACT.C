#include<stdio.h>
#include<conio.h>
int main()
{
int c,n,f=1;
clrscr();
printf("enter the number to calculate factorial\n");
scanf("%d",&n);
for(c=1;c<=n;c++)
f=f*c;
printf("the factorial of %d=%d\n",n,f);
getch();
return 0;
}