package training.com.berry.basics

object CBNvCBV extends App {

  def callByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def callByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  callByName(System.nanoTime())
  callByValue(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def printfirst(x: Int, y: => Int) = println(x)

  //printfirst(infinite(), 34)

  printfirst(34, infinite())
}
