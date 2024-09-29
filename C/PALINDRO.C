#include<stdio.h>
#include<conio.h>
void main()
{
int num,sum=0,rev=0,d,temp;
clrscr();
printf("enter the number\n");
scanf("%d",&num);
temp=num;
while(num)
{
d=num%10;
num=num/10;
sum=sum+d;
rev=rev*10+d;
}
printf("the sum of number is %d\n",sum);
printf("the reverse of number is %d\n",rev);
if(temp==rev)
printf("it is a palindrome\n");
else
printf("it is not a palindrome\n");
getch();
}