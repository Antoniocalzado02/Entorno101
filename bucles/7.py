anyo=int(input("Dime el año que quieres saber si es bisiesto"))

while anyo<=0:
    anyo=int(input("Dime el año que quieres saber si es bisiesto"))

if (anyo%400==0) or (anyo%4==0 and not anyo%100==0):
    print("Es bisiesto")
else:
    print("No es bisiesto")
    