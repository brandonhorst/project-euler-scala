def isPrime(num: Int) = {
  Stream.range(2, math.sqrt(num.toDouble).toInt + 1).forall(num % _ != 0)
}

val results = (2 until 2000000).filter(isPrime).map(BigInt(_)).sum

println(results)
