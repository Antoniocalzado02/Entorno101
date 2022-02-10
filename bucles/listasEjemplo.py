"Tipos basicos"
"Tipos compuestos:"
"lista --> Elementos del mismo tipo, ordenados"
"insert, append, remove, len  []"

lista=[1,3,3,5]
lista.append(15) #insertar al final
lista.insert(1, 80)
lista.remove(5) #elimina el elemento de la lista

tamanyo=len(lista) #nos proporciona el tamaño de la lista

print(f"el tamaño de la lista es {tamanyo}")

print(f"la lista tiene estos elementos{lista}")

for elemento in lista:
    print(elemento)

lista2=[]
for i in range(1,16):
    lista2.append(i)
    
print(f"la nueva lista tiene estos elementos{lista2}")


nombre="Antonio Calzado Sanchez"
lista3=[]
lista3.append(nombre)

print(lista3)

for i in range(len(lista3[0])):
    print(lista3[0][i]) #Coger la lista y empezar desde el caracter 0 
    
for i in range(len(nombre)):
    print(nombre[i])
    
    
    
    