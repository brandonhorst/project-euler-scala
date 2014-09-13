val pandigitalSet = "123456789".toSet

def isPandigital(s: String) = {
  s.length == 9 && pandigitalSet == s.toSet
}

def concatProduct(num: Int, n: Int) = {
  (1 to n).map(num * _).map(_.toString).foldLeft("")(_ + _)
}

val cases = for (i <- 2 to 20; j <- 2 to 20000) yield (i, j)
val results = cases.map(c => concatProduct(c._2, c._1)).filter(isPandigital).map(_.toInt).max

println(results)