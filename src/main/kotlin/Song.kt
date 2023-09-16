//Ejercicio 4
class Song(private val title:String, private val artist: String, private val year: Int, private var reproductions: Int) {


     fun reproductionsPopularity(){
        if(this.reproductions >= 1000){
            println("This song is so popular.")
        }else{
            println("This song is not popular yet.")
        }
    }
    override fun toString(): String {
        return "$title, interpretada por $artist, se lanzó en $year ."
    }
}

fun main(){
    val title = "Salir"
    val artist = "Extremoduro"
    val year = 1998
    val reproductions = 38988791

    val song = Song(title,artist,year,reproductions)

    song.reproductionsPopularity()

    println(song.toString())



}