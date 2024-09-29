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
data=input("enter the contents: ")
filename=input("enter the name of the file: ")
with open(filename,'w') as file:
    file.write(data)
print("opening the file reading:",filename)
result=count_char(filename)
print("character frequency in "+filename+"\n is:",str(result))


            
