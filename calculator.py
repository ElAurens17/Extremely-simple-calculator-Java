def add(q, w):
   return q + w  

def subtract(q, w):
    return q - w

def divide(q, w):
    return q / w
    
def multiply(q, w):
    return q * w
    
x = int(input("""
      1.add
      2.subtract
      3.multiply
      4.divide
          """))

if x == 1:
    q = int(input("1st value: "))
    w = int(input("2nd value: "))

    result = add(q, w)
    print("Sum:", result)

elif x == 2:
    q = int(input("1st value: "))
    w = int(input("2nd value: "))

    result = subtract(q, w)
    print("Difference:", result)
elif x == 3:
    q = int(input("1st value: "))
    w = int(input("2nd value: "))

    result = multiply(q, w)
    print("Product:", result)
elif x == 4:
    q = int(input("1st value: "))
    w = int(input("2nd value: "))

    result = divide(q, w)
    print("Quotient:", result)