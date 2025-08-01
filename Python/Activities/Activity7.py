#given list of numbers
#num1 = input("enter 1st number")
#num1 = input("enter 2nd number")
#num1 = input("enter 3rd number")
#num1 = input("enter 4th number")
#numList = [num1,num2,num3,num4]
#numList = [1,4,5,3,2,5,6]

numList = input("Enter a list of numbers separated by comma: ").split(",")  #split is to convert the string values to list 

#CALCULATE SUMM OF NUMBERS IN LIST 
sum =0
for num in numList:
    sum += int(num)

#print sum 
print("The sum of numbers in List: " , sum)

