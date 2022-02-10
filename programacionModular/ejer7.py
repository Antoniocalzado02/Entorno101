numeroPrimo=int(input("Dime un numero, para ver si es primo"))

def isPrime(numeroPrimo):
    bandera = True
    cont = 2
    if numeroPrimo<=0:
        return(-1)
    
    while cont <= int(numeroPrimo) - 1:
        if int(numeroPrimo) % cont == 0:
            bandera = False
        cont = cont + 1
    if bandera == True:
        return("Es primo")
    else:
        return("No es primo")
print(isPrime(numeroPrimo))