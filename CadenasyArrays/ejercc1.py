def charactersInString(letra,cadenaLetra):
    
    contador=0
    
    for i in range(len(cadenaLetra)):
        if str.lower(cadenaLetra[i])==str.lower(letra):
            contador+=1
    return contador
        
print(charactersInString("a", "cadenaLetra"))



def lowCaseInString(cadena):
    contador=0
    for i in range(len(cadena)):
        if (cadena[i].islower()):
            contador=contador+1
    

    print(contador)
lowCaseInString("La tArraaaAAP")

def upperCaseInString(cadena):
    contador=0
    for i in range(len(cadena)):
        if (cadena[i].isupper()):
            contador=contador+1
    

    print(contador)
upperCaseInString("La tArraaaAAP")

def numberInString(cadena):
    contador=0
    for i in range(len(cadena)):
        if (cadena[i].isdigit()):
            contador=contador+1
    

    print(contador)
numberInString("7La1 tArra123aaAAP453")

