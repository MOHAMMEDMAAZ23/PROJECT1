def count_char(filename):
    with open(filename,'r') as file:
        contents=file.read()
        char_count={}
        for char in contents:
            if char in char_count:
                char_count[char]+=1
            else:
                char_count[char]=1
        return char_count
data=input("enter the data:")
filename=input("enter the filename")
with open(filename,'w') as file:
    file.write(data)
print("opening the file",filename)
result=count_char(filename)
print("the count is",str(result))
