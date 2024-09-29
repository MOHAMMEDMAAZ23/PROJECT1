#include<stdio.h>
#include<conio.h>
void main()
{
char string[50];
int i,length=0;
clrscr();
printf("enter a string");
gets(string);
for(i=0;string[i]!='\0';i++);
{
length++;
}
printf("the length of a string is the no of characters present in it\n");
printf("the length of %s=%d\n",string,length);
getch();
}
