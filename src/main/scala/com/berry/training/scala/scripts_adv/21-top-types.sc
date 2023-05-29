val s: String = "hello"

val sa: Any = s
val sar: AnyRef = s

// Does not compile -the result type of an implicit conversion must be more specific than AnyVal
 //val sav: AnyVal = s

val i: Int = 10

val ia: Any = i
val iav: AnyVal = i

// Does not compile
// val iar: AnyRef = i

ia.isInstanceOf[Int]
ia.asInstanceOf[Int]
// ia.asInstanceOf[String]

sa.isInstanceOf[String]
sa.asInstanceOf[String]
// sa.asInstanceOf[Int]