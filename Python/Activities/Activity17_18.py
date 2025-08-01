import pandas as pd
# pd.dataframe is nothing but pandas .Dataframe

#create dataset
data ={
"Username" :["Admin","Charles","Deku"],
"Password" : ["Password","Charlie13","Almight"]
}
#convert data to dataframe
df=pd.DataFrame(data)
#write datframe to csv file (. means current folder)
df.to_csv("./sample.csv",index=False)
#Reading data from Csv file (activity18)
input_data=pd.read_csv("./sample.csv")
# print entire DataFrame
#print(input_data)
# print the values only in the username column **Spellings are case sensitive *1st line in csv is col name from 2nd line it is rows 
#print(input_data["Username"])
#Print the username and password of the second row using key value pair 
#print("Username:" ,input_data["Username"][1],"|" , "Password:" , input_data["Password"][1])

#Sort the Usernames column data in ascending order and print data // capital first 
print("====================Sorted Username===================")
print(input_data.sort_values(by="Username"))
#Sort the Passwords column in descending order and print data
print("====================Sorted Password===================")
print(input_data.sort_values(by="Password",ascending=False))