#Queremos sacar la raiz cuadrada y cubica de 1 numero
from math import sqrt
numero=int(input("Introduce un numero por favor"))
raizCuadrada=0
raizCubica=0
raizCubica=numero**(1//3)
raizCuadrada=round(sqrt(numero))
print("La raiz cuadrada del numero introducido es: " + str(raizCuadrada) + " y la raiz cubica del numero introducido es: " + str(raizCubica))
