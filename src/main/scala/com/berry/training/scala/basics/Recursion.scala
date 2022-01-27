package com.berry.training.scala.basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println(
        "computing factorial of " + n + "-1 first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      //println("computer factorial of " + n)
      result
    }
  println(factorial(10))
  //println(factorial(10000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else
        factHelper(x - 1, x * accumulator) //TAIL RECURSION  == use recursive call as the Last expression

    factHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factHelper(10,1)
  ==factHelper(9, 10 *1)
  ==factHelper(8,9 * 10 * 1 )
  ==factHelper(7,8*9 * 10 * 1 )
  ==factHelper(6,7*8*9 * 10 * 1 )
  ----
  ==factHelper(1 *2*3*4*5*6*7*8*9 * 10 * 1 )
   */
  // println(anotherFactorial(10000))

  // when you need loops , use tail recursion

  /*
  1. concatenate a string n times
  2. IsPrime function tail recursive
  3. Fibonacci function , tail recursive
   */

  def anotheConactenate(a: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else anotheConactenate(a, n - 1, a + accumulator)
  }

  println(anotheConactenate("Berry", 10, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)

  }
  println(isPrime(2003))
  println(isPrime(623))
//  def aFibonacciFunction(a: Int): Int = {
//    //if (a == 1 || a == 2)  1
//    if (a <= 2) 1
//    else  aFibonacciFunction(a - 1) + aFibonacciFunction(a - 2)
//  }

  def anotherFibonacci(n: Int): Int = {
    def fibonacciTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fibonacciTailRec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fibonacciTailRec(2, 1, 1)
  }

  println(anotherFibonacci(8))

}
