```scala
class MyClass(val value: Int) {
  def compare(other: MyClass): Int = {
    if (this.value > other.value) 1
    else if (this.value < other.value) -1
    else 0
  }
}
```