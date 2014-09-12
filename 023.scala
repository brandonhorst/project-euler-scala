def divisorsSum(num: Int): Int = {
  (1 to math.sqrt(num).toInt).foldLeft(0)((acc, x) => {
    x match {
      case 1 => acc + 1
      case x if num % x == 0 && x == num / x => acc + x
      case x if num % x == 0 => acc + x + num / x
      case _ => acc
    }
  })
}

def isAbundant(num: Int) = {
  divisorsSum(num) > num
}

val abundancyList = (1 to 28123).map(isAbundant)

def isAbundantSum(num: Int) = {
  (12 to num - 12).exists(x => {
    abundancyList(x - 1) && abundancyList(num - x - 1)
  })
}

val results = (1 to 28123).filter(!isAbundantSum(_)).sum

println(results)