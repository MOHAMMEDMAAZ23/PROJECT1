def char_num(string):
    a={}
    for i in string:
       if i in a:
           a[i]+=1
       else:
           a[i]=1
    return a
string=input("enter the name:")
result=char_num(string)
print("the count of"+string+"\nis:",str(result))
