fun main() {

    var userResponse = 0

    println("Welcome to Burgerz!")
    //Adding a menu to direct the user

    do {
        println("1) Home")
        println("2) Food")
        println("3) Order")
        println("4) Jobs")
        println("5) Account")
        println("6) Exit")

        println("Enter Number Choice: ")
        userResponse = readln().toInt()

        if(userResponse !in 1..6)
        {
            println("User input not valid. Please enter a number from 1-6.")
            continue
        }

        if(userResponse == 1)
        {
            println("Your favorite burgers shop in town!")
        }
        if(userResponse == 2)
        {
            println("Burger\n" +
                    "Cheeseburger\n" +
                    "Bacon Burger\n" +
                    "Fries\n" +
                    "Milkshake\n")
        }
        if(userResponse == 3)
        {
            println("Ready to order?")
        }
        if(userResponse == 4)
        {
            println("Burgerz is hiring!!")
        }
        if(userResponse == 5)
        {
            println("Become a part of our Burgerz reward program and get free burger points!")
        }

        if(userResponse != 6) {
            println("Press 0 to return to the menu and 6 to exit.")
            userResponse = readln().toInt()
        }
    } while (userResponse != 6)
}