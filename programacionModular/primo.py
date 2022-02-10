numeroPrimo=int(input("Dime un numero, para ver si es primo"))

def isPrime(numeroPrimo):
    bandera =0
    cont = 2
    if numeroPrimo<=0:
        return(-1)
    
    while cont <= int(numeroPrimo) - 1:
        if int(numeroPrimo) % cont == 0:
            bandera = bandera+1
        cont = cont + 1
    if bandera >=1:
        return("No es primo")
    else:
        return("Es primo")
print(isPrime(numeroPrimo))