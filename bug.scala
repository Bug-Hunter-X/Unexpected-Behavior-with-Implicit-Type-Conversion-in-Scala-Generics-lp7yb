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

    // Implicit type conversion can lead to unexpected results
    val myDouble = new MyClass(3.14159)
    myDouble.printValue()
  }
}
```