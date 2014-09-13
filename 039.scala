val legs = for (a <- 1 to 1000; b <- 1 to 1000 if a <= b) yield (a, b)

def quadratic(a: Int, b: Int) = {
  math.sqrt(a * a + b * b)
}

val results = legs
  .map(x => (x._1, x._2, quadratic(x._1, x._2)))
  .filter(_._3.isWhole)
  .map(x => x._1 + x._2 + x._3.toInt)
  .filter(_ <= 1000)
  .groupBy(identity)
  .maxBy(_._2.length)
  ._1

println(results)