
    fun main(){
        val morningNotification = 51
        val eveningNotification = 135

        printNotificationSummary(morningNotification)
        printNotificationSummary(eveningNotification)
    }

    private fun printNotificationSummary(notification: Int) {
        if(notification in 0..99){
            println("You have $notification notifications.")
        }else if (notification > 99){
            println("Your phone is blowing up! You have 99+ notifications.")
        }else{
            println("Don´t have any notifications.")
        }
    }
