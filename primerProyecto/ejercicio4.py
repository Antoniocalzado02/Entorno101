#Vamos a realizar un 15% de descuento sobre el total
producto=int(input("Dime el precio del producto para aplicar el 15%, cuando quieras que termine introduce un 0"))
precios=0
while producto!=0:
    precios=producto+precios
    producto=int(input("Dime el precio del producto para aplicar el 15%, cuando quieras que termine introduce un 0"))
descuento=(precios*15) /100
precioTotal=precios-descuento
print("El precio total de tu compra es de: " + str(precioTotal))
print("Con el descuento del 15% es: " + str(descuento))
    