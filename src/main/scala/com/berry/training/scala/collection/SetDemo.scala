package com.berry.training.scala.collection

/**
 * Sets in Scala Collections
 * A Scala Set is a collection that won’t take duplicates. By default, Scala uses immutable sets.
 * But if you want, you can import the scala.collection.mutable.Set class. To be able to refer to both of these in the
 * same collection, we can refer to the immutable set as Set and the mutable set as mutable.Set.
 */

object SetDemo extends App {

  // Declaring sets in Scala
  //a. Declaring an Empty Set : include the type annotation when declaring an empty set,
  // so it can be decided what concrete type to assign to a variable.
  var s:Set[Int] = Set()

  //b. Declaring a Set with Values
  var s1 = Set(1,2,3,4,4,5)
  val s2 = Set(9,8,6, 5,4)
  println(s1, s2) //Set(5, 1, 2, 3, 4)

  //Operation on scala sets:
  //a. head - This will return the first element of a Scala set.
  println(s1.head)

  //b. tail - This will return all elements of a set except the first.
  println(s1.tail)

  //c. isEmpty - If the set is empty, this will return a Boolean true; otherwise, false.
  println(s1.isEmpty)

  // 2 ways for Concatenating Scala sets
  //a. The ++ Operator
  println(s1++s2)
  println(s2++s1)

  //b. The Set.++() Method - We can call the ++() method to either set and pass the other to it.
  println(s2.++(s1))
  println(s1.++(s2))

  // Max and Min in a set
  println(s1.max)
  println(s1.min)

  // Common values in two sets
  //a. The Set.&() Method



}
