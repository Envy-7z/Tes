class Tes {
    fun main(args: Array<String>) {

        val num = intArrayOf(3, 5, 2, -4, 8, 11)
        val toFind = 7
        var found = false

        for (n in num) {
            if (n == toFind) {
                found = true
                break
            }
        }

        if (found)
            println("$toFind is found.")
        else
            println("$toFind is not found.")
    }
}

//Maaf mas lupa method apa buat nyari outputnya yang sesuai array 2 dimensi atau apa jadi baru bisa segini mas 
