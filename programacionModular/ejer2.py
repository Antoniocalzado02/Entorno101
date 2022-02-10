
'''n=int(input("Dime un año bisiesto"))
while n<=0:
    n=int(input("Dime un año bisiesto mayor que 0"))'''


def leapYear(n):
    if (n%400==0) or (n%4==0 and not n%100==0 and not n%400==0):
        return (1)
    else:
        return (-1)
    
'''print(leapYear(n))'''