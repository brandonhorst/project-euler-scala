def pow(base: Int, exp: Int): BigInt = {
  var total = BigInt(1)
  for (i <- 1 to exp) {
    total *= base
  }
  total
}


val options = for (a <- 2 to 100; b <- 2 to 100) yield (a, b)

val results = options.map(_ match { case (b, e) => pow(b, e)}).toSet.size

println(results)