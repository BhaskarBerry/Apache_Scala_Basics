package exercise

abstract class MyListGeneric[+A] {
  /*
    head = first element of the list
    tail = remainder of the list
    iseEmpty = is the list empty
    add => new list with this element added
    toString => a string representation of the list
   */
  def head: A
  def tail: MyListGeneric[A]
  def isEmpty: Boolean
  def add[B >: A](element: B): MyListGeneric[B]
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyListGeneric[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyListGeneric[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](element: B): MyListGeneric[B] = new Cons(element, Empty)
  //Polymorhic call
  def printElements: String = ""
}

class Cons[+A](h: A, t: MyListGeneric[A]) extends MyListGeneric[A] {
  def head: A = h
  def tail: MyListGeneric[A] = t
  def isEmpty: Boolean = false
  def add[B >: A](element: B): MyListGeneric[B] = new Cons(element, this)

  def printElements: String =
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
}

object MyListGeneric extends App {
  val listOFINtegers: MyListGeneric[Int] =
    new Cons(1, new Cons(2, new Cons(3, Empty)))
  val listOFString: MyListGeneric[String] =
    new Cons("Hello", new Cons("ayub", new Cons("Ram", Empty)))
  println(listOFINtegers.toString)
  println(listOFString.toString)
}
