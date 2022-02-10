def cifradoCesar(cadena,posicion,palabra):
    cadena=str.lower(cadena)
    palabra=str.lower(palabra)
    palabraVacia=""
    abecedario="abcdefghijklmnñopqrstuvwxyz"
    palabraCifrada=""
    mensaje="Son equivalentes "
    mensaje1="No son equivalentes"
    
    
    for i in range(len(cadena)):
        palabraVacia+=cadena[i]
        for j in range(len(abecedario)):
            if cadena[i]==abecedario[j]:
                palabraCifrada+=abecedario[j+posicion]
    
    print(palabraCifrada)
        
    if palabraVacia==cadena and palabraCifrada==palabra:
        return mensaje
    else:
        return mensaje1
     

print(cifradoCesar("Casado", 3, "FDVDGR"))
print(cifradoCesar("Antonio", 3, "OPLKIUY"))
print(cifradoCesar("Antonio", 3, "dpwrplr"))
print(cifradoCesar("ordenador", 5, "twijrfitw"))





