def charsInNumber(n: Int): Int = {
  n match {
    case 0 => 0
    case 1000 => "onethousand".length
    case n if n % 100 == 0 => charsInNumber(n / 100) + "hundred".length
    case n if n > 100 =>
      charsInNumber(n / 100) + charsInNumber(n % 100) + "hundredand".length
    case n if n >= 80 && n <= 99 || n >= 20 && n <= 39 =>
      charsInNumber(n % 10) + "ninety".length
    case n if n >= 70 && n <= 79 => charsInNumber(n % 10) + "seventy".length
    case n if n >= 40 && n <= 69 => charsInNumber(n % 10) + "sixty".length
    case 1 | 2 | 6 | 10 => "one".length
    case 4 | 5 | 9 => "four".length
    case 3 | 7 | 8 => "three".length
    case 11 | 12 => "eleven".length
    case 13 | 14 | 18 | 19 => "thirteen".length
    case 15 | 16 => "fifteen".length
    case 17 => "seventeen".length
  }
}

val results = (1 to 1000).fold(0)(_ + charsInNumber(_))

println(results)