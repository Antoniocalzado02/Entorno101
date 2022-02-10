# 4. Lee por teclado números y guárdalos en una lista, el proceso finaliza cuando metamos un
# número negativo. Al finalizar el programa se debe mostrar el máximo de los números
# guardado en la lista y los números pares que formen parte de la lista.
from Ejercicio1 import mayor

def pares(array):
    pares = []
    for i in array:
        if i % 2 == 0:
            pares.append(i)
    return pares

array = []
num = int(input("Dime un número"))
while num > 0 :
    array.append(num)
    num = int(input("Dime un número"))
print(array)
print("El número más grande es " + mayor(array))
print("Los números pares son " + pares(array))