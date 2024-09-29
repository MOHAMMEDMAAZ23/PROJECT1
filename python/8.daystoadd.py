import datetime
today=datetime.datetime.now().date()
print("the current date is: ",today)
dta=int(input("enter the number of days t6lo add:"))
newdate=today+datetime.timedelta(days=dta)
print("after adding",today,"days the cur date is",newdate)
