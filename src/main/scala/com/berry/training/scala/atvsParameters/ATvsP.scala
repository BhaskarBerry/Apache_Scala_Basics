package com.berry.training.scala.atvsParameters

/**
 * A class/trait with an abstract type is quite similar to a class/trait type parameter. 
C1 and C2 - Both implementations have similar properties. However they are NOT the same. 
At first I thought that I could used them inter-changeably. However, consider the following examples:

 */

trait C1[A] {
  def get: A
  def doIt(a:A):A
}

trait C2 {
  type A
  def get: A
  def doIt(a: A): A
}

object ATvsP extends App{
  
  def p(c:C1[Int]) = c.doIt(c.get) // compiles
  def p2(c1:C2) = c1.doIt(c1.get) // compiles


}
