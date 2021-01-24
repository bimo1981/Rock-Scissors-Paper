fun main() {

    val options: Array<String> = arrayOf("Scissors", "Rock", "Paper")

    val userChoice = getUserChoice(options)
    val gameChoice = getGameChoice(options)
    val result = result(userChoice, gameChoice)

}

fun getUserChoice (optionParam: Array<String>): String {
    //Initialization
    var isValid = false;
    var userChoice = ""
    // While get correctly answer
    while (!isValid) {

        for (item in optionParam) print(" (${item}) ");
        println("- You must choice one of them.. ");
        val userInput = readLine();
        if (userInput != null && userInput in optionParam) {
            userChoice = userInput;
            isValid = true;
        }
        if(!isValid) println("Please enter a valid..")
    }
    return userChoice
}
fun getGameChoice (optionParam: Array<String>): String {
    val x = optionParam[(Math.random() * optionParam.size).toInt()]
    return x
}

fun result (userChoice: String, gameChoice: String) {
    val result: String

    if(userChoice == gameChoice) result = "Draw!"
    else if ((userChoice == "Scissors" && gameChoice == "Paper") ||
            (userChoice == "Rock" && gameChoice == "Scissors")   ||
            (userChoice == "Paper" && gameChoice == "Rock")) result = "User - Win!"
    else result = "You lose!"

    println("User choice: ${userChoice}, Computer chose: ${gameChoice}, Result: ${result}")
}