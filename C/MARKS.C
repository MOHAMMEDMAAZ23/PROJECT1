#include<stdio.h>
#include<conio.h>
void main()
{
int m1,m2,m3,total;
float per;
clrscr();
printf("enter three subjects\n");
scanf("%d%d%d",&m1,&m2,&m3);
total=m1+m2+m3;
per=total*100/300;
if(per>=60&&per<=100)
printf("first class\n");
else if(per>=50&&per<=60)
printf("second class");
else if(per>=40&&per<=50)
printf("third class");
else
printf("failed");
getch();
}