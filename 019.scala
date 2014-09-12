def isLeapYear(year: Int): Boolean = {
  if (year % 4 == 0)
    if (year % 100 == 0)
      if (year % 400 == 0) true
      else false
    else true
  else false
}

def daysInMonth(month: Int, year: Int): Int = {
  month match {
    case 1 if isLeapYear(year) => 29
    case 1 => 28
    case 3 | 5 | 8 | 10 => 30
    case _ => 31
  }
}

//january 1, 1901 was Tuesday, so Sunday is day 5 + 7i
def isSunday(day: Int) = day % 7 == 5

val results = (1901 to 2000).flatMap((year: Int) => {
  (0 to 11).map((_, year))
}).map(Function.tupled(daysInMonth)).init.scanLeft(0)(_+_).filter(isSunday).length

println(results)
