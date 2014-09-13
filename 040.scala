val numIterator = Iterator.iterate(1)(_ + 1)

val indices = Vector(1, 10, 100, 1000, 10000, 100000, 1000000)

val results = numIterator
  .flatMap(_.toString)
  .map(_.asDigit)
  .zipWithIndex
  .take(10000000)
  .filter(x => indices.contains(x._2 + 1))
  .map(_._1)
  .product

println(results)