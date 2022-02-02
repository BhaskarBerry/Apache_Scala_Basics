package com.berry.training.scala.Collection

/**
 * A Map in Scala is a collection of key-value pairs, and is also called a hash table. We can use a key to access a value.
 * These keys are unique; however, the values may be common. The default Scala Map is immutable. To use a mutable Map,
 * we use the scala.collection.mutable.Map class.
 */

import scala.collection.mutable

object MapDemo extends App {

  //a. Declaring scala map
  var map: Map[String, Int] = Map()
  println(map)

  //b. Declaring a Scala Map with Values
  var test = Map("Berry" -> 1, "Ayub" -> 2)
  test += ("Paa" -> 3)
  println(test)

  // Basic Operations on Map
  //a. keys -This returns an iterable with each key in the Map.
  println("Keys : ", test.keys)
  println(test("Ayub"))

  //b. values - This returns an iterable with each value in the Scala Map.
  println(test.values)

  //c. isEmpty - If the Map is empty, this returns true; otherwise, false.
  println(test.isEmpty)
  println(Map().isEmpty)

  // Concatenating Map -> ++ operator
  var m1 = Map("Bose" -> 1, "Md" -> 3)
  println(test ++ m1)
  println(m1 ++ test)

  test.keys.foreach { i => println(i + " " + test(i)) }

  //Searching for keys
  println(test.contains("Reddy"))
  println(test.contains("Paa"))

  //Method call on Map  ==> def ++(xs: Map[(A, B)]): Map[A, B]
  println(test.++(m1))
  println(m1.++(test))
  //Printing Keys and Values from a Map
  m1.keys.foreach { i => println(i + " " + m1(i)) }

  //Searching for a Key in a Scala Map - The Map.contains() method will tell us if a certain key exists in the Map.
  println(m1.contains("Md"), m1.contains("Ram"))

  //Methods to Call on a Scala Map
  //a. def ++(xs: Map[(A, B)]): Map[A, B] - This concatenates two Maps.
  println(test.++(m1))

  //b. def -(elem1: A, elem2: A, elems: A*): Map[A, B]
  //This returns a new Map eliding the pairs for the keys mentioned in the arguments.
  println(m1.-("Md"))

  //c. def get(key: A): Option[B]
  //This returns the value associated with the key; it returns this as an Option.
  println(m1.get("Md"), m1.get("Berry"))

  //d. def iterator: Iterator[(A, B)]
  //This returns an iterator over the Scala Map.
  println(m1.iterator)

  //e. def addString(b: StringBuilder): StringBuilder - This appends all elements of the Map to the String Builder.
  println(m1.addString(new StringBuilder()))

  //f. def addString(b: StringBuilder, sep: String): StringBuilder -- same except it introduces a separator between the pairs.
  println(m1.addString(new StringBuilder(), "*"))

  //g. def apply(key: A): B
  //This searches for a key in the Scala Map.
  println(m1.apply("Md"))

  //  println( m1.apply("B")) //l.NoSuchElementException: key not found: B

  //h. def clear(): Unit - This actually removes all bindings from the Map in Scala.
  var sampleMap = mutable.Map("One" -> 1, "Two" -> 2, "Three" -> 3)
  val sample = Map("One" -> 1, "Two" -> 2, "Three" -> 3)
  println(sampleMap)
  //  println(sampleMap.clear())
  //  println(sample.clear())-- value clear is not a member of scala.collection.immutable.Map[String,Int]
  //i. def clone(): Map[A, B]
  //This creates a clone/copy of the receiver object.We can’t clone an immutable Map in Scala. So, let’s revive m2.
  println(sampleMap.clone())

  //j. def contains(key: A): Boolean
  //If the Map contains this key, this returns true; otherwise, false.
  println(sampleMap.contains("One"))

  //k. def copyToArray(xs: Array[(A, B)]): Unit
  //This fills key-value pairs from the Map into an Array.
  var a: Array[Any] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  sample.copyToArray(a)
  println(a.mkString(","))

  //l. def count(p: ((A, B)) => Boolean): Int
  //This returns the number of key-value pairs in the Scala Map that satisfy the given predicate.
  println(sampleMap.count(p => (p._2 > 2)))

  //m. def drop(n: Int): Map[A, B]
  //This returns all elements except the first n.
  println(sampleMap.drop(1))
  //n. def dropRight(n: Int): Map[A, B]
  //This returns all elements except the last n.
  println(sampleMap.dropRight(1))

  //o. def dropWhile(p: ((A, B)) => Boolean): Map[A, B]
  //This drops pairs until the predicate becomes false for a pair.
  println(sampleMap.dropWhile(p => (p._2 < 2)))

  //p. def empty: Map[A, B]
  //This returns an empty Map of the same kind.
  println(sampleMap.empty)

  //q. def equals(that: Any): Boolean
  //This returns true if both Maps contain the same key-value pairs; otherwise, false.
  println(sampleMap.equals(m1))

  //r. def exists(p: ((A, B)) => Boolean): Boolean
  //If the predicate holds true for some elements of the  Scala Map, this returns true; otherwise, false.
  //
  //s. def filter(p: ((A, B))=> Boolean): Map[A, B]
  //This returns all such elements (see above).
  //
  //t. def filterKeys(p: (A) => Boolean): Map[A, B]
  //This returns all pairs where the key satisfies the predicate.
  //
  //u. def find(p: ((A, B)) => Boolean): Option[(A, B)]
  //This returns the first element that satisfies the predicate.
  //
  //v. def foreach(f: ((A, B)) => Unit): Unit
  //This applies the function to all elements of the Scala Map.
  //
  //w. def init: Map[A, B]
  //This returns all elements except the last.
  println(sampleMap.init)

  //x. def isEmpty: Boolean
  //If the Map is empty, this returns true; otherwise, false.
  println(sampleMap.isEmpty)

  //y. def keys: Iterable[A]
  //This returns an iterator over all keys in the Map.
  println(sampleMap.keys)

  //z. def last: (A, B)
  //This returns the last element from the Map in Scala.
  println(sampleMap.last)

  //aa. def max: (A, B)
  //This returns the largest element.
  println(sampleMap.max)

  //ab. def min: (A, B)
  //This returns the smallest element.
  println(sampleMap.min)

  //ac. def mkString: String
  //This represents the elements of the Map as a String.
  println(sampleMap.mkString(" "))

  //ad. def product: (A, B)
  //This returns the product of all elements of the Scala Map.
  //
  //ae. def remove(key: A): Option[B]
  //This removes a key from the Map and returns the value. Let’s take a new Map for this.

  println(sampleMap.remove("Three"))

  //af. def retain(p: (A, B) => Boolean): Map.this.type
  //This retains, in the Map, only the pairs that satisfy the predicate.

  //ag. def size: Int
  //This returns the number of elements in the Map.
  println(sampleMap.size)

  //ah. def sum: (A, B) -  This returns the sum of all elements in the Map in Scala
  //  println(sampleMap.sum(sampleMap["One"]))
  //ai. def tail: Map[A, B]
  //This returns all elements except the first.
  println(sampleMap.tail)

  //aj. def take(n: Int): Map[A, B]
  //This returns the first n elements from the Map in Scala.
  println(sampleMap.take(6))

  //ak. def takeRight(n: Int): Map[A, B]
  //This returns the last n elements.
  println(sampleMap.takeRight(2))

  //al. def takeWhile(p: ((A, B)) => Boolean): Map[A, B]
  //This returns elements from the Map as long as the predicate is satisfied.
  //
  //am. def toArray: Array[(A, B)]
  //This returns an Array from the Map.

  println(sampleMap.toArray)

  //an. def toList: List[A]
  //This returns a List from the Map.
  println(sampleMap.toList)

  //ao. def toSeq: Seq[A]
  //This returns a Sequence from the Scala Map.
  println(sampleMap.toSeq)

  //ap. def toSet: Set[A]
  //This returns a Set from the Map.
  println(sampleMap.toSet)

  //aq. def toString(): String
  //This returns a String from the Map.
  println(sampleMap.toString)
}
