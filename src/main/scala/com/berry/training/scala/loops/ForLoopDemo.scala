package com.berry.training.scala.loops

/**
 * Syntax:
 * for (var x <- Range){  stmt(s)  }
 *
 * The arrow pointing leftward is a generator; it generates individual values from a range. Range is a range of numbers;
 * we may use a list for this. We can also represent this as i to j, or as i until j.
 *
 * A loop lets us execute a group of statement a set number of times, or until an expression becomes false.
 *
 * Four types of scala for loops
    a. i to j
    b. i until j
    c. Multiple Ranges in scala : there will 2 * 3 * 3 = 18 combination value
    d. Using Collection
    e. Using filters
    f. using yield in loop
 * */

object ForLoopDemo extends App {
  // four types of scala for loops
  // a. i to j
  for (a <- 1 to 5) {
    println(a)
  }

  // b. i until j
  for (a <- 100 until 104) {
    println(a)
  }

  // c. Multiple Ranges in scala : there will 2 * 3 * 3 = 18 combination value
  for (a <- 1 until 3; b <- 10 to 12; c <- 100 to 102) {
    println("----------")
    println(a)
    println(b)
    println(c)
  }

  //d. Using Collection
  var a = 0
  val odds = List(1, 3, 5, 7, 9)
  for (a <- odds) {
    println(a)
  }

  //e. Using filters
  println("Using Filters")
  val numbs = List(1, 3, 5, 7, 9, 2, 4, 6, 8, 90, 12, 34)
  for (a <- numbs if a % 2 == 0; if a > 3) {
    println(a)
  }

  //f. using yield in loop
  println("Using yields")
  val res = for (a <- numbs if a % 2 == 0; if a > 3)  yield a + 10
  for(a <- res)
  {
    println(a)
  }
}
