package com.berry.training.scala.collection

/**
 * Sets in Scala Collections
 * A Scala Set is a collection that won’t take duplicates. By default, Scala uses immutable sets.
 * But if you want, you can import the scala.collection.mutable.Set class. To be able to refer to both of these in the
 * same collection, we can refer to the immutable set as Set and the mutable set as mutable.Set.
 */

object SetDemo extends App {

  // Declaring sets in Scala
  //a. Declaring an Empty Set : include the type annotation when declaring an empty set,
  // so it can be decided what concrete type to assign to a variable.
  var s: Set[Int] = Set()

  //b. Declaring a Set with Values
  var s1 = Set(1, 2, 3, 4, 4)
  val s2 = Set(9, 8, 6, 5, 4)
  println(s1, s2) //Set(5, 1, 2, 3, 4)

  //Operation on scala sets:
  //a. head - This will return the first element of a Scala set.
  println(s1.head)

  //b. tail - This will return all elements of a set except the first.
  println(s1.tail)

  //c. isEmpty - If the set is empty, this will return a Boolean true; otherwise, false.
  println(s1.isEmpty)

  // 2 ways for Concatenating Scala sets
  //a. The ++ Operator
  println(s1 ++ s2)
  println(s2 ++ s1)

  //b. The Set.++() Method - We can call the ++() method to either set and pass the other to it.
  println(s2.++(s1))
  println(s1.++(s2))

  // Max and Min in a set
  println(s1.max)
  println(s1.min)

  // Common values in two sets
  //a. The Set.&() Method
  println(s1.&(s2))

  //b. Set.intersect() Method
  println(s1.intersect(s2))

  //Methods to call on Sets
  //a. def +(elem: A): Set[A] - This adds an element to the set and returns it. (But doesn’t modify the original set)
  println(s1.+("Bose"))

  //b. def -(elem: A): Set[A] -This removes the element from the set and then returns it.
  // Note that this takes an Int instead of a string for our set of Ints.

  println(s1.-(2))

  //c. def contains(elem: A): Boolean
  //If the set contains that element, this returns true; otherwise, false.

  println(s1.contains(3), s1.contains(9))

  //d. def &(that: Set[A]): Set[A] - This returns an intersection of two sets
  println(s1.&(s2))
  //e. def &~(that: Set[A]): Set[A] - &~ stands for set difference.

  println(s1.&~(s2))
  println(s2.&~(s1))

  //f. def +(elem1: A, elem2: A, elems: A*): Set[A]
  //This adds multiple elements to a Scala set and returns it.
  println(s1.+(6, 8, 9, 7))

  //g. def ++(elems: A): Set[A]
  //This concatenates a set with another collection.
  println(s1 ++ s2)
  println(s1.++(List("A", "b", "C")))

  //h. def -(elem1: A, elem2: A, elems: A*): Set[A]
  //This removes, each element mentioned from the set.
  println(s1.-(1, 2, 3))

  //i. def addString(b: StringBuilder): StringBuilder
  //This adds all elements of the set to the String Builder.
  println(s1.addString(new StringBuilder()))

  //j. def addString(b: StringBuilder, sep: String): StringBuilder
  //This uses a separator to the above functionality.
  println(s1.addString(new StringBuilder(), "~"))

  //k. def apply(elem: A)
  //This checks whether the element is part of the set
  println(s1.apply(1), s1.apply(22))

  //l. def count(p: (A) => Boolean): Int
  //This returns the count of elements that satisfy the predicate.

  println(s1.count(x => { x % 2 != 0 }))

  //m. def copyToArray(xs: Array[A], start: Int, len: Int): Unit
  //These copies len elements from the set to the Array xs, starting at position start.
  var c = Array(0, 0, 0, 0, 0, 0, 0)
  println(s1.copyToArray(c, 3, 2))
  println(c.mkString(","))

  //n. def diff(that: Set[A]): Set[A]
  //This returns the set difference(elements existing in one set, but not in another) 
  println(s1.diff(s2))

  //o. def drop(n: Int): Set[A]]
  //This returns all elements except the first n
  println(s1.drop(2))

  //p. def dropRight(n: Int): Set[A]
  //This Scala set returns all elements except the last n.
  println(s1.dropRight(2))

  //q. def dropWhile(p: (A) => Boolean): Set[A]
  //This drops elements until the first element that does n’t satisfy the predicate.
  println(s1.dropWhile(x => x < 3))
  println(s1.dropWhile(x => (x % 2 != 0)))

  //r. def equals(that: Any): Boolean
  //This set in Scala compares the set to another sequence.
  println(s1.equals(s2))
  val s3 = s1
  println(s1.equals(s3))

  //s. def exists(p: (A) => Boolean): Boolean
  //If the predicate holds true for some elements in the set, this returns true; otherwise, false.
  println(s1.exists(x => (x % 2 == 0)))

  //t. def filter(p: (A) => Boolean): Set[A]
  //This filters such elements (see the previous method)
  println(s1.filter(x => (x > 3)))

  //u. def find(p: (A) => Boolean): Option[A]
  //This Scala set returns the first element that satisfies the predicate.
  println(s1.find(x => (x % 2 == 0)))

  //v. def forall(p: (A) => Boolean): Boolean
  //This returns true if all elements of the set satisfy the predicate; otherwise, false.
  println(s1.forall(x => (x % 2 == 0)))

  //w. def head: A
  //This Scala Set returns the first element from the set.
  println(s1.head)

  //x. def init: Set[A]
  //This returns all elements from the set, except the last.
  println(s1.init)

  //y. def intersect(that: Set[A]): Set[A]
  //This returns the intersection of two sets(elements common to both).
  println(s1.intersect(s2))

  //z. def isEmpty: Boolean
  //This set in Scala returns true if the set is empty; otherwise, false.
  println(s1.isEmpty)

  //aa. def iterator: Iterator[A]
  //This creates a new iterator over the set.
  println(s1.iterator)

  //ab. def last: A
  //This returns the last element from a set.
  println(s1.last)

  //ac. def map[B](f: (A) => B): immutable.Set[B]
  //This Scala Set applies the function to all elements of the set and returns it.
  println(s1.map(a => (a * a)))

  //ad. def max: A
  //This returns the highest value from the set.
  println(s1.max)

  //ae. def min: A
  //This returns the lowest element.
  println(s1.min)

  //af. def mkString: String
  //This Scala set represents all elements of the set as a String.
  println(s1.mkString(" "))

  //ah. def product: A
  //This returns the algebraic product of all elements in the set.
  println(s1.product)

  //ai. def size: Int
  //This returns the size of the set.
  println(s1.size)

  //aj. def splitAt(n: Int): (Set[A], Set[A])
  //This splits the set at the given index and returns the two resulting subsets.
  println(s1.splitAt(3))

  //ak. def subsetOf(that: Set[A]): Boolean
  //If the set passed as argument is a subset of this set, this returns true; else, false.
  println(Set(3, 4).subsetOf(s1))

  //al. def sum: A
  //This returns the sum of all elements of the set.
  println(s1.sum)

  //am. def tail: Set[A]
  //This returns all elements of the set except the first.
  println(s1.tail)

  //an. def take(n: Int): Set[A]
  //This Scala set returns the first n elements from the set.
  println(s1.take(3))

  //ao. def takeRight(n: Int):Set[A]
  //This returns the last n elements.
  println(s1.takeRight(2))

  //ap. def toArray: Array[A]
  //This returns an Array holding elements from the set.
  println(s1.toArray)

  //aq. def toList: List[A]
  //This returns a List from elements of the set.
  println(s1.toList)

  //ar. def toSeq: Seq[A]
  //This returns a sequence from the set.
  println(s1.toSeq)

  //as. def toString(): String
  //This represents the elements of the set as a String.
  println(s1.toString)

}