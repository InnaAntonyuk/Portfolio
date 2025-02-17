import pandas as pd # type: ignore
data_dir = 'D:/Inna_home/Study/Projects/Excel_auto_reports/'
df = pd.read_excel(data_dir+'supermarket_sales_2.xlsx')

df = df[['Gender', 'Product line', 'Total']]
#print (df)

pivot_table = df.pivot_table(index = 'Gender', columns = 'Product line', values='Total', aggfunc='sum').round(0)

print (pivot_table)
pivot_table.to_excel('pivot_table.xlsx', 'Report', startrow = 4)