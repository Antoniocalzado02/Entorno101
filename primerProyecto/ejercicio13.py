cantidadAlumnos=int(input("Dime cuantos alumnos son"))
cantidadPrecio=0
if cantidadAlumnos>=100:
    cantidadPrecio=65
    
elif cantidadAlumnos>=50:
    cantidadPrecio=70

elif cantidadAlumnos>=30:
    cantidadPrecio=95

else:
    print("La reta es del autobus es de 4000 euros")     

if cantidadPrecio>0:
    print((cantidadAlumnos*cantidadPrecio), "Euros sera el precio del autobus que se deben pagar por alumno")
    print(((cantidadAlumnos*cantidadPrecio)/cantidadAlumnos), "El precio por alumno")