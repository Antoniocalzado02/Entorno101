clave=0
resto=0

digitos=int(input("Cuantos digitos desea introducir para generar la clave"))

for i in range(digitos):
    numeros=int(input("Introduce los numeros"))
    resto=numeros%5
    if resto%2!=0:
        clave+=resto
        
print(clave)