fun main() {
    val list = listOf('a', 'b')
    println(aCharacterPercentage(list))
}
/**
 * This Function calculates the percentage of 'a' character in a List
 * @param charsList a list of type Char and its values must be 'a' or 'b' (Small Letters) only
 * @return 'a' percentage as a Double value if the param meets requirements otherwise it returns -1.0
 */
fun aCharacterPercentage(charsList: List<Char>): Double {
    var aCount = 0
    for(i in charsList){
        if(i == 'a'){
            aCount++
        } else if(i != 'b'){
            aCount = 0
            break
        }
    }
    return if(aCount == 0){
        -1.0
    } else {
        String.format("%.1f", (aCount.toDouble() / charsList.size.toDouble()) * 100).toDouble()
    }
}