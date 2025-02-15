from openpyxl import load_workbook
from openpyxl.styles import Font
data_dir = 'D:/Inna_home/Study/Projects/Excel_auto_reports/'
wb = load_workbook(data_dir+'report.xlsx')
sheet = wb ['Report']

sheet['A1'] = 'Sales report'
sheet['A2'] = 'January'
sheet['A1'].font = Font ('Arial', bold=True, size= 20)
sheet['A2'].font = Font ('Arial', bold= True, size = 10)

wb.save(data_dir+'report_Jenuary.xlsx')