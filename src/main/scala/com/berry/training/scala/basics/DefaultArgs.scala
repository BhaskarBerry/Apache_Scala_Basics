package com.berry.training.scala.basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(10, 1)
  println(fact10)
  println(trFact(4))

  def savePicture(format: String = "jpg",
                  width: Int = 123,
                  height: Int = 215): Unit = println("Save pic")
  //savePicture(800,600)
  savePicture()
  savePicture(width = 800)

  /*
  1. pass in every leading argument
  2. name the argument
   */

  savePicture(height = 234, width = 654, format = "bmp") // SIDE EFfECT

}
