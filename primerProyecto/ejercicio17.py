numero1=int(input("Dime un numero"))
numero2=int(input("Dime otro numero"))

while numero2<numero1:
    numero1=int(input("Dime un numero"))
    numero2=int(input("Dime otro numero"))

while numero1<=numero2:
    if numero1%2==0:
        print("Los numeros pares son:", numero1)

    numero1=numero1+1