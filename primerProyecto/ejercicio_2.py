number1 = int(input("Enter one number between 0 and 10:"))
number2 = 0
if number1 >= 0 and number1 <= 10:
    while number2 <= 10:
        result = number1 * number2
        print(str(number1) +"*" +str(number2) +"=" +str(result))
        number2 = number2 + 1
else:
    print("The number is out of the boundaries")