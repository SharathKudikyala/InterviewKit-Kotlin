fun main(args: Array<String>) {

    //region Singleton Object Usage
    ObjectEx.description()

    testSingletonUsingHashcode()
    testSingletonUsingInstantiationCounter()
    //endregion
}

fun testSingletonUsingHashcode() {
    val obj1 = ObjectEx
    val obj2 = ObjectEx

    println("obj1 hashcode = ${obj1.hashCode()}")
    println("obj2 hashcode = ${obj2.hashCode()}")
    println("obj1 & obj2 are same = ${obj1 === obj2}") //Reference equality

}

fun testSingletonUsingInstantiationCounter(){
    val obj = ObjectEx
    println("ObjectEx instantiated ${obj.instanceCount} time(s)")
}