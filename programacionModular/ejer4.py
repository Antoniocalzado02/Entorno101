dia=int(input("Dime el dia"))
mes=int(input("Dime el mes"))
anyo=int(input("Dime el año"))

def dayOfWeek(dia,mes,anyo):

    a = (14 - mes) // 12 
    y = anyo - a 
    m = mes + 12 * a - 2 
    d = (dia + y + y//4 - y//100 + y//400 + (31*m)//12) % 7
    
    semana=["Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"]
    return semana[d]
print(dayOfWeek(dia, mes, anyo))
