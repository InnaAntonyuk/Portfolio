import random
#Loop
while True: 
#Ask question: Roll the dice?
    choice = input('Roll the dice? (y,n): ').lower()
    #if user enter: y 
    if choice == 'y':
        #  generate two random numbers
        num_1 = random.randint(1,6) 
        num_2 = random.randint(1,6) 
        #  print them
        print(f'({num_1}, {num_2})')#placeholder
    #If the user enter:n
    elif choice == 'n':
        print('Thank for playing!')    
        break
    else:
        print('Invalid choice!') 