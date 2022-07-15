def FtoC(c:Double):Double={
    return c * 1.8000 + 32.00;
}

def main(args: Array[String])={
    println("35 ºC in ºF :"+FtoC(35));
}