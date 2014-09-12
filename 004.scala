def isPalendromic(num: Int) = {
  num.toString.reverse.toInt == num
}

implicit class Crossable[X](xs: Traversable[X]) {
  def cross[Y](ys: Traversable[Y]) = for { x <- xs; y <- ys } yield (x, y)
}

val result = ((100 to 999) cross (100 to 999))
  .map(Function.tupled(_ * _))
  .filter(isPalendromic)
  .max

println(result)
