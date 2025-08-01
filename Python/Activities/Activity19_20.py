import pandas as pd
from pandas import ExcelWriter

##create a dataset
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
#convert excel to dataframe 
df = pd.DataFrame(data)
#Craete am Excl writer obj
writer=ExcelWriter("./sample.xlsx")
#write the DataFrame to an excel file
df.to_excel(writer,sheet_name='Sheet1',index=False)
#close writer
writer.close()
#Reading from Excel sheet (Activity20)
input_data =pd.read_excel("./sample.xlsx",sheet_name="Sheet1")

#print the number of rows and columns 
print("Rows",input_data.shape[0], "Columns:",input_data.shape[0])
