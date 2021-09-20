fun main(){
    while(true){
        var num1: Float
        var operator: String
        var num2: Float
        print("Enter first number: ")
        try{
            num1 = readLine()!!.toFloat()
        }catch (e: Exception){
            num1 = 0.0F
        }
        println(num1)
        print("Enter operator: ")
        operator = readLine().toString()
        println("$num1 $operator")
        print("Enter second number: ")
        try{
            num2 = readLine()!!.toFloat()
        }catch (e: Exception){
            num2 = 0.0F
        }
        when(operator){
            "/" -> {
                if(num2 == 0F){
                    println("You cannot divided by 0")
                    continue
                }
                else
                    println("$num1 $operator $num2 = ${num1 / num2}")
            }
            "+" -> println("$num1 $operator $num2 = ${num1 + num2}")
            "-" -> println("$num1 $operator $num2 = ${num1 - num2}")
            "*" -> println("$num1 $operator $num2 = ${num1 * num2}")
        }
        break
    }
}