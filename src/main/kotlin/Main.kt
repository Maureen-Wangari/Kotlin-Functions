fun main(){
    PrintOut(name = "Maureen")
    Remainder(15, 4)
    sum(94, 76, 44, 39)
    FunFactsAboutMe("I love peanut butter and jam")


}
fun PrintOut(name: String){
    println("Hello $name")
}

fun Remainder(a: Int, b:Int){
    var outcome= a % b
    println("outcome = $outcome")
}

fun sum(a: Int, b: Int, c:Int, d: Int){
    var answer= a+b+c+d
    println("answer= $answer")
}

fun FunFactsAboutMe(interestingFacts: String){
    println("FunFactsAboutMe")
}