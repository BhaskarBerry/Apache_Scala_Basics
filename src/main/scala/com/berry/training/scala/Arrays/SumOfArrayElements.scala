package com.berry.training.scala.Arrays

/**
 * Given an integer array arr of size n, you need to sum the elements of arr.
 *
 * Example 1:
 * Input:
 * n = 3
 * arr[] = {3 2 1}
 * Output: 6
 * Example 2:
 *
 * Input:
 * n = 4
 * arr[] = {1 2 3 4}
 * Output: 10
 */

class SumOfArrayElements {

  def sumElements(arr: Array[Int], n: Int): Int = {
    var total = 0

    for (i <- arr) {
      total += i
    }
    total
  }

  def sumElements1(arr: Array[Int], n: Int): Int = {
    var total = 0
    var x = n
    while(x > 0) {
      total += arr(x-1)
      x = x-1
    }
    total
  }

}
