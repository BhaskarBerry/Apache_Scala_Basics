package com.berry.training.scala.oobasics

object Generics extends App {
  class MyList[+A] {
    //use the type A -- inside the class
    def add[B >: A](element: B): MyList[B] = ???
    /*
    A = Cat
    B= Dog = Animal
     */


  }

  class MyMap[Key, Value]

  val listOfInteger = new MyList[Int]
  val listOFStrings = new MyList[String]

  //Generic Methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal

  class Cat extends Animal

  class Dog extends Animal

  //1.  yes list[Cat] extends List[Animal] = covariance
  class CovariantList[+A]

  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animal list.add(new Dog) ??? -- hard ==-- We retur list of animals

  //2. NO -- Invariance
  class InvariantList[A]

  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. HEll, NO Contravariance

  //  class ContravariantList[-A]
  //  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]
  class Trainer[-A]

  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  // upper bounded type <
  // lower bounded type >
  class Cage[A <: Animal](animal: A)

  val cage = new Cage(new Dog)

  //  class Car
  //  val newCage =new Cage(new Car)

  // Expa

}
