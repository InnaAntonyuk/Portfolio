import random

emojis = {'r':'🪨', 's': '✂️', 'p':'📄'}
choice_letter = ['r', 's', 'p']
continue_letter = ['y', 'n']
while True:        
    user_choice = input("Rock, scissors, papper? (r/s/p): ").lower()
    if user_choice not in choice_letter:
        print('invalid choice')
        continue    
    
    random_choice_computer = random.choice(choice_letter)
        
    print (f'computer chose: {emojis [random_choice_computer]}')
    print (f'you chose: {emojis [user_choice]}')
    
    if(
        random_choice_computer =='r' and user_choice == 's' or 
        random_choice_computer=='p' and user_choice == 'r' or 
        random_choice_computer=='s' and user_choice == 'p'):
        print('You lose')
    elif(
        random_choice_computer=='r' and user_choice == 'p' or \
        random_choice_computer=='p' and user_choice == 's' or \
        random_choice_computer=='s' and user_choice == 'r'):
        print('You win')
    else:
        print ('It is a draw')
    
    continue_game = input("Continue? (y/n): ").lower()
    if continue_game not in continue_letter:
        print('invalid choice')
        
    elif continue_game == "n":
        break


