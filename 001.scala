def divisibleBy3And5(num: Int) = {
	num % 5 == 0 || num % 3 == 0
}

val result = (1 until 1000).filter(divisibleBy3And5).sum
println(result)