def reemplazarPalabra(cadena,palabraBuscar,palabraReemplzar):
    palabra=""
    palabraPerfecta=""
    
    
    for i in range(len(cadena)):
        
        if cadena[i]!=" ":
            palabra=palabra+cadena[i]
        else:
            if palabra==palabraBuscar:
                palabraPerfecta=palabraPerfecta+palabraReemplzar + " "
            elif palabra!=palabraBuscar:
                palabraPerfecta=palabraPerfecta+palabra + " "
            palabra=""
           
            
        
                
    return(palabraPerfecta)
print(reemplazarPalabra("pedro pica piedra", "pica", "come"))
                