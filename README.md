# Unexpected Behavior with Implicit Type Conversion in Scala Generics

This example demonstrates a potential issue with implicit type conversion in Scala when using generics.  The `MyClass` class is designed to hold a value of type `T`. While it works fine with `Int` and `String`, unexpected behavior may arise with types that have implicit conversions, such as `Double`.