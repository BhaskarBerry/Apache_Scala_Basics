package com.berry.training.scala.exercise

import scala.collection.Seq

object Pyramid extends App {
  //  println("Enter the size of the Pyramid : ")
  ////  val a= scala.io.StdIn.readInt()
  //  println("The value of a is "+ a)

  val x = Range(1, 5, 1)
  println(x)

  val b = Seq(1 to 10)
  b.foreach { x => print(" ", x) }

  println(Seq(1 to 10).foreach { x => print(x) })


}
