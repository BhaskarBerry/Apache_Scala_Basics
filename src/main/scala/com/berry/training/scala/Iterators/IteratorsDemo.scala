package com.berry.training.scala.Iterators

/**
 * Two important methods in Scala Iterator are next() and hasNext.
 * hasNext will tell if there is another element to return, while next() will return that element.
 *
 */

object IteratorsDemo extends App {

  // Declare a Iterator
  val a = Iterator(3, 4, 5, 6, 7)

  // Accessing values in Iterator
  while (a.hasNext) {
    println(a.next())
  }

  //Determining Largest and Smallest Elements
  //We can use it.min and it.max to determine the largest and smallest elements in a Scala iterator.

  //a. min - This will return the smallest value in the Scala iterator.
  val b = Iterator(3, 4, 5, 6, 7)
  println("min : " + b.min)

  //b. max
  //This Scala Iterator will return the largest value in the iterator.
  // we need to declare iterator again
  val c = Iterator(3, 4, 5, 6, 7)
  println("max : " + c.max)
  println(c.hasNext, c.size)
  //Scala Iterator Length - size and length
  val d = Iterator(3, 4, 5, 6, 7)
  println(d.size)
  println(d.length)
  val d1 = Iterator(3, 4, 5, 6, 7)
  println(d1.length)

  //Methods to Call on an Iterator in Scala

  //a. def hasNext: Boolean
  //If the Scala iterator has another element to return, this returns true; otherwise, false.
  println(d1.hasNext)

  //b. def next(): A
  //Now, this returns the next element from the iterator.
  val q = Iterator(3, 4, 5, 6, 7)
  println(q.next())
  println(q.next())

  //c. def ++(that: => Iterator[A]): Iterator[A]
  //This concatenates two Scala iterators.
  val w = Iterator(3, 4).++(Iterator(5, 6))
  while (w.hasNext) println(w.next())

  //d. def addString(b: StringBuilder): StringBuilder
  //This appends the elements of the Scala iterator to a String Builder and returns it.
  val r = Iterator(3, 4)
  println(r.addString(new StringBuilder()))

  //e. def addString(b: StringBuilder, sep: String): StringBuilder
  //This lets us include a separator for the above functionality.
  val r1 = Iterator(3, 4, 8)
  println(r1.addString(new StringBuilder(), " "))

  //f. def buffered: BufferedIterator[A]
  //This returns a buffered iterator from the iterator.
  val r2 = Iterator(3, 4, 8)
  println(r2.buffered)

  //g. def contains(elem: Any): Boolean
  //If the Scala iterator contains element elem, this returns true; otherwise, false.
  println(r2.contains(4))

  //h. def copyToArray(xs: Array[A], start: Int, len: Int): Unit
  //This copies the elements of the array, beginning at index start, and for length len, into an Array.
  val t = Iterator(3, 4, 1, 1, 2, 3, 8).toArray
  var arr: Array[Int] = Array(0, 0, 0, 0, 0, 0)
  //  println(t.copyToArray(a,3,5))
  //i. def count(p: (A) => Boolean): Int
  //This counts the number of elements that satisfy a predicate and returns this count.
  val r4 = Iterator(3, 4, 8)

  println(r4.count(x => (x > 2)))

  //j. def drop(n: Int): Iterator[A]
  //This moves the iterator n places ahead. If n is greater than the iterator’s length, this simply exhausts it.
  var t1 = Iterator(3, 4, 1, 1, 2, 3, 8)
  println(t1 = t1.drop(2))
  println(t1.next())

  //k. def dropWhile(p: (A) => Boolean): Iterator[A]
  //This keeps advancing the iterator as long as the predicate is satisfied.
  var t2 = Iterator(3, 4, 1, 1, 2, 3, 8)
  t2 = t2.dropWhile(x => (x > 3))
  println(t2.next)

  //l. def duplicate: (Iterator[A], Iterator[A])
  //This creates a duplicate of the iterator that will iterate over the same sequence of values.
  val t3 = Iterator(3, 4, 1, 1, 2, 3, 8)
  val t4 = t3.duplicate
  //m. def exists(p: (A) => Boolean): Boolean
  //If the predicate holds true for some values in the iterator, this returns true; otherwise, false.
  val t5 = Iterator(3, 4, 1, 1, 2, 3, 8)
  t5.exists(x => (x % 3 == 0))

  //n. def filter(p: (A) => Boolean): Iterator[A]
  val t6 = Iterator(3, 4, 1, 1, 2, 3, 8)
  t5.filter(x => (x % 3 == 0))

  //o. def filterNot(p: (A) => Boolean): Iterator[A]
  //Parallely, this will create a new iterator with only those elements that do not satisfy the predicate.
  val t7 = Iterator(3, 4, 1, 1, 2, 3, 8)
  t7.filterNot(x => (x % 3 == 0))

  //p. def find(p: (A) => Boolean): Option[A]
  //This returns the first value, if any, that satisfies the predicate.
  val y = Iterator(3, 4, 1, 1, 2, 3, 8)
  println(y.find(x => (x % 3 == 0)))

  //q. def forall(p: (A) => Boolean): Boolean
  //If the predicate holds true for all values in the Scala iterator, this returns true; otherwise, false.
  val y1 = Iterator(3, 4, 1, 1, 2, 3, 8)
  println(y1.forall(x => (x % 3 == 0)))

  //r. def hasDefiniteSize: Boolean
  //If the iterator is empty, this returns true; otherwise, false.
  y1.hasDefiniteSize
  //s. def indexOf(elem: B): Int
  //This returns the index of the first occurrence of the element elem in the Scala iterator.
  val y2 = Iterator(3, 4, 1, 1, 2, 3, 8)
  println(y2.indexOf(4))
  //t. def indexWhere(p: (A) => Boolean): Int
  //This returns the index of the first value that satisfies the predicate. If there’s none, it returns -1.
  val y23 = Iterator(3, 4, 1, 1, 2, 3, 8)
  y23.indexWhere(x => (x % 6 == 0))

  //u. def isEmpty: Boolean
  //If hasNext returns false, then the iterator is empty.
  y2.isEmpty

  //v. def isTraversableAgain: Boolean
  //If we can repeatedly traverse the iterator, this returns true; otherwise, false.
  y2.isTraversableAgain

  //w. def length: Int
  //Here, this returns the number of elements in the iterator. Once we’ve called this method, the iterator exhausts.
  y2.length

  //x. def map[B](f: (A) => B): Iterator[B]
  //This applies the function to every value in the iterator and then returns a new iterator from this.
  val u = Iterator(3, 4, 1, 1, 2, 3, 8)
  val u1 = u.map(x => (x * x))

  //aa. def mkString: String
  //This represents all the elements of the iterator as a String.
  //ab. def mkString(sep: String): String
  //This allows us to declare a separator for the same (see above)
  println(u1.mkString("~"))
  //ac. def nonEmpty: Boolean
  //If the iterator in Scala is empty, this returns false; otherwise, true.
  u1.nonEmpty

  //ad. def product: A
  //This multiplies all elements from the iterator and returns the result.
  u1.product

  //ae. def sameElements(that: Iterator[_]): Boolean
  //If both iterators produce the same elements in the same order, this returns true; otherwise, false.
  val u2 = Iterator(3, 4, 1, 1, 2, 3, 8)
  val u3 = Iterator(3, 4, 1, 1, 2, 3, 8)
  println(u2.sameElements(u3))

  //af. def seq: Iterator[A]
  //This returns a sequential view of the iterator in Scala.
  val u4 = Iterator(3, 4, 1, 1, 2, 3, 8)
  u4.seq

  //ah. def slice(from: Int, until: Int): Iterator[A]
  //This creates a new iterator with elements from from until until.
  t.slice(1, 4)

  //ai. def sum: A
  //This returns the sum of all elements in the Scala iterator.
  val u5 = Iterator(3, 4, 1, 1, 2, 3, 8)
  println(u5.sum)

  //aj. def take(n: Int): Iterator[A]
  //This returns the first n values from the iterator, or the entire iterator, whichever is shorter.
  u5.take(3)

  //ak. def toArray: Array[A]
  //This returns an Array from the elements of the iterator.
  u5.toArray

  //al. def toBuffer: Buffer[B]
  //This returns a Buffer from the iterator’s elements.
  u5.toBuffer

  //am. def toIterable: Iterable[A]
  //This returns a Scala iterable holding all elements of the iterator in Scala.
  // This doesn’t terminate for infinite iterators. Let’s take a Scala Iterable Example.
  u5.toIterable

  u5.toIterator
  //an. def toList: List[A]
  //This Scala iterator to list returns a List from the iterator.
  u5.toList

  //ao. def toString(): String
  //This represents the iterator as a String.
  u.toString

  //ap. def zip[B](that: Iterator[B]): Iterator[(A, B)
  //This returns a new Scala iterator holding pairs of corresponding elements in the iterator. How many elements does
  // this return? Whatever’s minimum of the sizes of both iterators.

  val re = Iterator(0, 0, 0, 0, 0, 0)
  r.zip(re)

}
