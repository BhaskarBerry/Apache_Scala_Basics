/**
 * Case classes are a special type of class that comes with several convenient definitions (equals, hashCode, toString, copy).
 * There are two main uses:
  1. Data object
  2. Matching

First examples is using as a data structure (Note: Some and None are both case classes):
 */

case class Node(name:String, left:Option[Node], right: Option[Node])

val tree = Node("root",
  Some(Node("left", None, None)),
  Some(Node("right",None,Some(Node("grandchild",None,None))))
)

tree match {
  case Node(_, Some(left), Some(right)) => println(left, right)
  case _ => println("should not happen")
}

case class cust(id:Int, name : String)

val c1 = cust(1, "Berry")
val c2 = cust(2, "Berry")
val c3= c1
c1.toString

c1 == cust(1,"Berry")
c1 == c2
c1.hashCode()
c2.hashCode()

c1.canEqual(c2)
c1.canEqual(c3)

c1.copy(name = "Bhaskar")
c1