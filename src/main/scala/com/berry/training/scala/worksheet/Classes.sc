/*
Simple Classes: are similar to java classes but are designed to work around some of the boiler plate code.
But one thing to note is that normally the code that is in a Java constructor goes directly in the body of a Scala class
or in a companion object.
*/

class Test(idPrivate : Int, val name:String ,var age:Int)

val c =  new Test(1, "Berry", 30)

//c.idPrivate //value id is not a member of Test

c.name
c.age

//c.name = "Bose" // Not allowed bec name is a val
//reassignment to val
//c.name = "Bose"

c.age = 31 // Allowed bec of type var
c.age

class SampleTest(aPrivate:Int){
  val aPublic = aPrivate + 10
}

class sample(tmp:Int) extends SampleTest(tmp){
  // can't access super.aPrivate because it is class private so use tmp
  override val aPublic = tmp * 10
}


new SampleTest(10).aPublic

new sample(10).aPublic

class sample1(aPrivate: Int){
  println(aPrivate)
  private val p = aPrivate % 10
  println(p)
}
new sample1(22)