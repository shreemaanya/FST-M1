#Write a program that asks the user how many Fibonnaci numbers to generate and then generates them

def fibonnaci(number):
    if number<=1:
        return number 
    else :
        return (fibonnaci(number-1)+fibonnaci(number-2))
    
nterms = int (input("Enter a number : "))
if nterms<=0:
    print("Enter a positive number")
else :
    print("Fibonnaci sequence:")
    for i in range(nterms):
        print(fibonnaci(i))