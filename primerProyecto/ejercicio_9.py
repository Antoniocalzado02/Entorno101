num = int(input("Enter an integer positive number greater than 0:"))
divisor = 1
contDivisor = 0

while num <= 0:
    print("The number is not valid, try again.")
    num = int(input("Enter an integer positive number greater than 0:"))
    
while divisor < num:
    if num % divisor == 0:
        contDivisor += divisor
    divisor += 1

if contDivisor == num:
    print("The number " +str(num) +" is perfect")
else:
    print("The number " +str(num) +" is not perfect")
    