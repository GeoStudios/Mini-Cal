def notGate(a):
    out = "1"
    if a == "1":
        out = "0"
    return out

def bufferGate(a):
    out = notGate(notGate(a))
    return out

def andGate(a, b):
    out = "0"
    if a == "1" and b == "1":
        out = "1"
    return out

def nandGates(a, b):
    out = notGate(andGate(a, b))

    return out

def orGate(a, b):
    out = notGate(andGate(notGate(a), notGate(b)))

    return out

def norGate(a, b):
    out = notGate(orGate(a, b))

    return out

def xorGate(a, b):
    out = orGate(andGate(a, notGate(b)), andGate(notGate(a), b))

    return out

def xorxGate(a, b, na, nb, oor, nc):
    a0 = a
    b0 = b
    fa = "0"
    fb = "0"
    if (na == "1"):
        a0 = notGate(a)
    else:
        a0 = a
    if (nb == "1"):
        b0 = notGate(a)
    if (oor == "1"):
        fa = a0
        fb = b0
    else:
        fa = andGate(a0, notGate(b0))
        fb = andGate(notGate(a0), b0)
        
    out = orGate(fa, fb)
    out0 = out
    if (nc == "1"):
        out0 = notGate(out)

    return out0

def xnorGate(a, b):
    out = notGate(xorGate(a, b))

    return out