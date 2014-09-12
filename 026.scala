val mc = new java.math.MathContext(5000)
val unitFractions = (1 until 1000).map(BigDecimal(1, mc) / BigDecimal(_, mc))

val regex = """(.+?)\1+""".r

def repeatingPortion(s: String) = {
  regex.findAllMatchIn(s).map(_.group(1)).foldLeft("")((old, cur) => {
    if (old.length > cur.length) old else cur
  })
}

val results = unitFractions.map(_.toString).map(repeatingPortion).zipWithIndex.maxBy(_._1.length)._2 + 1

println(results)
