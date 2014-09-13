def isPandigital(num: Int) = {
  val s = num.toString
  val pandigitalSet: Set[String] = (1 to s.length).map(_.toString).toSet
  val sSet: Set[String] = s.map(_.toString).toSet
  pandigitalSet == sSet
}

def isPrime(num: Int) = {
  if (num < 2) false
  else Stream.range(2, math.sqrt(num.toDouble).toInt + 1).forall(num % _ != 0)
}

def pow10(pow: Int) = {
  math.pow(10, pow).toInt
}

def digitRange(nDigits: Int) = {
  pow10(nDigits) - 1 to pow10(nDigits - 1) by -1
}

val results = (7 to 2 by -1).flatMap(n => {
  digitRange(n).filter(isPandigital).filter(isPrime).headOption
}).max

println(results)