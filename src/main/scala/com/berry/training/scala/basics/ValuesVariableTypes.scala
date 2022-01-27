package com.berry.training.scala.basics

object ValuesVariableTypes extends App {
  val x = 43
  println(x)

  // x = 23
  // VAL are immutable
  // var are mutable
  // Compiler can infer types

  val aString: String = "Berry"
  val anotherString = "Hello"
  val aBoolean: Boolean = true
  val aChar: Char = 'q'
  val aInt: Int = x
  val aShort: Short = 4523
  val aLong: Long = 4566454575486458785L
  val aFloat: Float = 3.45f
  val aDouble: Double = 3.14

  //Variables
  var aVariable: Int = 5
  aVariable = 456 // Side Effects
}
