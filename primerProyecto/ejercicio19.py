base=int(input("Dime una base"))
exponente=int(input("Dime un exponente"))
total=1
for i in range(exponente):
    total=base*total
print(int(total))