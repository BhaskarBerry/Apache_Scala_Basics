package com.berry.training.scala.collection

/**
 * A list of Scala Collections is much like a Scala array.
 * Except that, it is immutable and represents a linked list.
 * An Array, on the other hand, is flat and mutable.
 */
object ListDemo extends App {

  // Array
  var a = Array(1, 2, 3, 5, 'a', 'A')
  a(2) = 100
  println("Value of a[1]", a(1))
  a.foreach { x => println(x) }

  // List
  var b = List(1, 2, 3, 5, 'a', 'A')
  println("List b :", b)
  println(b.head)
  println(b.tail)
  println(b.last)

  val listSample = List(1, 2, 3, 4, 5)
  println(listSample)
  println(listSample.mkString("-"))
  println(listSample.reduceLeft((next, cumm) => cumm + next))

  for (i <- listSample) print(i)

  val res = for (i <- listSample) yield i + 2

  val evenNum = for (i <- listSample; if (i % 2 == 0)) yield i
  println("\n" + evenNum)

  // Declaring List - While declaring a Scala list, we can also denote the type of elements it will hold. 
  // If it’ll hold more than one kind, we use ‘Any’. Here are few examples. 
  val a1: List[Int] = List(1, 2, 3, 43, 4, 2, 7, 6)
  val a2: List[Char] = List('a', 'b', 'c')
  val a3: List[String] = List("Bose", "Ayub")
  val a4: List[Nothing] = List()
  val a5: List[List[Int]] = List(a1, a1, List(10, 12, 11))
  println(a1, a2, "\n", a5)

  //Defining Scala List using :: and Nil
  //Think of Nil as an empty list, and :: as cons. If we had to define the above lists this way, we’d:

  val a6 = 1 :: (2 :: ("Bose" :: (true :: Nil)))
  val a7 = 1 :: 2 :: 3 :: Nil
  println(a6, a7)

  // Basic Operation in List
  //a. head - This returns the first element of a Scala list.
  println(a1.head)

  //b. tail - This returns the last element of a Scala list.
  println(a1.tail)

  //c. isEmpty - If the list is empty, this returns a Boolean true; otherwise, false.
  println(a1.isEmpty)

  //Concatenating Lists in Scala
  //a. The ::: Operator
  println(a1 ::: a2)
  //b. The List.:::() Method
  println(a1.:::(a2))
  //c. The List.concat() Method
  println(List.concat(a1, a2))

  // Creating Uniform Lists in Scala
  //The method List.fill() creates a list and fills it with zero or more copies of an element.
  val x = List.fill(6)(3)
  println(x)

  //Tabulating a Function
  //Using the List.tabulate() method with a function, we can tabulate a Scala list.
  // The first argument specifies the dimensions; the second describes the elements(computed from a function).

  val y = List.tabulate(6)(x => x + x)
  val y1 = List.tabulate(3, 2)(_ + _) // 3 -- List, 2 -- elements in the list
  println(y, "\n", y1)

  //Reversing a Scala List
  //This reverses the order of elements in a list using the List.reverse method.
  println("Before reverse : ", a1)
  println("After Reverse : ", a1.reverse)

  //Methods on a List in Scala

  //a. def +(elem: A): List[A] - This postpends an element to the Scala list.
  println(a1.+(190.toString))

  //b. def :::(prefix: List[A]): List[A] - This joins the List in the argument to the other List.
  println(a1.:::(a2))

  //c. def ::(x: A): List[A]- This adds an element to a List’s beginning.
  println(a1.::(0))

  //d. def addString(b: StringBuilder): StringBuilder
  //This appends all elements of a Scala list to a String Builder.
  println(a1.addString(new StringBuilder))

  //e. def addString(b: StringBuilder, sep: String): StringBuilder
  //This does the same thing, except with a separator between the elements.
  println(a1.addString(new StringBuilder, "---"))

  //f. def apply(n: Int): A
  //This selects an element in the Scala List by its index.
  println(a1.apply(2))

  //g. def contains(elem: Any): Boolean
  //If the list contains a certain element, this returns true; otherwise, false.
  println(a1.contains(2))

  //h. def copyToArray(xs: Array[A], start: Int, len: Int): Unit
  //This copies the elements of a List to an Array. Start decides where to write, and len decides the length of elements to copy.
  val arr = Array(0, 0, 0, 0, 0, 0, 0)
  //  a1.copyToArray(arr)
  a1.copyToArray(arr, 2, 3)
  println(arr.mkString(" "))

  //i. def distinct: List[A]-Distinct returns a new List without duplicates.
  val d = List(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 6)
  println(d.distinct)

  //j. def drop(n: Int): List[A]
  //This returns all elements except the first n.
  println(d.drop(2))

  //k. def dropRight(n: Int): List[A]
  //This returns all elements except the last n.
  println(d.dropRight(2))

  //l. def dropWhile(p: (A) => Boolean): List[A]
  //This drops the longest prefix of elements that satisfy the predicate.
  println(d.dropWhile(n => (n % 2 != 0)))

  //m. def equals(that: Any): Boolean
  //This compares two sequences.
  println(d.equals(a1))
  println(d.exists(x => x > 2))
  println(d.filter(x => x > 2))

  //p. def forall (p: (a) => Boolean) : Boolean
  //This returns true if the predicate holds true for all values in the List.
  println(d.forall(x => x > 2))

  //q. def indexOf(elem: A, from: Int): Int
  //This returns the index of the first occurrence of the element in the List.
  println(a1.indexOf(323)) // -1 if value is not present else first occurance index

  //r. def init: List[A]
  //This returns all elements except the last.
  println(d.init)

  //  s. def iterator: Iterator[A]
  //This creates an iterator over the Scala List.
  println(d.iterator)

  //t. def lastIndexOf(elem: A, end: Int): Int
  //This returns the index of the last occurrence of an element, before or at given index.
  println(d, "\n", d.lastIndexOf(2, 14))

  //u. def length: Int
  //This returns a List’s length.
  println(d.length)

  //v. def map[B](f: (A) => B): List[B]
  //This applies the function to every element in the list.
  println(d.map(x => (x + x)))

  //w. def max: A
  //This returns the highest element.
  println(d.max)
  //x. def min: A
  //This returns the lowest element.
  println(d.min)

  //y. def mkString: String
  //This displays all elements of a list in a String.
  //def mkString(sep: String): String
  println(d.mkString(" "))

  //aa. def reverse: List[A]
  //This reverses a List of Scala Collections.
  println(d.reverse)

  //ab. def sum: A
  //This returns the sum of all elements.
  println(d.sum)

  //ac. def take(n: Int): List[A]
  //This returns the first n elements.
  println(d.take(4))

  //ad. def takeRight(n: Int): List[A]
  //This returns the last n elements.
  println(d.takeRight(3))

  //ae. def toArray: Array[A]
  //This returns an Array from a List.
  println(d.toArray)

  //af. def toBuffer[B >: A]: Buffer[B]
  //This returns a Buffer from a Scala List.
  println(d.toBuffer)

  //ag. def toSeq: Seq[A]
  //This returns a Seq from a List.
  println(d.toSeq)

  //ah. def toSet[B >: A]: Set[B]
  //This returns a Set from a List.
  println(d.toSet)

  //ai. def toString(): String
  //This returns a String from a List.
  println(d.toString)
}

