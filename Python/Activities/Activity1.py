#take username and age 
name=input("Enter name :" )
age = int(input("Enter age : "))

#calculate age 
year_turn_100 = 2025 +(100-age)

#print result 
print(name + " " +"will turn 100 years old in year {}".format(year_turn_100))
print(name + " " + "will turn 100 years old in year"+ str(year_turn_100))
print(year_turn_100)
