user1 = input("enter user name 1 ")
user2 = input("enter user name 2 ")

while True:
 user1_answ = input(user1 + " enter the option rock/paper/scissor ").lower()
 user2_answ = input(user2 + " enter the option rock/paper/scissor ").lower()
# rock , scissor - rock wins
# rock , paper - paper wins
# paper, scissors - scissor wins
 if (user1_answ == user2_answ):
    print("it is tie")

 elif (user1_answ == "rock"):
    if (user2_answ == "scissor"):
        print(user1 + "wins")
    else:
        print(user2 + "wins")


 elif (user1_answ == "rock"):
    if (user2_answ == "paper"):
        print(user2 + "  wins")
    else:
        print(user1 + " wins")

 elif (user1_answ == "paper"):
    if (user2_answ == "scissor"):
        print(user2 + " wins")
    else:
        print(user1 + " wins")

 else: print("invalid input")
 
 playagain = input("wanto play again Yes / No ").lower()
 if(playagain=="yes"):
    pass
 elif(playagain=="no"):
    raise SystemExit

 else: print("invalid option")
 raise SystemExit





