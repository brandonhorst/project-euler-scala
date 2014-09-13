def isPrime(num: Int) = {
  if (num < 2) false
  else Stream.range(2, math.sqrt(num.toDouble).toInt + 1).forall(num % _ != 0)
}

def isTruncatablePrime(num: Int) = {
  num.toString.scanLeft("")((a, s) => a + s).tail.map(_.toInt).forall(isPrime) &&
  num.toString.scanRight("")((a, s) => a + s).tail.init.map(_.toInt).forall(isPrime)
}

val results = (10 to 1000000).filter(isTruncatablePrime).sum

println(results)