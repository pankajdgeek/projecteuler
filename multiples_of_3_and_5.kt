fun main(args: Array<String>) {
    var final_sum = 0
    for(i in 0..999){
        if(i%3==0||i%5==0){
            final_sum +=i
        }
    }
    println(final_sum)
}