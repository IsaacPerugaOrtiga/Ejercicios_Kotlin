fun main(){
    val child = 8
    val adult = 28
    val senior = 87

    val isMonday = true


    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int{
    if(age <= 12){
        return 15
    }else if(age in 13..60){
        if(isMonday){
            return 25
        }else{
            return 30
        }

    }else if(age >= 61){
        return 25
    }else{
        return -1
    }

}