package com.berry.training.scala.loops

/**
* Syntax:
 * for (var x <- Range){  stmt(s)  }
* */

object ForLoopDemo extends App {
  for (a <- 1 to 10){
    println(a)
  }

  for(a <- 100 until 110){
    println(a)
  }
}
