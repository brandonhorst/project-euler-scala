val results = (2 to 1000000)
  .map(x => (x, x
    .toString
    .map(_.asDigit)
    .foldLeft(0)(_ + math.pow(_, 5).toInt)
  )).filter(x => x._1 == x._2).foldLeft(0)(_ + _._1)

println(results)