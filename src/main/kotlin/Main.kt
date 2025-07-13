import `object`.ObjectMain

fun main(args: Array<String>) {
    println(
        """
            ===== Kotlin InterviewKit =====
            
            Choose a topic to run:
            1. Object Example
                        
        """.trimIndent()
    )
    println("Enter your choice: ")
    when (readln()) {
        "1" -> {
            println("--- Running Object Example ---")
            ObjectMain.run()
        }

        else -> println("Invalid choice. Please try again.")
    }

}

