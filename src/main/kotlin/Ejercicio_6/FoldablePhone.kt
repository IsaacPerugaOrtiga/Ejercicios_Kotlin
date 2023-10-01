package Ejercicio_6

class FoldablePhone(var isFolding: Boolean = true, isScreenLightOn: Boolean = false): Phone(isScreenLightOn) {

    override fun switchOn(){
        isScreenLightOn = !isFolding
    }


    fun folderTrue(){
        isFolding
    }

    fun folderFalse(){
        isFolding = false
    }

    fun checkPhoneFolder(){
        val phoneFolding = if(isFolding) "folded" else "deployed"
        println("The phone is $phoneFolding")


    }


}