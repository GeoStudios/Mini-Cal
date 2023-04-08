from srcP.logic.conversions import DecimalToBinary
f = open("Generate.txt", "w")

# for i in range(32):
#     f.write("    b.b"+str(i+1)+" = (int)(a["+str(i)+"]);\n")

for i in range(16):
    f.write('    if ( nibbleString == "'+DecimalToBinary(i)+'") hexL.add("'+hex(i).replace("0x", "")+'");\n')


f.close()