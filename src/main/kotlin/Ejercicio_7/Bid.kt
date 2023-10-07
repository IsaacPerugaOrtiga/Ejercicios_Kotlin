package Ejercicio_7

 class Bid(val amount: Int, val bidder: String) {
    fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
        // Fill in the code.
        return if(amount > minimumPrice && bid != null){
            amount
        }else{
            minimumPrice
        }
    }
}