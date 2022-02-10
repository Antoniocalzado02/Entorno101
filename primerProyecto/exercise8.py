numero=int(input("Dime un numero"))
ask=input("Quieres introducir un numero Y/N")
while ask=="Y":
    numero=int(input("Dime un numero"))
    ask=input("Quieres introducir un numero Y/N")
    numero=numero+0
    if numero<numero:
        numero=numero+0
print(numero)