object Counter extends App {
  val createCounter = () => {
    var count = 0

    () => {
      count += 1
      count
    }
  }

  val counter = createCounter()

  (1 to 10).foreach { _ =>
    println(counter())
  }
}
