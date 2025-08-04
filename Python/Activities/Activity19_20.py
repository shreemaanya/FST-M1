import pandas as pd
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

# Create the DataFrame that will be written to the excel file
df = pd.DataFrame(data)
 
# Print the dataframe
print(df)

#create an excel writer object
writer = ExcelWriter("./sample.xlsx")

#write data frame to excel file
df.to_excel(writer, sheet_name = 'Sheet1', index = False)
#close the writer
writer.close()

#   reading from excel file activity 20
input_data = pd.read_excel("./sample.xlsx",sheet_name='Sheet1')

# Print the number of rows and columns
print("====================================")
print("Number of rows and columns:", df.shape)
 
# Print the data in the emails column only
print("====================================")
print("Emails:")
print(df['Email'])
 
# Sort the data based on FirstName in ascending order and print the data
print("====================================")
print("Sorted data:")
print(df.sort_values('FirstName'))

