def palabraEscondida(cadena,palabra):
    listaCadena=[]
    listaPalabra=[]
    for i in range(0,len(cadena)):
        listaPalabra.append(cadena[i])
        for j in range(0,len(palabra)):
            if cadena[i]==palabra[j]:
                listaCadena.append(palabra[j])
    if listaCadena==listaPalabra:
        print("La palabra se encuentra en esta cadena")
    else:
        print("La palabra no esta en esta cadena")
            
palabraEscondida("hola", "shybaoxlna")
                    