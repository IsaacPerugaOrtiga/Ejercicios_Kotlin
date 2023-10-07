package Ejercicio_7


fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${winningBid.auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${winningBid.auctionPrice(null, 3000)}.")
}
