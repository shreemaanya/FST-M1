#Write a recursive function to calculate the sum of numbers from 0 to 10
def sum_num(n):
    if n:
        return n + sum_num(n-1)
    else :
        return 0

#call recursive function
res = sum_num(10)    
print (res) 
