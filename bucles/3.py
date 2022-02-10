valorInf=int(input("Dime un minimo"))
valorSup=int(input("Dime un maximo"))

while valorSup<valorInf:
    valorInf=int(input("Dime un minimo"))
    valorSup=int(input("Dime un maximo"))
    
numero=int(input("Dime un numero"))
acumulador=0
contador=0
bandera=0
while numero!=0:
    if numero>valorInf and numero<valorSup: 
        acumulador=acumulador+numero
    elif numero<valorInf or numero>valorSup:
        contador=contador+1
    else:
        bandera=1
    numero=int(input("Dime un numero"))
    
print("La suma total de los numeros introducidos dentro del intervalo es:", (acumulador))
print("La cantidad total de numeros fuera del intervalo son:", (contador))
    
if bandera==1:
    print("Has metido algun numero que coincide con los intervalos")
    