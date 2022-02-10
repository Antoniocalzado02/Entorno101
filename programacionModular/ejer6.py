numero=int(input("Dime un numero"))

def numberOfNumbers(numero):
    contador=0
    if numero>0:
        contador=len(str(numero))
        return contador
    if numero<=0:
        return(-1)
print(numberOfNumbers(numero))