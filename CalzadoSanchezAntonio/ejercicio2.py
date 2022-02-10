edad=int(input("Introduce tu edad"))
altura=float(input("Introduce tu altura"))
peso=float(input("Introduce tu peso"))


while edad<=0:
    edad=int(input("Introduce tu edad"))

while altura<=0:
    altura=(input("Introduce tu altura"))

while peso<=0:
    peso=(input("Introduce tu peso"))

imc=float(peso/(altura*altura))
imc=round(imc, 1)
print(f"{imc} este es tu IMC")

if imc<18.5:
    print("Peso insuficiente")
if (imc>18.5 and imc<24.9):
    print("Normopeso")
if (imc>25 and imc<29.9):
    print("Sobrepeso")
elif edad>45:          
    print("Debe acudir al centro medico")

if (imc>30 and imc<39.9):
    print("Obesidad")
elif edad>45:
    print("Debe acudir al centro medico")

if imc>40:
    print("Obesidad morbida")
    
    
    
    
    
    