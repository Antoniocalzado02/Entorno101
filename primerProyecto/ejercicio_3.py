contadorNum = 0
contadorCont = 0
cantidadNum = int(input("How many numbers do you want input"))
while contadorNum < cantidadNum:
    num = int(input("Enter one number greater than 0:"))
    while contadorCont  == contadorNum:
        if num <= 0:
            print("The number is not valid, it should be greater than 0")
            num = int(input("Enter one number greater than 0:"))
        else:
            if num % 2 == 0:
                print("The number " +str(num) +" is odd")
            else:
                print("The number " +str(num) +" is even")
            contadorNum = contadorNum + 1
    contadorCont = contadorCont + 1