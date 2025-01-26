fun main() {
    val likes = 41

    if (likes % 10 == 1 &&
            (!(likes == 11 && likes < 100) &&
                    !(likes >= 100 && likes % 100 == 11)
            )
        ) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}