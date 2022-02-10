contador30 = 0
contador49 = 0
contador50 = 0

mes = int(input("En que mes has nacido:"))
ano = int(input("En que año has nacido:"))

while mes != -1:
    if mes > 11:
        ano = ano - 1
    anoActual = 2021 - ano
    
    if anoActual <= 30:
        contador30 += 1
    else:
        if anoActual > 30 and anoActual < 50:
            contador49 += 1
        else:
            contador50 += 1
    
    print("Gracias, siguiente por favor")
    mes = int(input("En que mes has nacido:"))
    ano = int(input("En que año has nacido:"))

print("Personas menores de 30 años:" +str(contador30))
print("Personas mayores de 31 años y menores de 50:" +str(contador49))
print("Personas mayores de 50 años:" +str(contador50))
