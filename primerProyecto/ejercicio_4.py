num = int(input("Enter one number greater than 0:"))
cont = 0
result = 0
while num <= 0:
    num = int(input("The number is not right, try again."))
while cont < num:
    cont = cont + 1
    result = result + cont
print("The sum of the " +str(num) +" first numbers is " +str(result))
    