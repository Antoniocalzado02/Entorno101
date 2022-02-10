num = int(input("Enter an integer positive number:"))
contador = 0
factorial = 1

while num < 0:
    print("The number is not valid, try again.")
    num = int(input("Enter an integer positive number:"))
    
if num > 1:
    while contador < num:
        calculo = num - contador
        factorial = factorial * calculo
        contador += 1

print(factorial)