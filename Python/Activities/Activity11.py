Fruitshop_Dict = {
    "Mango": "200",
    "Apple": "100",
    "Orange": "80"
}
print(Fruitshop_Dict)

	
key_to_check = input("What are you looking for? ").lower
print(key_to_check)

if (key_to_check in Fruitshop_Dict):
    print("Yes,it is available ")
else:
    print("Not available")