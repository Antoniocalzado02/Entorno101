numeroTotal=int(input("Dime cuantos numeros debe pedir"))
contador=0
acumulador=0
while contador<numeroTotal:
    numero1=int(input("Dime un numero"))
    if numero1>0:
        acumulador=acumulador+numero1
        contador=contador+1
division=acumulador/numeroTotal
print("La media es ",division )
