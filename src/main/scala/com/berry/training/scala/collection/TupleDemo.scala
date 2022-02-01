package com.berry.training.scala.collection

/**
 * A tuple is a Scala collection which can hold multiple values of same or different type together
 * so they can be passed around as a whole. Unlike an array or list, a tuple can hold objects
 * with different types but they are also immutable..
 *
 *  There is an upper limit of 22 for the element in the tuple in the scala, if you need more elements,
 *  then you can use a collection, not a tuple
 *
 *  1. Iterating over Tuple
 *  2. swapping of tuple element
 *  3. Converting tuple to string
 *
 **/
object TupleDemo extends App {

  val t = new Tuple2(1, "Berry")
  val shortForm = (2, "Ayub")
  val t3 = Tuple3(3, "Paris", "Companion")
  println(t, shortForm, t3)

  // Iteration over tuple using => Tuple.productIterator
  t.productIterator.foreach { i => println("Value : " + i) }
  t3.productIterator.foreach { x => println("Testing tuple3 :" + x) }

  // Swapping of Tuple Elements using => tuple.swap
  println(s"Before Swapping: $t")
  println(s"After Swapping: " + t.swap)

  // Convert tuple to string using => tuple.toString()
  println("Concatenated string : "+t.toString())

  // Equals Check
  println(t.canEqual(t3))
  println(2->"other way to create a tuple")

  //Operations on Tuple
  val sampleTuple = (4,3,2,1)
  val sum = sampleTuple._1 + sampleTuple._2 + sampleTuple._3 + sampleTuple._4
  println("Sum of Elements:" +sum)

}
