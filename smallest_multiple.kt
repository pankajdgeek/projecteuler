fun main(args: Array<String>) {
    var number =40
    var isFound = false
    while(!isFound){
        var isThisTrue = true 
        for(i in 1..20){
            if(number%i!=0){
                isThisTrue = false
                break
            }
        }
        if(isThisTrue){
            isFound = true
        }else
            number =number+20

    }
    println(number) 
}