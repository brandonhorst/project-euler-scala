def pow(base: Int, exp: Int): BigInt = {
  var total = BigInt(1)
  for (i <- 1 to exp) {
    total *= base
  }
  total
}

val result = pow(2, 1000).toString.map(_.asDigit).sum

println(result)