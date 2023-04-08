from logic.gates import notGate, bufferGate, andGate, nandGates, orGate, norGate, xorGate, xnorGate, xorxGate
from logic.conversions import StringToBinlist, BinlistToString, BinaryToDecimal, DecimalToBinary, MaxBits

def adder(binA, binB, carry):
    binla = StringToBinlist(binA)
    binlb = StringToBinlist(binB)
    binla.reverse()
    binlb.reverse()

    sum = []
    carryO = carry
    for i in range(MaxBits):
        sum1 = xorGate(binla[i], binlb[i])
        sum = sum + [xorGate(sum1, carryO)]
        carryO = orGate(andGate(binla[i], binlb[i]), andGate(carryO, sum1))

    sum.reverse()

    return "".join(sum), carryO

def subtractor(binA, binB, notz):
    binla = StringToBinlist(binA)
    binlb = StringToBinlist(binB)
    # binla.reverse()
    # binlb.reverse()
    binlaa = []
    binlbb = []

    if (notz == "1"):
        for i in range(MaxBits):
            binlaa = binlaa + [notGate(binla[i])]
        binlbb = binlb
        binlaa = StringToBinlist(adder("".join(binlaa), DecimalToBinary(1), "0")[0])

    else:
        for i in range(MaxBits):
            binlbb = binlbb + [notGate(binlb[i])]
        binlaa = binla
        binlbb = StringToBinlist(adder("".join(binlbb), DecimalToBinary(1), "0")[0])

    sum = adder("".join(binlaa), "".join(binlbb), "0")

    return "".join(sum[0]), 0

def shiftRight(a):
    a0 = StringToBinlist(a)
    # a0.reverse()
    qc = []
    for i in range(MaxBits-1):
        qc = qc + [a0[i]]
        print(qc)
    qc = qc + ["0"]
    # qc.reverse()
    
    return "".join(qc), 0

def shiftLeft(a):
    a0 = StringToBinlist(a)
    a0.reverse()
    qc = []
    for i in range(MaxBits-1):
        qc = qc + [a0[i]]
        print(qc)
    qc = ["0"] + qc
    qc.reverse()
    
    return "".join(qc), 0
