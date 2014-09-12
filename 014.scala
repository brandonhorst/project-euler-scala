def memoize[A, B](f: A => B) = new (A => B) {
  val cache = scala.collection.mutable.Map[A, B]()
  def apply(x: A): B = cache.getOrElseUpdate(x, f(x))
}

def collatzLength(num: Long): Long = {
  if (num == 1)
    return 0
  val next = num match {
    case n if n % 2 == 0 => n / 2
    case n => 3 * n + 1
  }

  1 + collatzLengthMemo(next)
}

val collatzLengthMemo = memoize(collatzLength)

val results = (1L to 1000000L).map(collatzLengthMemo).zipWithIndex.maxBy(_._1)._2 + 1


println(results)
