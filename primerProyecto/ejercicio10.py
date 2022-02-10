a=int(input("Dime el primer lado"))
b=int(input("Dime el segundo lado"))
c=int(input("Dime el tercer lado"))
if (a==b and b==c):
    print("Es un triangulo equilatero")
elif (a==b or a==c) and (a!=b or b!=c):
    print("El triangulo es isosceles")
elif a**2 + b**2 == c**2 or a**2 + c**2 == b**2 or b**2 + c**2== a**2:
    print("el triangulo es rectangulo, cumple pitagoras")
else:
    print("El triangulo es escaleno")