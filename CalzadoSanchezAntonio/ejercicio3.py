melodia=input("Tipo de melodia A1 o a2, B1 o b2")


while melodia!="P" or melodia!="p":
    
    
    if melodia=="A1" or melodia=="a1":
        print("Esta es la melodia A, la parte 1")
    elif melodia=="A2" or melodia=="a2":
        print("Esta es la melodia A, la parte 2")
        
    if melodia=="B1" or melodia=="b1":
        print("Esta es la melodia B, la parte 1")
    elif melodia=="B2" or melodia=="b2":
        print("Esta es la melodia B, la parte 2")
        
    melodia=input("Introuce que melodia quieres escuchar A1 o A2, B1 o B2. Si quieres salir pulsa P")
    if melodia=="P" or melodia=="p":
        print("Tu melodia ha dejado de sonar")
        break