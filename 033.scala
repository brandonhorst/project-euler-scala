def isDigitCancelling(n: Int, d: Int) = {
  val dec = n / d.toFloat
  val nd = (n / 10, n % 10)
  val dd = (d / 10, d % 10)
  !(nd._2 == 0 && dd._2 == 0) &&
  (nd._1 / dd._1.toFloat == dec && nd._2 == dd._2 || 
  nd._2 / dd._1.toFloat == dec && nd._1 == dd._2 ||
  nd._1 / dd._2.toFloat == dec && nd._2 == dd._1 ||
  nd._2 / dd._2.toFloat == dec && nd._1 == dd._1)
}

val results = (10 to 99).flatMap(n => {
  (10 to 99).filter(d => n < d).filter(isDigitCancelling(n, _)).map((n, _))
}).foldLeft((1, 1))((a, x) => (a._1 * x._1, a._2 * x._2))

println("I am a lazy bum")
println(results._1.toString + "/" + results._2.toString)