import pandas as pd
import numpy as np
import sys
if sys.stdout.encoding!='utf-8':
    sys.stdout.reconfigure (encoding = 'utf-8')

#del duplicate
df_path = r'D:\Inna_home\Study\Python_prog\Route_type\Airports_code.csv'
df = pd.read_csv(df_path)
df.drop_duplicates(subset=['Code'], keep= 'first', inplace=True)
df.to_csv('new_code_Airport.csv', index=False)
print ('New file was created for Airports code without duplicates')

def dataframe (main_df_path, reference_df_path):
    main_df = pd.read_csv(main_df_path, sep = ',', encoding='utf-8')
    reference_df = pd.read_csv(reference_df_path, sep=',', encoding='utf-8')
    
#rename columns for original
    ref_origin_cols_for_merge = reference_df[['City', 'Country', 'Code']].copy().rename(columns={'City': 'Origin_City','Country': 'Origin_Country','Code': 'Origin_Code'})
    ref_origin_cols_for_merge.keys()
#merge Original
    main_df = pd.merge(main_df, ref_origin_cols_for_merge, left_on='origin', right_on='Origin_Code', how='left')
#rename columns for destination
    ref_destination_cols_for_merge = reference_df[['City', 'Country', 'Code']].copy().rename(columns={'City': 'Destination_City','Country': 'Destination_Country','Code': 'Destination_Code'})
    ref_destination_cols_for_merge.keys()
#merge Destination
    main_df = pd.merge(main_df, ref_destination_cols_for_merge, left_on ='destination', right_on ='Destination_Code', how='left')
#Value Nan
    main_df['Origin_Country'].fillna('Unknown_code', inplace= True)
    main_df['Destination_Country'].fillna('Unknown_code', inplace=True)
#Exatracted route type
    is_domestic_condition = (main_df['Origin_Country'] == main_df['Destination_Country']) & (main_df['Origin_Country']!= 'Unknown_code')
    main_df['Route type should be extracted'] = np.where(is_domestic_condition, 'Domestic', 'International')
    code_unknown_code_condition = (main_df ['Origin_Country'] == 'Unknown_code') | (main_df ['Destination_Country'] =='Unknown_code')
#Empty value in the route type column
    route_type_not_extracted_condition = (main_df['rout_type'].isna()) | (main_df['rout_type'] == '')
#Incorrect type condition
    incorrect_type_condition = (main_df['Route type should be extracted'] != main_df['rout_type'])
    
    main_df['Route_Check_Status'] = np.select(
        [code_unknown_code_condition, route_type_not_extracted_condition, incorrect_type_condition], 
        ['Unknown code of the country','Route type was not extracted','Route type was extracted incorrectly'],
        default='Correct'
    )
    main_df.to_csv('update_tab.csv', index=False)

    print('\n--- Final DataFrame Info After All Operations is presented in the update_tab.csv ---') 
dataframe (main_df_path=r'D:\Inna_home\Study\Python_prog\Route_type\FV_29_202506230455.csv',
           reference_df_path= r'D:\Inna_home\Study\Python_prog\Route_type\new_code_Airport.csv')


    