from pickle import FALSE
def obtenerDivisores(numero):
    listaDivisores=[]
    
    for i in range(1,numero+1):
        if numero%i==0:
            listaDivisores.append(i)
    return listaDivisores


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

def friends(numeroA,numeroB):
    
    return FALSE
print(type(friends))