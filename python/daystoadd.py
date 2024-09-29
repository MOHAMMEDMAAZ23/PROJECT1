import datetime
today=datetime.datetime.now().date()
print("todays date is :",today)
nod=int(input("enter the days to add: "))
daa=today+datetime.timedelta(days=nod)
print("after adding",nod,"is:",daa)
