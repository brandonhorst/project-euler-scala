def factorial(num: Int): BigInt =  if (num == 1) 1 else num * factorial(num - 1)

def square(num: BigInt) = num * num

val gridSize = 20

val results = factorial(gridSize * 2) / square(factorial(gridSize))

println(results)