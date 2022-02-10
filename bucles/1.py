figura=int(input("Dime cuantos lados tiene la figura que quieres calcular"))
contador=0
acumulador=0
division=0

while contador<figura:
    lado=int(input("Dime cuanto mide cada lado"))
    while lado<0:
        lado=int(input("Dime cuanto mide cada lado"))
    if lado>0:
        acumulador= acumulador+lado
        contador=contador+1

division=acumulador/figura

print("El perimetro es ",division )
