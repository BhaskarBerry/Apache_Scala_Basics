package training.com.berry.oobasics

object Inheritance extends App {
  //single class inheritance
  sealed class Animal {
    /*
    public -- can access outside this class
    private -- can access only in this class and not evn in the sub class
    protected -- can access in the subclass
     */
    val creatureType = "Wild"
    def eat = println("nomnom")
  }

  class cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new cat
  cat.crunch

  //constructor
  class Person(name: String, age: Int) {
    //auxiallry contructor

    def this(name: String) = this(name, 0)
  }
//  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //overriding
  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType = "domestic"
    override def eat = {
      super.eat
      println("Crinc , criunch")
    }
  }

  // same as above
//  class Dog(dogType: String) extends  Animal {
//    override val creatureType: String = dogType
//  }

  val dog = new Dog("ki")
  print(dog.eat)
  println(dog.creatureType)

  // type substitution + broad: Polymorphism

  val unkonwn: Animal = new Dog("KK9")
  println(unkonwn.eat)

  // overriding vs overloading

  //super

// preventing overrides
  //1.use final on member
  //2. can use on the class level camn not xtend (int , string class)
  //3. seal the class  == extend classses inthis file , and prevents the etxension in the other class

}
