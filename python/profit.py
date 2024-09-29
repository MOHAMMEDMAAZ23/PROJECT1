import pandas as pd
import matplotlib.pyplot as plt
df=pd.read_csv("salesdata.csv")
tp=df["total profit"]
plt.plot(tp,color='blue',marker='o',linestyle='dotted',linewidth='5',label="total profits")
plt.xlabel("months")
plt.ylabel("total profits")
plt.legend(loc="upper right")
plt.xticks(range(len(df)),df["months"],rotation=45)
plt.show()
