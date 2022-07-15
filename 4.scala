def cost(c:Int):Double={
    val price=24.95;
    if (c<=50){
        var a=(24.95*c) + (3*c);
        return a - (0.4*a);
    }else{
        var a=(24.95*c) + (3*50 + 0.75*(c-50));
        return a - (0.4*a);
    }
}

def main(args: Array[String])={
    println("cost for 60 copies :"+cost(60));
}