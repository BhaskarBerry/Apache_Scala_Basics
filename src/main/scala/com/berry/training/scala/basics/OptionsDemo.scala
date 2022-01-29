package com.berry.training.scala.basics

/**
 * A Scala Option holds zero or one element of a type. This means that it is either a Some[T] or a none object.
 * One place we get an Option value is through the get() method for a Map.
 *
 * // Example 1:
 * Here, it returns Some(100) when it finds the key “Berry” in the Map (where 100 is the value for that key). And when
 * it does n’t find the key “Ravi” in there, it returns None, stating that it could n’t find the key.
 * This is like java.util.HashMap in Java.
 */
object OptionsDemo extends App {

  // Example 1:
  var m:Map[String, Int] = Map("Berry" -> 100, "Bose" -> 102, "Ayub" -> 456 , "Ram" -> 654)

  println(m)
  println(m.get("Berry")) //Some(100)
  println(m.get("Ravi")) //None


  def show(x: Option[Int])= x match {
    case Some(i) => i
    case None => "?"
  }
  println(show(m.get("Berry")))
  println(show(m.get("Ravi")))

  // getOrElse() Method

  val a: Option[Int] = Some(5)
  val b: Option[Int] = None

  println(a.getOrElse(1))  // a has Value so it returns 5
  println(b.getOrElse(10)) // b has no value so it returns default value  10

  // Method Call on an Option in scala
  //a. def get: A
  println(a.get)  // 5
//  println(b.get)  // Error -> None.get

  //b. Scala isEmpty() Method
  println(a.isEmpty) // false
  println(b.isEmpty) // true

  //c. def productArity: Int Scala Option returns the size of the product. A product A(x_1, …, x_k) has size k
  println(a.productArity) // 1
  println(b.productArity) // 0

  // d. def productElement(n: Int): Any : This returns the n-th element of product, where indexing begins at 0.
  println(a.productElement(0)) // 5
//  println(a.productElement(1)) // Exception in thread "main" java.lang.IndexOutOfBoundsException: 1
//  println(b.productElement(0)) // Exception in thread "main" java.lang.IndexOutOfBoundsException: 0

  // e. def exist(p:(A) => Boolean):Boolean
  //Scala Option has a value, and this value satisfies the predicate, this returns true. Otherwise, this returns false.
  println(a.exists(x=>{x%2!=0})) // true

  // f. def filter (p:(A) => Boolean): Option [A]
  // Scala Option’s value satisfies the predicate, this returns that value.
  println(a.filter(x => (x%2!=0))) // Some(5)

  //g. def filterNot(p:(A) => Boolean): Option[A]
  //If the Option’s value does not satisfy the predicate, this returns that value.
  println(a.filterNot(x => (x%2!=0))) // None
  println(a.filterNot(x => (x%2 ==0))) //Some(5)

  //h. def flatMap[B](f:(A) => Option[B]):Option[B] If the Option has a value, this applies the function to that value,
  // and then returns it.

  //i. def foreach[U](f:(A) => U):Unit
  //It applies the procedure to the Option’s value and returns it. If the Scala Option is None, this does nothing.

  //j. def getOrElse[B >: A](default: => B): B
  //If the Option has a value, this returns it; otherwise, returns the default value
  println(a.getOrElse(1))  // a has Value so it returns 5
  println(b.getOrElse(10)) // b has no value so it returns default value  10

  //k. def isDefined: Boolean
  //If the Option is an instance of Some, this returns true; otherwise, false.
  println(a.isDefined)  // true
  println(b.isDefined)  // false

  //l. def iterator: Iterator[A]
  //This returns an iterator on the Option.
  println(a.iterator) //non-empty iterator
  for(i <- a.iterator){println(i)} //5

  //m. def map[B](f: (A) => B): Option[B]
  //If the Option has a value, it applies this function to it, and then returns it.

  println(a.map(x=>x*x)) //Some(25)

  //n.def orElse[B >: A](alternative: => Option[B]): Option[B]
  //If the Option has a value, this returns that. Otherwise, this evaluates the alternative and returns it.

  //o. def orNull
  //If the Option has a value, this returns it. Otherwise, this returns Null.
}
