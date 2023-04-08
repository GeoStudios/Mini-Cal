from srcP.logic.gates import notGate
# from logic.gates import notGate

MaxBits = 4

def StringToBinlist(bin):
    return list(bin)

def BinlistToString(bin):
    return "".join(bin)

def BinaryToDecimal(bin):
    mul=1
    sum=0
    
    binList = StringToBinlist(bin)
    binlist2 = StringToBinlist(bin)

    if (binList[0] == "1"):
        mul = mul * -1
        sum = -1
    
    binList.reverse()
    

    for i in range(MaxBits):
        
        if (binlist2[0] == "1"):
            sum = sum + int(notGate(binList[i])) * mul
            # print(notGate(binList[i]))
        else:
            sum = sum + int(binList[i]) * mul
            
        mul = mul * 2
    
    return sum

def DecimalToBinary(dec):
    dec2 = int(str(dec).replace("-", ""))
    if ("-" in str(dec)):
        dec2 = dec2-1
    
    binList = []
    div = dec2/1
    for _ in range(MaxBits):
        binList += [str(int(div % 2))]
        div = div/2
    
    bin2List = []

    for i in range(MaxBits):
        if ("-" in str(dec)):
            bin2List = bin2List + [notGate(binList[i])]
        else:
            bin2List = bin2List + [binList[i]]
    bin2List.reverse()

    return "".join(bin2List)
    
