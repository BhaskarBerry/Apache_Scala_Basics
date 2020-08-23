package training.com.berry.basics

object Expressions extends  App {
  val x = 1 + 2 // Expression

  println(x)

  println(2 + 3 * 4)

  // + - * / & | ^ << >> >>>(right shift with 0 extension )
   println(1 == x)
  // == != . >= < <=


  println(!(1 == x))

    // ! %% ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ... side effects

  //Instruction (Do) vs Expression (value)

  // IF expression
  val aCondition = true
  val acconditionedValue =  if(aCondition) 5 else 3 // IF expression
  println(aCondition)
  println( if(aCondition) 5 else 3 )

  var i =0
  while (i < 10){
    println(i)
    i = i+ 1
  }
  // Never write this again   -- Impretative style

  // Everything in scala is expression
  val aWierdValue = (aVariable =3) // unit === void ()
  println(aWierdValue)

  // side effects: println(), whiles, reassigning

  //code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"

  }

  //val anotheorValue = Z + 1 -- scope

  //1. Difference between "Hello" vs println("hello") ?
  //  value of string  -- unit
  //2 Bollean == true
  // code blocks return the last value
  val someValue ={
    2 < 3
  }
  // 3.
  val someotherValue = {
    if(someValue) 239 else 987
    42
  }

}
