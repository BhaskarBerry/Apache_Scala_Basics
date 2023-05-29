// Can't do this, == is final

//class BadClass {
//  override def ==(other: Any): Boolean = {
//    println(s"Comparing $this to $other")
//    false
//  }
//}

/**
 * overriding method == in class Object of type (x$1: Any)Boolean;
method == cannot override final member
override def ==(other: Any): Boolean = {
 */
class Authority {
  final def theWord: String =
    "This is the final word on the matter!"
}

// this won't compile either

//class Argumentative extends Authority {
//  override def theWord: String =
//    "No, it's not!"
//}

// String is final, so can't extend it

// class BadString extends String

final class Infinity

//class Beyond extends Infinity
