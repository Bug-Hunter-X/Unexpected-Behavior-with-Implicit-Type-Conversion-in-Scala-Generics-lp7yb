```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    myInt.printValue() // Output: 10

    val myString = new MyClass("Hello")
    myString.printValue() // Output: Hello

    // Explicit type specification avoids implicit conversion issues
    val myDouble = new MyClass[Double](3.14159)
    myDouble.printValue() // Output: 3.14159

    //Another example demonstrating a more complex case where implicit conversions can cause bugs
    implicit def stringToInt(s: String): Int = s.toInt
    val myString2 = new MyClass("123")
    myString2.printValue() //Prints 123

    //If you don't want the implicit conversion happening, use explicit typing
    val myString3: MyClass[String] = new MyClass("123")
    myString3.printValue() //Prints "123"
  }
}
```