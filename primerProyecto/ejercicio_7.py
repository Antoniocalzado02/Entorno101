contadorNum = 0
sumaNum = 0
cantidadNum = int(input("How many numbers do you want input"))
while contadorNum < cantidadNum:
    num = int(input("Enter one number greater than 0:"))

    if num <= 0:
        print("The number is not valid, it should be greater than 0")
        num = int(input("Enter one number greater than 0:"))
    else:
        sumaNum = sumaNum + num
        contadorNum = contadorNum + 1
            
        
medium = sumaNum / cantidadNum
print("The medium is " +str(medium))