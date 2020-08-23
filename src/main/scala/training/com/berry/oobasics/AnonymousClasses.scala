package training.com.berry.oobasics

object AnonymousClasses extends App {
  abstract class Animal{
    def eat : Unit
  }

//anonymous class
  val funncyAnimal : Animal = new Animal {
    override def eat: Unit = println("haaaaaaaaaaaaaaaaa")
  }
/*
eqvivalent with
class AnonymousClasses$$anon$1 extennds animal{
  override def eat: Unit = println("haaaaaaaaaaaaaaaaa")
}
val funnyanimal: animal = new AnonymousClasses$$anon$1
*/
  println(funncyAnimal.getClass)

  class Person(name : String){
    def sayHi: Unit = println(s"Hi, my name is $name")
  }

  val jim = new Person("Jim"){
    override def sayHi: Unit = println(s"Hi, my name is Jim")
  }

}
