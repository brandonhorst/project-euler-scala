def mkTriangle(value: Int, index: Int) : Stream[Int] = {
  value #:: mkTriangle(value + index + 1, index + 1)
}

val triangle = mkTriangle(1, 1)

def numFactors(num: Int, divisor: Int) = {
  if (num % divisor == 0) (
    if (math.pow(divisor, 2) == num) 1 else 2
  ) else 0
}

def totalFactors(num: Int) = {
  (1 to math.sqrt(num).toInt).foldLeft(0)(_ + numFactors(num, _))
}

val results = triangle.filter(totalFactors(_) > 500).head

println(results)
