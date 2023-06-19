package com.berry.training.scala.Arrays

object ArrayQA extends App {

  val sumEle = new SumOfArrayElements()
  println(s"The total of array : " +sumEle.sumElements(Array(1,2,3,4,5,6,7), 7))
  println(s"The total of array : " +sumEle.sumElements1(Array(1,2,3,4,5,6,7), 7))
}
