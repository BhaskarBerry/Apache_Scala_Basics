package com.berry.training.scala.basics

object stringOps extends App {
  val str: String = "Hello, I am learning scala"

  println(str.charAt(2))
  println(str.substring(7, 17))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "__"))
  println(str.toLowerCase())
  println(str.length)

  val anumString = "45"
  val aNUmber = anumString.toInt
  println('a' +: anumString :+ 'z') // prepending and appending operator are scala specific
  println(str.reverse)
  println(str.take(4))

  //Scala specific : String Interpolators

  // S- interpolators
  val name = "Berry"
  val age = 30
  val greet = s"Hello $name and $age"
  val greet1 = s"Hello $name and ${age + 1} years old"

  println(greet)
  println(greet1)

  //f-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  printf(myth)

  // raw -interpolator
  println(raw"This is \n new line ")

  val escaped = "This is \n new line "
  println(escaped)
}
