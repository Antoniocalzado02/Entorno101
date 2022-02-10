def encontrarVocales(cadena):
    vocales=[0,0,0,0,0]
    
    contador=0
    
    for i in range (len(cadena)):
          
        if cadena[i]=="a" or cadena[i]=="A":
            vocales[0]+=1
        elif cadena[i]=="e" or cadena[i]=="E":
            vocales[1]+=1
        elif cadena[i]=="i" or cadena[i]=="I":
            vocales[2]+=1
        elif cadena[i]=="o" or cadena[i]=="O":
            vocales[3]+=1
        elif cadena[i]=="u" or cadena[i]=="U":
            vocales[4]+=1
        
        
    for i in vocales:
        if i>0:
            contador+=1
    
    return(contador)
            
 
 
print(encontrarVocales("AAmamapopo"))       