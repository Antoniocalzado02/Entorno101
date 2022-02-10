def palindromo(cadena):
    listaA=[]
    listaB=[]
    for i in range(0,len(cadena)):
        listaA.append(cadena[i])
    for j in range(len(cadena)-1,-1,-1):
        listaB.append(cadena[j])
    if listaA==listaB:
        print("Es palindromo")
    else:
        print("No es palindromo")

palindromo("anilina")
palindromo("ana")
palindromo("toobboboot")


def palindromo2(cadena):
    cadenaInvertida=""
    
    for i in cadena:
        cadenaInvertida = i + cadenaInvertida
        
    return cadenaInvertida==cadena

print(palindromo2("anilina"))