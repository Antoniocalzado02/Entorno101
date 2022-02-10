def funcionCoPrimos(numero1):
    lista=[]
    bandera =0
    cont = 2
    
    while cont <= int(numero1) - 1:
        if int(numero1) % cont == 0:
            bandera = bandera+1
            lista.append(cont)
        cont = cont + 1
    if bandera >=1:
        return("No es primo")
    else:
        return("Es primo")
    
    bandera1 =0
    cont1 = 2

def funcionCoPrimos2(numero2): 
    
    bandera1 =0
    cont1 = 2
    lista2=[]
    while cont1 <= int(numero2) - 1:
        if int(numero2) % cont1 == 0:
            bandera1 = bandera1+1
            lista2.append(cont1)
        cont1 = cont1 + 1
    if bandera1 >=1:
        return("No es primo")
    else:
        return("Es primo")
    

    
    

