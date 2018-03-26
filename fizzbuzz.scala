def isDivisible(dividend: Int, divisor: Int): Boolean = dividend % divisor == 0

def fizzBuzz(counter: Int): String = {
  counter match {
    case counter if isDivisible(counter, 15) => "FizzBuzz"
    case counter if isDivisible(counter, 3) => "Fizz"
    case counter if isDivisible(counter, 5) => "Buzz"
    case _ => counter.toString
  }
}

(1 to 100).map(fizzBuzz).foreach(println)
