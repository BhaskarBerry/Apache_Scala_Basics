package training.com.berry.oobasics

object CaseClasses extends App {

  /*
  equals, hashCode,toString
   */

  case class Person(name: String, age: Int)

  //1. class parameter are fileds

  val berry = new Person("Berry", 30)
  println(berry.name)

  //2. Sensible toString
  // println(instance ) = println(instance.toString) // Syntactic Sugar
  println(berry)

  //3. equals and hashcode implemented OOTB

  val jim = new Person("Berry", 30)

  println(berry == jim)

  //4. CCs have handy copy method
  val berry1 = berry.copy(age =45)
  println(berry1)

  //5. case classes have companinon objects
  val thePerson = Person
 val mary = Person("Mary", 34)
  println(mary)

  //6. CCS are Serializable
  // Akka

  //7. ccs have extracted patterns == ccs can be used in PATTERN MATCHING
  case object UK {
    def name: String = "The UK"
  }
  /*
  Expand MylIst - use case classes and case objects
     */

}
