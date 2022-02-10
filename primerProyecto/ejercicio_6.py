num1 = int(input("Enter one number"))
num2 = int(input("Enter one number"))
result = 0
# si los son negativos
if num2 < 0 and num1 < 0:
    num2 = abs(num2)
    num1 = abs(num1)
else:    
    if num2 < 0: # si es negativo  el segundo multiplica
        num2 = abs(num2)
        num1 = -(num1)

for i in range(num2):
    result += num1
    

        
print("The product is "+str(result))
