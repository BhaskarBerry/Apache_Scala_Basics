package training.com.berry.oobasics

object OOBExercise extends App{

  val author = new Writer("Raghu", "Ram", 1990)
  val imposter = new Writer("Raghu", "Ram", 1990)
  val novel = new Novel("The Half girl friend", 2000,author)

  println(novel.authorage())
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.inc.inc.print
  counter.inc(14).print
  counter.dec.print
}

/*
Novel and writer

Writer: full name , surname , year
- method full name

Novel; name , year of release, author
  - authorAge
  - siWrittenBy (author)
  -copy(new year of release) == new instanceof novel
*/

class Writer(fname: String, surname: String, val yob: Int) {
  def fullName(): String=  fname + " " + surname
}

class  Novel(name: String, yor: Int, author: Writer ) {
  def authorage(): Int = {
    yor - author.yob
  }

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
counter Class
  - receives an int vale
  - method current count
  -- method to increment and decrement => new counter
  -- overload inc/dec to receive an amount
 */

class Counter(val count : Int = 0){
  def inc = {
    println("Incrementing")
    new Counter(count + 1) // immutability
  }

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int):Counter ={
    if (n<=0)  this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter={
    if (n <= 0 ) this
    else dec.dec(n-1)
  }
  def print=println(count)

  //  def inc(n: Int) = new Counter(count + n)
//  def dec(n: Int) = new Counter(count - n)

}