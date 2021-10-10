fun main(){

    class P1 {

        fun loop(a: List<Int>, action: (String) -> Unit) {

            var result = ""

            for (i in a) {
                result += "$i - "
            }
            action(result)
        }
    }

    class P2{
        fun addNums(a: Int, b: Int, action: (Int) -> Unit){
            val sum = a+ b

            action(sum)
        }
    }


    data class Player(
        val name: String,
        val age: Int,
        val height: Int,
    )


    var lambda1 = {a: Int, b: Int ->  a + b}
    println(lambda1(2, 5))


    val numList = (0..20).toList()
    var lambda2 ={number: String -> println(number)}
    P1().loop(numList, lambda2)

    var lambda3 = {s: Int -> println(s)}
    P2().addNums(2, 9, lambda3)


    val calc = {a: Int -> val multi = (a * 2)
        println(multi) }
    calc(10)

    val inputName = {
        print("Enter your name: ")
        val input = readLine()!!.toString()
        println("Hi! $input")
    }
    inputName()

    val playersData = arrayListOf<Player>(Player("Ali", 28, 181),
        Player("Hadi", 21, 169), Player("Sami", 14, 123),
        Player("Naji", 24, 168), Player("Mohammed", 19, 143),
        Player("Jameel", 29, 184), Player("Saud", 30, 191),
        Player("Zaki", 22, 132), Player("Nabil", 21, 163))

    val lambda4 = {a: ArrayList<Player> ->
        val list = a.sortedBy { it.age }
        var ages = 0
        var name =""
        var height =0

        for( i in list ){
            ages = i.age
            name = i.name
            height = i.height
            print("Name = $name ,Age =  $ages , Height= $height \n")
        }


    }

    fun listSort(list: ArrayList<Player>, action: (ArrayList<Player>) -> Unit){
        action(list)
    }

    listSort(playersData, lambda4)




}



