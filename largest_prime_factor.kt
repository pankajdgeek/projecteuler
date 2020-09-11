fun main(args: Array<String>) {
    val number = 600851475143
    var primeNumber = 1L
    for(i in Math.sqrt(number.toDouble()+1).toLong() downTo 2L){
        if(number%i==0L){
            // println(i)
            var isPrime = true
            for(x in 2..Math.sqrt(i.toDouble()+1).toLong()){
                if (i%x==0L){
                    isPrime=false
                    // println("$i is not prime")
                    break
                }
            }
            if(isPrime){
                // println("$i is prime")
                primeNumber = i
                break
            }
        }
        if(primeNumber==1L){
            primeNumber=number
        }
    }
    println(primeNumber)
}