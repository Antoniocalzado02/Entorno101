print("Esta son las opciones: \n 1.Cambio de euros a dólares \n 2.Cambio de dólares a euros \n 3.Cambio de euros a libras \n 4.Cambio de libras a euros. \n 5.Cambio de libras a dólares \n 6.Cambio de dólares a libras \n 7.Salir")
numeroSeleccion=int(input("Dime que opcion quieres realizar"))    
cantidadDinero=int(input("Cuanto dinero quieres cambiar"))
    
while numeroSeleccion<=0 or numeroSeleccion>7:
    numeroSeleccion=int(input("Dime que opcion quieres realizar, entre estas 7"))
while cantidadDinero<=0:
    cantidadDinero=int(input("Cuanto dinero quieres cambiar"))
    
if numeroSeleccion==1:
    print("Esta es la cantidad de euros a dolares", (cantidadDinero*1,14))
elif numeroSeleccion==2:
    print("Esta es la cantidad de dolares a euros", (cantidadDinero*0,88))
elif numeroSeleccion==3:
    print("Esta es la cantidad de euros a libras", (cantidadDinero*0,85))
elif numeroSeleccion==4:
    print("Esta es la cantidad de libras a euros", (cantidadDinero*1,18))
elif numeroSeleccion==5:
    print("Esta es la cantidad de libras a dolares", (cantidadDinero*1,35))
elif numeroSeleccion==6:
    print("Esta es la cantidad de dolares a libras", (cantidadDinero*0,74))
elif numeroSeleccion==7:
    print("Has salido del cambio de moneda")