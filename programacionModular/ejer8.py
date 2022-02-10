from math import sqrt

a=int(input("Dime el numero a"))
b=int(input("Dime el numero b"))
c=int(input("Dime el numero c"))

def secondOrder(a,b,c):
    if a<0 or b<0 or c<0:
        return(-1)
    
    elif a>0 and b>0 and c>0:
        solPos=(-b + sqrt((b**2)-4*a*c))//(2*a)
        solNeg=(-b - sqrt((b**2)-4*a*c))//(2*a)
        soluciones=[solPos,solNeg]
        return(soluciones)


print(secondOrder(a, b, c))
