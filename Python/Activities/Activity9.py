numList1 = [1,2,3,4,5]
numList2 = [10,9,8,7,6]

#print 2 lists 
print("FirstList" + str(numList1))
print("SecondList" + str(numList2))

#declare 3rd list 
numList3 = []

#get even from first list 
for num in numList1 :
    if (num%2!=0):
        numList3.append(num)

#get odd from 2nd list 
for num in numList2 :
    if (num%2==0):
        numList3.append(num)

print("Numbers in list3 are " + str(numList3))