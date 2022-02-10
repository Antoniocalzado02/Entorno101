anno=int(input("Dime un año"))

if (anno%4==0 and not anno%100==0) or (anno%400==0):
    print("Este año es bisiesto")
else:
    print("Este año no es bisiesto")