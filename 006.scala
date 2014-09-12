val square = math.pow(_: Int, 2).toLong

val result = square((1 to 100).sum) - (1 to 100).map(square).sum

println(result)
