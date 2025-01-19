```scala
class MyClass(val value: Int) {
  def compare(other: MyClass): Int = {
    try {
      if (this.value > other.value) 1
      else if (this.value < other.value) -1
      else 0
    } catch {
      case e: Exception => {
        println(s"Exception during comparison: "+ e.getMessage)
        0 // Or throw a more specific exception
      }
    }
  }
}
```