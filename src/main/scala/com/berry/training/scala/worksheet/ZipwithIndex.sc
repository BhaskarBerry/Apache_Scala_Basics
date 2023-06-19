/**
 * A common desire is to have access to the index of an element when using collection methods like foreach, filter,
 * foldLeft/Right, etc... Fortunately there is a simple way.
 */
val list = List('a','b',  'c', 'd','e')
//Does that not trigger an extra iteration through the collection?. Indeed it does and that is where Views help.
list.zipWithIndex
//When using a view the collection is only traversed when required so there is no performance loss.
list.view.zipWithIndex

/*
I like to use functions constructed with case statements in order to clearly label the index.
The alternative is to use x._2 for the index and x._1 for the value
*/
list.view.zipWithIndex foreach{
  case(value, index) => println(value, index)
}

/// alternative syntax without case statement
list.view.zipWithIndex foreach(e => println(e._1, e._2))

/*
Fold left and right functions have 2 parameters (accumulator, nextValue)
using a case statement allows you to expand that but watch the brackets!
*/
(list.view.zipWithIndex foldLeft 0) { case (acc,
  (v, i)) => acc + v.toInt + i}
// alternative syntax without case statement
(list.view.zipWithIndex foldLeft 0){(acc, e) => acc+e._1.toInt + e._2}

/*
alternative foldLeft operator.
The thing I like about this syntax is that it has the initial accumulator value on the left
in the same position as the accumulator parameter in the function.
The other thing I like about it is that visually you can see that it starts with
"" and the folds left
*/
("" /: list.view.zipWithIndex) {
  case (acc, (value, index)) if index % 2 == 0 => acc + value
  case (acc, _) => acc
  }

list.view.zipWithIndex.filter { _._2 % 2 == 0 }.map { _._1}.force

for ((value,index) <- list.zipWithIndex if index % 2 == 0) yield value