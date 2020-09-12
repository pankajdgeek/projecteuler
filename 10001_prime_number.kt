fun main(args: Array<String>) {
    var primeCount=1
    for(x in 3..Int.MAX_VALUE step 2){
        val minValueToDivide=(x/2)
        var isPrime=true
        for(y in minValueToDivide downTo 2){
            if(x%y==0){
                isPrime=false
                break
            }
        }
        if(isPrime){
            primeCount+=1
            // println("is prime--> $x")

        }
        if(primeCount==10001){
            print(x)
            break
        }
    }
}