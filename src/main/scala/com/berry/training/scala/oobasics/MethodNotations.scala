package com.berry.training.scala.oobasics

object MethodNotations extends App {

  class Person(val name: String, favMovie: String, val age: Int = 10) {
    def likes(movie: String): Boolean = movie == favMovie

    def hangoutWith(person: Person): String =
      s"${this.name} is hang out with ${person.name}"

    def +(person: Person): String =
      s"${this.name} is hang out with ${person.name}"

    def unary_! : String = s"$name , wow!"

    def unary_+ : Person = new Person(name, favMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi My name is $name and like $favMovie"

    def apply(n: Int): String = s"$name watched $favMovie $n time"


    def +(nickname: String): Person =
      new Person(s" $name  ($nickname)", favMovie)

    def learns(thing: String) = s"$name is learning $thing"

    def learnScala = this learns "scala"
  }

  val berry = new Person("Berry", "300")
  println(berry.likes("300"))
  println(berry likes "300") // euivalent

  // infix notation = operator notation  == syntactic sugar
  // TW: Methods with a single parameter can be called in this infix notation style
  //"operators" in scala
  val tom = new Person("Tome", "Fight")
  println(berry hangoutWith tom)
  println(berry + tom)

  println(1 + 2)

  // ALL OPERATORS ARE METHODS
  //AKKA Actors have ! ?

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary _prefix ony works with - + ~ !

  println(!berry)
  println(berry.unary_!)

  // post fix notation
  // Method without parameter

  println(berry.isAlive)
  println(berry isAlive)

  // apply
  println(berry.apply())
  println(berry()) // equivalent
  //Exercise
  /*
1. Overloadd the + operator
  berry + "therokstr" => new Person "Berry (the rock star)"

2. add an age to the Person class
   Add a unary + operator => new person with the age + 1
   +berry => berry with the age incrementer
3. Add a "learns" method in the Person class => "Berry learn scala"
   Add a learnsScala method, calls learns method with "scala"
   use it in postfix notation
4. overloadd the apply method
berry.apply(2) => "berry watch 2300 2 times"
 */
  println((berry + "the rockstar") ())
  println((berry + "the rockstar").apply())

  println((+berry).age)

  println(berry learnScala)

  println(berry(10))
}
