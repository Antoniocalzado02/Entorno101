from ejer2 import leapYear
n=int(input("Dime un año"))
mes=input("Dime el mes")

def daysInMonth(n,mes):
    if (mes=="Enero" or mes=="Marzo" or mes=="Mayo" or mes=="Julio" or mes=="Agosto" or mes=="Octubre" or mes=="Diciembre"):
        return("Tiene 31 dias")
    elif (mes=="Abril" or mes=="Junio" or mes=="Septiembre" or mes=="Noviembre"):
        return("Tiene 30 dias")
    elif leapYear(n)==1 and mes=="Febrero":
        return("Tiene 29 dias")
    elif leapYear(n)==(-1) and mes=="Febrero":
        return("Tiene 28 dias")
    
print((daysInMonth(n, mes)))