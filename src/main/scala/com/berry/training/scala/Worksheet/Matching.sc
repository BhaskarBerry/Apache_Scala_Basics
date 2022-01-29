//Matching is a powerful concept in scala that is similar to a switch in Java. The difference is that matching takes it
// to another level
//Note: If a match is not fond a scala.MatchError is thrown

val s  = "MatchingString"

s match {
  case "MatchingString" =>"it's a Match!!"
  case _ => "No Match"
}

s match {
  case m @ "MatchingString" =>"it's a Match!!"
  case _ => "No Match"
}


s match {
  case m @ "MatchingString" =>"it's a Match!!"+m+"!"
  case _ => "No Match"
}

s match {
  case m  =>"This matches everything"
  case _ => "No Match"
}

s match {
  case m if(m.startsWith("M")) => "It is a match"
  case _ => "No Match"
}

val obj:Any = s // Assigning s to a variable of type Any - parent of all object

obj match {
//  case string: String => "We have found String"
  case integer: Int => "We found an Integer"
  case _ => "Default"
}

obj match {
  //  case string: String => "We have found String"
  case integer: Int => "We found an Integer"
  case double:Double => "Double"
}

//functionThatReturnsList() match {
//  case m @ "s1" :: "s2" :: "s3" :: _* => // use m
//  case _ => // no match
//}