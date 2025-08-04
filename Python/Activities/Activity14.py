def fibonnaci(num):
    if num <= 1:
        return num
    else:
        return (fibonnaci(num-1) + fibonnaci(num-2))
    
nterms = int(input("enter number: "))

if nterms <= 0:
            print("enter a positive number")
else:
         print("fibonnaci series")
         
for i in range(nterms):
    print(fibonnaci(i))