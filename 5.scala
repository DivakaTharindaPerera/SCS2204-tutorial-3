def easy(d:Double):Double={
    return d*8;
}

def tempo(d:Double):Double={
    return d*7;
}

def main(args: Array[String])={
    var a=easy(4)+tempo(3);
    println("Total running time :"+a);
}