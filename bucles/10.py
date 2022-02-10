partidos=int(input("Cuantos partidos se han jugado"))
contador=0
lista1=[]
while contador<partidos:
    equipo1=int(input("Dime cuantos goles ha metido el equipo local"))
    equipo2=int(input("Dime cuantos goles ha metido el equipo visitante"))
    
    while equipo1<0 or equipo2<0:
        equipo1=int(input("Dime cuantos goles ha metido el equipo local"))
        equipo2=int(input("Dime cuantos goles ha metido el equipo visitante"))
    
    if equipo1>equipo2:
        lista1.append("1")
    elif equipo1<equipo2:
        lista1.append("2")
    else:
        lista1.append("X")
    
    
    contador=contador+1

print(lista1)

for i in range(len(lista1)):
    print(f"Este es el numero de partido {i+1}, El resultado de este partido es {lista1[i]}")