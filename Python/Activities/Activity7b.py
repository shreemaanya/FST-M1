#take numbers from user 
num1 = input("enter 1st number")
num2 = input("enter 2nd number")
num3 = input("enter 3rd number")
num4 = input("enter 4th number")
numList = [num1,num2,num3,num4]

#CALCULATE SUMM OF NUMBERS IN LIST 
sum =0
for num in numList:
    sum += int(num)    #type casting converts string to numbers and then add to sum 

#print sum 
print("The sum of numbers in List: " , sum)

