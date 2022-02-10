minutos=int(input("Dime el tiempo que has estado llamando"))
dia=input("Dime el dia")
hora=input("Dime si es por la mañana o por la tarde")
impuesto=1

if minutos<=5:
    dinero=minutos*1
elif minutos<=8:
    dinero=5+(minutos-5)*0.8
elif minutos<=10:
    dinero=7.40+(minutos-8)*0.70
elif minutos>10:
    dinero=8.80+(minutos-10)*0.50
if (dia=="Domingo"):
    impuesto=dinero*0.03
elif (dia=="Lunes" or dia=="Martes" or dia=="Miercoles" or dia=="Jueves" or dia=="Viernes" or dia=="Sabado") and (hora=="Mañana"):
    impuesto=dinero*0.15
elif (dia=="Lunes" or dia=="Martes" or dia=="Miercoles" or dia=="Jueves" or dia=="Viernes" or dia=="Sabado") and (hora=="Tarde"):
    impuesto=dinero*0.10

print(impuesto+dinero, "euros este es el total de la llamada")