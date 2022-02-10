base=int(input("Dime una base"))
exponente=int(input("Dime el exponente, tambien puede ser negativo"))
multiplicacion=1

if exponente>0:
    for i in range(0,abs(exponente)):
        multiplicacion=int(base*multiplicacion)
    
    

if exponente<0:
    for i in range(0,abs(exponente)):
        multiplicacion=int(base*multiplicacion)
    multiplicacion=1/multiplicacion


print(multiplicacion)