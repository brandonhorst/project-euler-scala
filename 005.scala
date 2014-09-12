def factorableThrough(highestFactor: Int)(num: Int) = {
  (1 to highestFactor).forall(num % _ == 0)
}

val result = Stream.from(1).filter(factorableThrough(20)).head

println(result)
