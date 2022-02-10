
def palabraEscondida(cadena,palabra):
    resultado=False
    posicion=0
    letra=""
    for i in cadena:
        if palabra[posicion]==i:
            letra+=i
            posicion+=1
    if letra==palabra:
        return True 
    return resultado
print(palabraEscondida("shybaoxlna", "hola"))
print(palabraEscondida("shybaoxlna", "holav"))    
        