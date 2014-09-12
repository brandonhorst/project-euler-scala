val range = 999

def isPrime(num: Int) = {
  if (num < 2) false
  else Stream.range(2, math.sqrt(num.toDouble).toInt + 1).forall(num % _ != 0)
}

def nPrimes(a: Int, b: Int) = {
  def f(n: Int) = n * n + a * n + b
  Stream.from(0).map(f).indexWhere(!isPrime(_))
}

var max = 0
var cur = 0
var result = 0

//I don't really like for loops but it was running out of memory using map and filter
// didn't want to optimize it
for (a <- -range to range; b <- -range to range) {
  cur = nPrimes(a, b)
  if (cur > max) {
    max = cur
    result = a * b
  }
}

println(result)