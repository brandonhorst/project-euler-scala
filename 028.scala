val outerCircles = (1001 - 1) / 2

val numPerSidePerCircle = (1 to outerCircles).map(2 * _)

val firstInCircle = numPerSidePerCircle.scanLeft(2)(_ + _ * 4).init

val results = (numPerSidePerCircle, firstInCircle).zipped
  .map((perSide, first) => first * 4 + perSide * 10 - 4)
  .sum + 1

println(results)
