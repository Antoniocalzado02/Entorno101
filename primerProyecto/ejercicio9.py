base=int(input("Introduce la base"))   
exponente=int(input("Introduce el exponente"))
resultado=1
for i in range (abs(exponente)):
    resultado=base*resultado
if exponente >= 0:
    print(resultado)
else:
    print(1/resultado)
    