a=int(input("Cuanto vale a"))
b=int(input("Cuanto vale b"))
c=int(input("Cuanto vale c"))

if (a+b>c) and (a+c>b) and (b+c>a):
    print("Es un triangulo")
else:
    print("No es un triangulo")