def cadenaTexto(cadena):
    
    contenedorSilabas=""
    contenedorVocales=""
    vocales=["a","e","i","o","u"]
    
    for i in range(len(cadena)):
        
        if str.lower(cadena[i]) in "aeiou":
            
            
            