val list = List(1,2,3,4,5,6, "df", "master")

list flatMap{
  case st: Int => Some(st)
  case _=> None
}

//At a glance one might wonder why not simply use list.filter{_.isInstanceOf[String]}. The difference is that the
// flatMap will return a List[String].

//However Scala 2.8 offers the collect method for doing a similar thing.

def strings(list: List[Any]) = list flatMap{
  case st: String => Some(st)
  case _=> None
}

// returned list is List[String]
strings("hi"::1::2::3::"World"::5::Nil)

//returned list is a List[Any] (not as Useful)
"hi"::1::2::3::"World"::5::Nil filter(_.isInstanceOf[String])

// returned list is List[String]
"hi"::1::2::3::"World"::5::Nil collect{case s:String => s}

list flatMap{ x=> Option(x.isInstanceOf[String])}