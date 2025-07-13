package `object`

object ObjectEx {
    var instanceCount = 0

    init {
        println("ObjectEx class is initialised.")
        instanceCount++
    }

    fun description() {
        println(
            """
             
            'object' keyword is used to create a singleton in Kotlin.
            - This ensures only one instance is created.
            - It is globally accessible.
            - It is thread-safe by default.
            - `init` block runs only once.
            - Used `instanceCount` to confirm single instantiation.
            
        """.trimIndent()
        )
    }
}