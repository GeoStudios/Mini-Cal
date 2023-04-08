f = open("Generate", "w")

# for i in range(32):
#     f.write("    b.b"+str(i+1)+" = (int)(a["+str(i)+"]);\n")

for i in range(32):
    f.write("    b.b"+str(i+1)+" = a["+str(i)+"];\n")


f.close()