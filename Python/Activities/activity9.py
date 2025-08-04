numlist1 = [1,4,5,7,9,2]
numlist2 = [4,5,6,7,8,9]

numlist3 = []

for num1 in numlist1:
    if num1 % 2 == 0:
        numlist3.append(num1)

for num2 in numlist2:
    if num2 % 2 != 0:
        numlist3.append(num2)

print(numlist3)

    