def isPrime(num: Int) = {
  if (num < 2) false
  else Stream.range(2, math.sqrt(num.toDouble).toInt + 1).forall(num % _ != 0)
}

def rotations(num: Int) = {
  def rotationHelper(str: String, times: Int): List[String] = {
    if (times == 1) List(str)
    else str :: rotationHelper(str.tail + str.head, times - 1)
  }
  val numString = num.toString
  rotationHelper(numString, numString.length).map(_.toInt)
}

val results = (1 to 1000000).filter(num => {
  rotations(num).forall(isPrime)
}).length

println(results)