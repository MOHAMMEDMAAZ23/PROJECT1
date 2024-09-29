import pandas as pd
df1=pd.DataFrame({"name":["ifra","maleeha","azra"],
                  "age":[20,19,18],
                  "grade":["A","b","C"]},
                 index=[1,2,3])
df2=pd.DataFrame({"name":["afra","sana","ayesha"],
                  "age":[12,13,14],
                  "grade":["A","b","C"]},
                 index=[4,5,6])
result=df.concat([df1,df2])
print(result)
