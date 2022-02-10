puntox=int(input("Dime el punto x"))
puntoy=int(input("DIme el punto y"))

if puntox>0 and puntoy>0:
    print("Esta en el primer cuadrante")
elif puntox<0 and puntoy>0:
    print("Esta en el segundo cuadrante")
elif puntox<0 and puntoy<0:
    print("Esta en el tercer cuadrante")
elif puntox>0 and puntoy<0:
    print("Esta en el cuarto cuadrante")