// if Kotlin version <1.3 define function as:
// fun calculations(args: Array<Staring>)
// else define function as below:

// defining function here
fun calculations(){

    val num1: Int = 5
    val num2: Int = 10
    // storing result
    var sum: Int = num1+num2
    var difference: Int = num2 - num1
    var mod: Float = num2.toFloat() / num1.toFloat()

    // printing results:
    println("Sum is equal to: " + sum)
    println("Difference is equal to: " + difference)
    println("Mod is equal to: " + mod)
}

calculations()