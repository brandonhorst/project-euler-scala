def factorial(num: Int): BigInt = if (num == 1) 1 else num * factorial(num - 1)

def digits(num: BigInt) = num.toString.map(_.asDigit)

val results = digits(factorial(100)).sum

println(results)