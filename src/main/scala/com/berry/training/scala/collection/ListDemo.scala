package com.berry.training.scala.collection

/**
 * A list of Scala Collections is much like a Scala array.
 * Except that, it is immutable and represents a linked list.
 * An Array, on the other hand, is flat and mutable.
 */
object ListDemo extends App {

  // Array
  var a = Array(1, 2, 3, 5, 'a', 'A')
  a(2) = 100
  println("Value of a[1]", a(1))
  a.foreach { x => println(x) }

  // List
  var b = List(1, 2, 3, 5, 'a', 'A')
  println("List b :", b)
  println(b.head)
  println(b.tail)
  println(b.last)

  val listSample = List(1, 2, 3, 4, 5)
  println(listSample)
  println(listSample.mkString("-"))
  println(listSample.reduceLeft((next, cumm) => cumm + next))

  for (i <- listSample)print(i)

  val res =  for (i <- listSample) yield i+2

 val evenNum = for (i <- listSample ; if (i % 2 == 0)) yield i
  println("\n"+evenNum)
}
