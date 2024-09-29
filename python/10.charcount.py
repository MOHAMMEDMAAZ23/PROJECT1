def count_characters(string):
    char_count={}
    for char in string:
        if char in char_count:
            char_count[char]+=1
        else:
            char_count[char]=1
    return char_count
string=input("enter the string:")
result=count_characters(string)
print("the string is",string)
print("the char coun is",str(result))
