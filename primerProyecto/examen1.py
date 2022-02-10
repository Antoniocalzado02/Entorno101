edad=int(input("Dime tu edad"))
covid=input("Has pasado el covid SI o NO")
tipoVacuna=input("Tipo de Vacuna: Pfizer, Moderna o Astrazeneca")

if tipoVacuna=="Aztrazeneca" and (covid=="SI" or covid=="NO") and edad>=1:
    print("Debe volver a vacunarse")
elif tipoVacuna=="Moderna" and edad>60 and covid=="NO":
    print("Debes volver a vacunarte")
    if tipoVacuna=="Moderna" and edad>60 and covid=="SI":
        print("No debes volver a vacunarte")
elif tipoVacuna=="Pfizer" and covid=="NO":
    print("Debes volver a vacunarte")
    if tipoVacuna=="Pfizer" and covid=="SI" and edad>70:
        print("No debes volver a vacunarte")