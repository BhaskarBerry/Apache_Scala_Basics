package com.berry.training.scala.oobasics

object AbstractDataTypes extends App {
  // abstract -- subclass will implement
  // cannot instantiate
  abstract class Animal {
    val creatureType: String = "Wild"

    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Jummi"

    def eat: Unit = println("Crunch Crunch")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit

    val preferedmeal: String = "FreshMeat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"

    def eat: Unit = println("nonomnom")

    def eat(animal: Animal): Unit =
      println(s"I am croc and I am Eating ${animal.creatureType} ")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
  // traits vs. abstract classes
  //1. traits don nnot have constructor parameter
  //2. Multipule traits can be inherited by the same class
  //3. traits are behaviour, abstract class is type of thing
}
