def factorial(n):
    result=1
    if n>0:
        for i in range(1,n+1):
            result=result*i
    else:
        result=-1
        
    return result

print(factorial(6))