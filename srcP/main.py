from logic.circuits import subtractor, adder, shiftRight, shiftLeft
from logic.conversions import DecimalToBinary, BinaryToDecimal

a=DecimalToBinary(input("Number 1 : "))
print(a)
b=DecimalToBinary(input("Number 2 : "))
print(b)

sum = adder(a, b, "0")
# sum = subtractor(a, b, "0")

print("Sum", BinaryToDecimal(sum[0]))
print("Carry", sum[1])