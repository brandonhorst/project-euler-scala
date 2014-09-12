val pandigitalSet = "123456789".toSet

def isPandigital(s: String) = {
  s.length == 9 && pandigitalSet == s.toSet
}

def isProductPandigital(a: Int, b: Int) = {
  isPandigital((a * b).toString + a.toString + b.toString)
}

val results = (1 to 99).flatMap(i => {
  (100 to 9999).filter(j => {
    isProductPandigital(i, j)
  }).map(i * _)
}).toSet.sum


println(results)