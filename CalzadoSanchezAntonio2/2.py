def formarAdn(cadena,palabra):
    contador=0
    posicion=0
    letra=""
    for i in cadena:
        if palabra==letra:
            contador+=1
            letra=""
            posicion=0
        if palabra[posicion]==i:
            letra+=i
            posicion+=1
    return contador

print(formarAdn("AATCGACTTGCCAGCGACTACTACTAA", "CGACT"))


def cambiarAdn(cadena,cadenacorrecta):
    lista=["A","T","G","C"]
    cadenaVacia=""
    for i in cadena:
        if i==lista[1]:
            cadenaVacia+=lista[0]
        if i==lista[2]:
            cadenaVacia+=lista[3]
        if i==lista[0]:
            cadenaVacia+=lista[1]
        if i==lista[3]:
            cadenaVacia+=lista[2]
        
        
    if cadenacorrecta==cadenaVacia:
        return True 
    else:
        return False



print(cambiarAdn("TGACTGGTCAA","ACTGACCAGTT")) 
print(cambiarAdn("TGACTGGTCAA","ACTGACCAATT"))

           