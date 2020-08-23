package training.com.berry.basics

object Functions extends App {
  def aFunction(a: String, b: Int) = {
    a + " " + b
  }

  println(aFunction("Berry", 30))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("berry", 3))

  // WHEN YOU NEed LOOPS , USE RECURSION
  // Unit as a returun type

  // for a recurssion function return type should be mentioned
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def asmallerFunction(a: Int, b: Int): Int = a + b
    asmallerFunction(n, n - 1)
  }

  /*
  Examples
  1. A greeting function (name ,age ) => "Hi my name is &name and i amd $age years old"
  2. Factorial Function 1 * 2 * 3 ... *n
  3. A Fibonacci Function
      f(1) = 1
      f(2) = 1
      f(n) = f(n-1)+ f(n-2)
   4. Test if a number is prime.
   */

  //  A greeting function (name ,age ) => "Hi my name is &name and i amd $age years old".

  def aGreetFunction(name: String, age: Int): Unit = {
    println(s"Hi my name is $name and i amd $age years old")
  }

  aGreetFunction("Berry", 30)
  aGreetFunction("Ayub", 30)

  //2.Factorial Function 1 * 2 * 3 ... *n
  def aFactorialFunction(n: Int): Int = {
    if (n <= 0 ) 1 else n * aFactorialFunction(n - 1)
  }
  println("Factorial of a number 4 : ", aFactorialFunction(4))

  //3.  A Fibonacci Function
  def aFibonacciFunction(a: Int): Int = {
    //if (a == 1 || a == 2)  1
    if (a <= 2) 1
    else  aFibonacciFunction(a - 1) + aFibonacciFunction(a - 2)
  }

  for( i <- 1 to 10) {
    println(s"Fibonacci Number $i : ", aFibonacciFunction(i))
  }


  // 4. Number is Prime
  def aPrimeFunction(a: Int): Unit={

    if( a == 1) {
      println(" 1 is a prime")
    }
    else{
      if(a % 2 == 0){
        print(s"$a is a prime number")
      }
      else {
        println(s"$a is not a prime number")
      }
    }
  }
  aPrimeFunction(4)
  aPrimeFunction(3)

  def isPrime(n: Int): Boolean={
    def isPrimeuntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeuntil(t-1)

    isPrimeuntil(n/2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(629))
}
