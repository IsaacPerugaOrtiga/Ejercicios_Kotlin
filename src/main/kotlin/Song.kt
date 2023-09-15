class Song(private val title:String,private val artist: String,private val year: Int,private var reproductions: Int) {

    private fun repdroductionsPopularity(){
        if(reproductions >= 1000){
            println("This song is so popular.")
        }else{
            println("This song is not popular yet.")
        }
    }
    override fun toString(): String {
        return "$title, interpretada por $artist, se lanzó en $year ."
    }
}