fun main(){
    println("Please input your name?")
    val inputName = readln()

    var firstCharactor = inputName[0]

    when (firstCharactor.toString()){
        in "a" .. "c" -> println("Hello you are in the A to C Range, your charactor is: $firstCharactor")
        in "d".. "f" -> println("Hello you are in the D to f Range, your charactor is: $firstCharactor")
        else -> println("You are in the range of the rest of the alphabet, your charactor is: $firstCharactor")
    }

    // to get the first charactor we could also have written it as
    // inputName[0]

}