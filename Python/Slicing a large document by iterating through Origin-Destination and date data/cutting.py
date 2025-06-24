import pandas as pd
import sys
def process_data(file_path, origin_col='origin', destination_col='destination', check_in_date_col='check_in_date', num_records_to_cut = 15):
    
    df = pd.read_csv(file_path, sep=',', encoding='utf-8', dtype={45: str, 46: str})
   
    df_is_no = df[df['is_one_way'].isin(['No','no'])]
    processed_chunks = []
    for origin in df_is_no[origin_col].unique():
        df_origin = df_is_no[df_is_no[origin_col] == origin]
        for destination in df_origin[destination_col].unique():
            df_destination = df_origin[df_origin[destination_col] == destination]
            for check_in_date in df_destination[check_in_date_col].unique():
                df_route_date = df_destination [df_destination[check_in_date_col] == check_in_date]
                chunk = df_route_date.head(num_records_to_cut)
                processed_chunks.append(chunk)
    df_is_yes = df[df['is_one_way'].isin(['Yes','yes'])]
    for origin in df_is_yes[origin_col].unique():
        df_origin = df_is_yes[df_is_yes[origin_col] == origin]
        for destination in df_origin[destination_col].unique():
            df_destination = df_origin[df_origin[destination_col] == destination]
            for check_in_date in df_destination[check_in_date_col].unique():
                df_route_date = df_destination [df_destination[check_in_date_col] == check_in_date]
                chunk = df_route_date.head(num_records_to_cut)
                processed_chunks.append(chunk)
    return processed_chunks
all_process_chunk = process_data (file_path = r'D:\Inna_home\Study\Python_prog\cutting\FV_29_202506230703.csv')
if all_process_chunk:
    final_df = pd.concat(all_process_chunk)
    final_df.to_csv('final_cut_data.csv', index=False)
    print('Data is ready')
else:
    print('Data was not cut')

