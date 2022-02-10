cantidad=20
edad=int(input("Dime que edad tienes"))
contador=1
acumulador=cantidad

while edad<=0:
    edad=int(input("Dime que edad tienes, un numero mayor que 0"))
    
while contador<edad:
    cantidad=cantidad+15
    acumulador=acumulador+cantidad
    contador=contador+1
    
print(f"Juan tiene ahora {edad} años y tiene {acumulador} euros")

