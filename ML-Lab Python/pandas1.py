#pandas ML LAB
import pandas as pd 
import numpy as np
# create empty series
ser = pd.Series()
print("Pandas Series : ",ser)
data = np.array(['a','b','c','d','e'])
ser = pd.Series(data)
print("Series " , ser)