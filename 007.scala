def isPrime(num: Int) = {
  Stream.range(2, math.sqrt(num.toDouble).toInt + 1).forall(num % _ != 0)
}

val results = Stream.from(2).filter(isPrime).slice(10000,10001).head

println(results)
