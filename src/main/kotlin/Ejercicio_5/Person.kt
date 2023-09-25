package Ejercicio_5

class Person(private val name: String,private val age: Int,private val hobby: String?,private val referrer: Person?) {
    fun showProfile() {
        
        print("Name: $name \n Age: $age. \n ")
        if(hobby == null){
            print("Don´t like anything.")
        }else{
            print("Like to $hobby.")
        }

        if(referrer == null){
            print("Doesn't have a referrer.\n")
        }else{
            print("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}\n")
        }
    }
}