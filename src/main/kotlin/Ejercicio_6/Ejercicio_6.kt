package Ejercicio_6

fun main(){
    val phone = FoldablePhone(true) //The phone is folded here

    phone.folderFalse() //The phone is not folded here
    phone.checkPhoneFolder()
    phone.switchOn() //As it is not folded, the screen is on.
    phone.checkPhoneScreenLight()


}