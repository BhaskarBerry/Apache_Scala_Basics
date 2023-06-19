package com.berry.training.scala.Arrays

/**
 * When we want to hold a number of elements of the same kind in a collection, we use an array.
 * An array is sequential and is of a fixed size.
 */
import Array._
object ArrayDemo extends App {

  //declare Scala Array
  // a. Adding Elements Later
  var a = new Array[Int](3)
  println(a.mkString(" "))
  a(2) = 90
  a(1) = 3 / 2
  //  a(4) = 12 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
  println(a.mkString(" "))

  //b. Define Scala Array with Values
  var b = Array(1, 2, 3, 4, 5, 6, 7)
  println(b.mkString(" "))

  // Process an Array -Since we know the type of elements and the size of the Scala array,
  // we can use loop control structures to process an array
  for (i <- b) {
    println(i)
  }

  // Sum
  println(b.sum)
  var total = 0

  for (i <- b) {
    total += i
  }
  println(total)

  // Highest value in an array
  println(b.max)

  var m = a(0)

  for (i <- b) {
    if (i > m) {
      m = i
    }
  }

  println("max", m)

  //Concatenating Arrays in Scala
  //We can append a Scala array to another using the concat() method. This takes the arrays as parameters- in order.
  var c = concat(a, b)
  println(c.mkString(" "))

  //Creating a Scala Array with Range
  //The range() method will give us integers from the start to the end.

  var r = range(2, 8)
  println(r.mkString(" "))

  val r1 = range(2, 8, 2)
  println(r1.mkString(" "))

  val r2 = range(18, 10, -2)
  println(r2.mkString(" "))

  //Multidimensional Arrays
  var x = ofDim[Int](4, 4)
  //  x.map(ll=>ll.mkString(" "))

  for (i <- 0 to 3) {
    for (j <- 0 to 3) {
      x(i)(j) = {
        i + j
      }
    }
  }
  for (i <- 0 to 3) {
    println(x(i).mkString(" "))
  }
}
