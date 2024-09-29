num=[1,2,3,4,5,6,7,8,9,10]
def is_even(num):
    return num%2==0
evenno=list(filter(is_even,num))
print("the even numbers list is:",evenno)
