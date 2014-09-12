def divisorsSum(num: Int): Int = {
  (1 to num-1).filter(num % _ == 0).sum
}

val divisorSums = (1 to 10000).map(divisorsSum)

val results = divisorSums.zipWithIndex.foldLeft(0)((acc, x) => {
  if (
    x._1 > 0
    && x._1 <= 10000
    && x._1 - 1 != x._2
    && divisorSums(x._1 - 1) == x._2 + 1
  ) acc + x._1
  else acc
})

println(results)
