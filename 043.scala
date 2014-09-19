val panDigitals = (0 to 9).permutations.map(_.mkString("").toLong)

def isInteresting(num: Long) = {
  val str = num.toString
  str.slice(1, 4).stripPrefix("0").toInt % 2 == 0 &&
  str.slice(2, 5).stripPrefix("0").toInt % 3 == 0 &&
  str.slice(3, 6).stripPrefix("0").toInt % 5 == 0 &&
  str.slice(4, 7).stripPrefix("0").toInt % 7 == 0 &&
  str.slice(5, 8).stripPrefix("0").toInt % 11 == 0 &&
  str.slice(6, 9).stripPrefix("0").toInt % 13 == 0 &&
  str.slice(7, 10).stripPrefix("0").toInt % 17 == 0
}

val results = panDigitals.filter(isInteresting).sum

println(results)