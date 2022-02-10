totalUva=0
tiposUva=input("Dime cual es el tipo de la uva, si es A o B")
tamanoUva=int(input("Dime cual es el tamaño de la uva, si es 1 o 2"))
kiloUva=int(input("Dime cuantos kilos de uva tienes"))
precioUva=int(input("Dime el precio que quieras ponerle a la uva"))
totalUva=precioUva*kiloUva
porcentaje=0
if tiposUva=="A" and tamanoUva==1:
    porcentaje=0.20
elif tiposUva=="A" and tamanoUva==2:
    porcentaje=0.30
elif tiposUva=="B" and tamanoUva==1:
    porcentaje=-0.30
elif tiposUva=="B" and tamanoUva==2:
    porcentaje=-0.50
else:
    print("Error")          
if porcentaje!=0:
    print("Tu precio final es " +  str((totalUva)+(totalUva*porcentaje)) + (" euros. La ganancia es de ") + str(totalUva*porcentaje)+(" euros"))

    
