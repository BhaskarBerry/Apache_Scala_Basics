val s1: String = "hello"

s1.charAt(1)

val s2: String = null

// NullPointerException...
 //s2.charAt(1)

s1.isInstanceOf[String]
s2.isInstanceOf[String]

val xs = List(1,2,33)
val ys: List[AnyVal] = xs

val emptyList = List.empty

1 :: emptyList
"hello" :: emptyList
"1.23" :: emptyList

def fail(msg: String): Nothing =
  throw new IllegalStateException(msg)