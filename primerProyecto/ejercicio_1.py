for number in range(1,101):
    if number % 7 == 0 and number % 13 == 0:
        print("The number " +str(number) +" is a multiple of 7 and 13.")
    else:
        if number % 7 == 0:
            print("The number " +str(number) +" is a multiple of 7")
        else:
            if number % 13 == 0:
                print("The number " +str(number) +" is a multiple of 13.")
                