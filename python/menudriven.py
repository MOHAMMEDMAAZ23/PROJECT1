def add(a,b):
    return a+b
def sub(a,b):
    return a-b
def multi(a,b):
    return a*b
def div(a,b):
    return a/b
while True:
    print("1. for add")
    print("2. for sub")
    print("3. for multi")
    print("4. for div")
    print("5. for exit")
    choice=int(input("enter the choice:"))
    if choice==5:
        print("exiting the pro")
        break
    elif choice==1:
        num1=int(input("enter the number 1:"))
        num2=int(input("enter the number 2:"))
        result=add(num1,num2)
        print("the result:",result)
    elif choice==2:
        num1=int(input("enter the number 1:"))
        num2=int(input("enter the number 2:"))
        result=sub(num1,num2)
        print("the result:",result)
    elif choice==3:
        num1=int(input("enter the number 1:"))
        num2=int(input("enter the number 2:"))
        result=multi(num1,num2)
        print("the result:",result)
    elif choice==4:
        num1=int(input("enter the number 1:"))
        num2=int(input("enter the number 2:"))
        result=div(num1,num2)
        print("the result:",result)
    else:
      print("invalid option try again")
    
