//This is ugly and I don't like it

def hypo(a: Int, b: Int) = {
  math.sqrt(math.pow(a, 2) + math.pow(b, 2)).toInt
}

def isPythag(a: Int, b: Int) = {
  val square = (math.pow(a, 2) + math.pow(b, 2)).toInt

  //check for perfect square
  math.pow(math.sqrt(square).toInt, 2) == square
}

val potentials = for (a <- 1 until 1000; b <- 1 until 1000
  if a < b && isPythag(a, b) && a + b + hypo(a, b) == 1000
  ) yield (a * b * hypo(a, b))

println(potentials(0))
