def factorial(num: Int): BigInt = {
  num match {
    case 0 | 1 => 1
    case _ => num * factorial(num - 1)
  }
}

def factorialEqual(num: Int) = {
  num == num.toString.map(_.asDigit).map(factorial).sum
}

val results = (3 to 100000).filter(factorialEqual).sum

println(results)