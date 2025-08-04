import pandas as pd

#Writing CSV Files
#writing data to .csv file 
#create the dataset
data = {
    "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a DataFrame using that data
dataframe = pd.DataFrame(data)
 
# Print the DataFrame
print(dataframe)

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv("sample.csv", index=False)

#reading from .csv file activity 18

input_data = pd.read_csv("./sample.csv")

#new_row = pd.DataFrame({
#    "Usernames": ["new_user"],
#    "Passwords": ["new_password"]
#})
#input_data = pd.concat([input_data, new_row]).reset_index(drop=True)
#print(input_data)

print("============Usernames colums----------")
print(input_data["Usernames"])

print("============second row data=========")
print(input_data["Usernames"][1],input_data["Passwords"][1])

print("=======sorted usernames column=========")
print(input_data.sort_values(by="Passwords",ascending=False))

