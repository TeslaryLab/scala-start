val movies = 
<movies>
	<movie genre="action">尖峰时刻</movie>
	<movie genre="fairytale">Edward Scissorhands</movie>
	<movie>Wall E</movie>
	<short>Jack Attack</short>
</movies>

println(movies.text)
val movieList = movies \ "movie"
println(movieList(0))
println(movieList(0) \ "@genre")

(movies \ "_").foreach {movie =>
	movie match {
		case <movie>{movieName}</movie> => println(movieName)
		case <short>{shortName}</movie> => println(shortName)
	}
}

// pattern match
def doChore(chore: String): String = chore match {
	case "clean dishes" => "scrub, dry"
	case "cook dinner" => "chop, sizzle"
	case _ => "whine, complain"
}
println(doChore("clean dishes"))
println(doChore("mow lawn"))

def facotrial(n: Int): Int = n match {
	case 0 => 1
	case x if x > 0 => factorial(n-1) * n
}
println(factorial(3))
println(factorial(0))

// regexp
val reg = """^(F|f)\w*""".r
println(reg.findFirstIn("Fantastic"))
println(reg.findFirstIn("Not Fantastic"))
