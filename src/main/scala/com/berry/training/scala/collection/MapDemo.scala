package com.berry.training.scala.collection

object MapDemo extends App{

  // Declaring scala map
  var map: Map[String,Int]=Map()
  println(map)

  var test = Map("Berry" -> 1 , "Ayub" -> 2)
  test += ("Paa" -> 3)
  println(test)

  // Operations on Map
  println(test.keys)
  println(test("Ayub"))
  println(test.values)
  println(test.isEmpty)
  println(Map().isEmpty)

  // Concatenating Map -> ++ operator
  var m1 =  Map("Bose" -> 1 , "Md" -> 3)
  println(test++m1)
  println(m1++test)

  test.keys.foreach{i => println(i +" "+test(i))}

  //Searching for keys
  println(test.contains("Reddy"))
  println(test.contains("Paa"))

  //Method call on Map  ==> def ++(xs: Map[(A, B)]): Map[A, B]
  println(test.++(m1))
  println(m1.++(test))
}
