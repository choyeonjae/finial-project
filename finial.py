
print('welcome!')
name=input('What is your name? : ')
print('You need to collect 100 Zen points!\ncheer up!', name)
Money=0
Zen=0
print("-------------GAME START--------------")
Company=int(input('Do you want to hand in your resignatiod? Y-1 N-2 : '))
i=0
a=0
if Company==1:
    print("Let's start! Now You can collect your Zen point!\nAnd also you get severance pay(money +100)")
    
    Money=Money+100
    
else:
    while i<100:
        print("Work!")
        print("You can't get Zen point... But you get pay!(Money +5)")
        Money=Money+5
        i=i+1
        print("Money=", Money)
        Company_again=int(input('Do you want to hand in your resignatiod? Y-1 N-2 : '))
        if Company_again==1:
            print("Let's start! Now You can collect your Zen point!\nAnd also you get severance pay(money +100)")
            Money=Money+100
            i=i+1000
        elif Company_again==2:
            print("Ah...")
            
print('----------------Collect Zen!---------------')
print("Money=", Money, 'Zen= ', Zen)
print("")
print('You have six ways to get Zen and Money! Here is ways')
count=0
while Zen<100 and Money>0:
    print("Money=", Money, 'Zen= ', Zen, 'count=', count)
    print("1.Help people (Zen +5, Money -10)")
    print("2.Donation (Zen +Your Donation Money x 10%, Money=You want)")
    print('3.voluntary service (Zen +10, Money -20)')
    print('4.deep bow (Zen +1)')
    print('5.Go back to company, and Work! (Zen -3, Money +20)')
    print('6.Buy temple(Small temple (+Zen +10 everytime, +Money +3 everytime, Money -100)\n Large temple (+Zen +15 everytime, +Money +5 everytime, Money -300))')
    collect=int(input('collect number(1-6) : '))
    print('')
    
    if collect==6:
        choose_temple=(int(input("What temple do you want to buy? small-1 Large-2 : ")))
        if choose_temple==1:
            Money=Money-100
            temple_name=(input('Please enter the temple name : '))
            print('Now you can get +Zen +10 everytime, +Money +3 everytime Because of your temple', temple_name)
            small_temple_zen=Zen+10
            Zen=small_temple_zen
            while Zen<100 and Money>0:
                print("Money=", Money, 'Zen= ', Zen, 'count=', count)
                print("1.Help people (Zen +5, Money -10)")
                print("2.Donation (Zen +Your Donation Money x 10%, Money=You want)")
                print('3.voluntary service (Zen +10, Money -20)')
                print('4.deep bow (Zen +1)')
                print('5.Go back to company, and Work! (Zen -3, Money +20)')
                print('6.Buy temple(Small temple (Large temple (+Zen +15 everytime, +Money +5 everytime, Money -300))')
                collect=int(input('collect number(1-6) : '))
                if collect==6:
                   print('You already buy small temple which name ', name)
                   ask_Large_temple=int(input('You can only buy Large temple. Do you want keep continue? Y-1, N-2 : '))
                   if ask_Large_temple==1:
                       Money=Money-300
                       temple_name=(input('Please enter the temple name : '))
                       print('Now you can get +Zen +15 everytime, +Money +5 everytime Because of your temple', temple_name)
                       large_temple_zen=Zen+15
                       Zen=large_temple_zen
                   elif ask_Large_temple==2:
                       continue
                   
            

        elif choose_temple==2:
            Money=Money-200
            temple_name=(input('Please enter the temple name : '))
            print('Now you can get +Zen +15 everytime, +Money +5 everytime Because of your temple', temple_name)
            large_temple_zen=Zen+15
            Zen=large_temple_zen
                     
    elif collect==1:
        print('Help people...')
        print('Thank you ',name, "!")
        Money=Money-10
        Zen=Zen+5
        print('')
    elif collect==2:
        Donation=float(input('How much do you want Donation? : '))
        Money=Money-Donation
        Zen=Zen+Donation/10
        count=count+1
        print('')
    elif collect==3:
        print('Thank you for join us! Please care this poor dog...')
        print('Wow! Dog get health! Please come here continue...')
        Money=Money-20
        Zen=Zen+10
        print('')
    elif collect==4:
        print('Save us, merciful Buddha!')
        Zen=Zen+1
        print('')
    elif collect==6:
        print('Work!')
        Money=Money+20
        Zen=Zen-3
        print('')
    count=count+1
if Money<=0:
    print("You don't have Money anymore... Please Start again...")
    print("-------------------Game Stop-----------------")
else :
    print("Congratulations! Now you are Buddhist monk!")
