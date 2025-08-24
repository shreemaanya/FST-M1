#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not.

fruits_dict = {
    "cherry":2 , 
    "apple":3 , 
    "gova":5}

key_to_check = input("which fuit are you looking for ?" ).lower()

if (key_to_check in fruits_dict):
    print("Yes,It is available")

else :
    print("No,It is not available")
