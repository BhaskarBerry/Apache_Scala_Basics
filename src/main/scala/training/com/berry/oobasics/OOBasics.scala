package training.com.berry.oobasics

object OOBasics extends App {

  val person = new Person("Berry",30)

  println(person.age)
  println(person.x)
  person.greet("Ayub")
  person.greet()
  // person.name is parameter not filed
}
// constructor
class  Person(name: String, val  age: Int = 0) {
  // class parameters are not Fields to convert add val  to that parameter.

  //body
  val  x = 2

  println(1 + 3)
//method
  def greet(name: String): Unit =  println(s"${this.name} says : Hi , $name")
//overloading
  def greet(): Unit = println(s"Hi I am $name")

  //multiple constructors
  def this(name: String) = this(name,0) // auiallry consytructor
  def this() = this("Mala")


}

