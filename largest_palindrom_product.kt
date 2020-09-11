fun main(args: Array<String>) {
    val start=100
    val end=999
    var resultNumber = 0
    for(x in end downTo start){
        for(j in end downTo start){
            val result = (x*j)
            if(isPalindrome(result.toString())){
                if(result>resultNumber){
                    resultNumber = result
                    println("$x $j")
                    // println(resultNumber)
                }
                break
            }
    }
    }
    println(resultNumber)

}

fun isPalindrome(result:String):Boolean{
    return result.equals(result.reversed())   
}