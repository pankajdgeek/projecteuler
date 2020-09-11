fun main(args: Array<String>) {
    val lastValue = 4000000
    var totalSum = 0
    var prev =0
    var current =1
    for(i in 0..Int.MAX_VALUE){
        val temp = prev
        prev = current
        current = temp+current
        if(current>lastValue)
            break
        if(current%2==0)
            totalSum +=current
    }
    println(totalSum)
}