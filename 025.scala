val fibs: Stream[BigInt] = BigInt(0) #:: fibs.scanLeft(BigInt(1))(_ + _)

// def nDigits(num: BigInt): Int = {
//   num
// }

val results = fibs.zipWithIndex.find(_._1.toString.length >= 1000).getOrElse((0, 0))._2

println(results)
