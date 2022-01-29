package com.berry.training.scala.Closures

/**
 * A function whose return value depends on variable(s) declared outside it, is a closure. This is much like that in Python.
 * In our example, ‘a’ and ‘b’ are formal parameters to the function sum1. ‘c’, however, is a reference to a variable
 * in the enclosing scope. Scala closes over ‘c’ here.
    1. We can pass around the code block as a value
    2. At any time, anyone with the value can execute the code block
    3. It can refer to variables from the context we created it in
 */

import scala.collection.mutable.ArrayBuffer


object ClosuresDemo extends App{
  // Anonymous functions
  val sum = (a: Int, b:Float) => a+ b
  println(sum(2,4))

  //Here, the function ‘sum1’ refers to the variable/value ‘c’, which isn’t a formal parameter to it.
  //while‘sum’ is trivially closed over itself, ‘sum1’ refers to ‘c’ every time we call it, and reads its current value.
  val c = 13
  val sum1 = (a:Int, b:Float) => (a+b)* c
  println(sum1(2,7))

  // Second Example:
  val age = 30
  val sayHello = (name: String) => println(s"I am $name and My age is $age")
  sayHello("Berry")

  // Third Example
  //let’s take another function func that takes two arguments: a function and a string,
  // and calls that function on that string. Did we mention that Scala supports higher-order functions?
  def sampleFun(f:String => Unit, s:String){
    f(s)
  }
  sampleFun(sayHello,"Bose")

  // Integer Arrays
  val nums = Array(1,2,3,4,6)
  val sayNumber = (a: Int) => println(s"The number is $a")
  for (i <- 0 to 4){
    sayNumber(i)
  }

  // Array Buffer
  val areas = ArrayBuffer("Bangalore", "Hyd", "Vijayawada")

  val func = (f:String=> Unit, s: String)=>f(s)
  for(i <- 0 to 2){
    func(sayHello, areas(i))
  }
  
}
