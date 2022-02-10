base=int(input("Dime una base"))
potencia=int(input("Dime una potencia"))


def myPower(base,potencia):
    contador=0
    i=1
    if potencia<0:
        return (-1)
    while potencia>contador:
        i=i*base
        contador=contador+1
    return (i)

print(myPower(base, potencia))