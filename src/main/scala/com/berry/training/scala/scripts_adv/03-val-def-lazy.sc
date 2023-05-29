class Demo {
  val a: Int = {
    println("evaluating a")
    10
  }
  def b: Int = {
    println("evaluating b")
    20
  }
  lazy val c: Int = {
    println("evaluating c")
    30
  }
}

val demo = new Demo
val demo1 = new Demo
demo.a  // Evaluating during the class is created - val
demo.b  // Evaluated everytime when it is accessed - def
demo.b
demo.c  // Evaluated when it is called and stores the result and never evaluates again
demo.c
