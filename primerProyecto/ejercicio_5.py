num = int(input("Enter a number (negative to finish):"))
contador = 0
while num >= 0:
    contador = contador + 1
    num = int(input("Enter a number (negative to finish):"))
print("You have entered " +str(contador) +" positive numbers")