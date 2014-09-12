def isPrime(num: Long) = {
  Stream.range(2, math.sqrt(num.toDouble).toInt + 1).forall(num % _ != 0)
}

def primeFactors(num: Long): List[Long] = {
  def primeFactorsHelper(num: Long, previous: List[Long]): List[Long] = {
    if (num == 1) return previous
  
    val oneFactor = Stream.range(2, num + 1).filter(num % _ == 0).filter(isPrime).head
    primeFactorsHelper(num / oneFactor, previous :+ oneFactor)

  }
  primeFactorsHelper(num, List[Long]())
}

val results = primeFactors(600851475143L)

println(results.last)