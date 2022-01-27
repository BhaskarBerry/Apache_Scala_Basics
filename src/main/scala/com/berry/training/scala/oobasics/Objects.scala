package com.berry.training.scala.oobasics

object Objects extends App {
  //scala does not have class-level functionality ("static")

  object Person { //type + its  only instance
    //"static/class" - level functionality
    val n_EYES = 2

    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person = new Person("boby")
  }


  class Person(val name: String) {
    // instance -level functionality
  }
  //COMPANIONS

  println(Person.n_EYES)
  println(Person.canFly)

  // scala object is a single ton instance

  val berry = new Person("berry")
  val jhon = new Person("jhon")
  println(berry == jhon)

  val boby = Person.apply(berry, jhon)
  val boby1 = Person(berry, jhon)

  val pers1 = Person
  val pers2 = Person
  println(pers1 == pers2)

  // scala Application  == scala objects with
  // def main(args: Array[strings]): Unit

}
