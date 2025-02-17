import random

guess_to_number = random.randint(1,100)
while True:
        try:
                enter_number = int(input('Please enter the number in range 1-100: '))
                if guess_to_number > enter_number:
                        print('to low!')
                elif guess_to_number < enter_number:
                        print('to high!')
                else:
                        #correct_number = enter_number 
                        print('Congratulations! You guessed the number! It is the number: '+ str(guess_to_number))
                        break
        except ValueError:
                print ('Entered value is incorrect')