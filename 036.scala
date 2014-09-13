def isDualPalendromic(num: Long) = {
  val b10string = num.toString
  val b2string = java.lang.Long.toString(num, 2)
  b10string.reverse == b10string && b2string.reverse == b2string
}

val results = (1L until 1000000L).filter(isDualPalendromic).sum

println(results)