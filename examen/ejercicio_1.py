vacuna = input("Que vacuna a recibido:")
edad = int(input("Que edad tienes:"))
covid = input("Has pasado el covid:")


while (vacuna != "Astrazeneca" and vacuna != "Moderna" and vacuna != "Pfizer") or (covid != "N" and covid != "S") or (edad <= 0):
    print("ERROR, por favor introduzca los datos correctamente")
    vacuna = input("Que vacuna a recibido:")
    edad = int(input("Que edad tienes:"))
    covid = input("Has pasado el covid:")
    
    
if vacuna == "Astrazeneca":
    print("Debe volver a vacunarse")
else:
    if vacuna == "Moderna" and  edad > 60 and covid == "N":
            print("Debe volver a vacunarse")
   
    else:
        if (vacuna == "Pfizer" and  covid == "N") or (vacuna == "Pfizer" and covid == "S" and edad > 70):
            print("Debe volver a vacunarse")
        else:
            print("No debe volver a vacunarse")
        
        

        
