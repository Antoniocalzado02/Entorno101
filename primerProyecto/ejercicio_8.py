num = int(input("Enter one number:"))
numero = input("Do you want to enter more number (Y/N)?")
small = num
while numero == "Y":
    num = int(input("Enter one number:"))
    if num < small:
        small = num
    numero = input("Do you want to enter more number (Y/N)?")
print("The smallest number is " +str(small))