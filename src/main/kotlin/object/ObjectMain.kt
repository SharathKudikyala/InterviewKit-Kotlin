package `object`

object ObjectMain {
    fun run() {
        ObjectEx.description()

        testSingletonUsingHashcode()
        testSingletonUsingInstantiationCounter()
    }

    private fun testSingletonUsingHashcode() {
        val obj1 = ObjectEx
        val obj2 = ObjectEx

        println("obj1 hashcode = ${obj1.hashCode()}")
        println("obj2 hashcode = ${obj2.hashCode()}")
        println("obj1 & obj2 are same = ${obj1 === obj2}") //Reference equality

    }

    private fun testSingletonUsingInstantiationCounter() {
        val obj = ObjectEx
        println("`object`.ObjectEx instantiated ${obj.instanceCount} time(s)")
    }
}
