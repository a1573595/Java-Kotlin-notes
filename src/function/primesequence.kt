package function

fun main(arg: Array<String>) {
    val possiblePrimesAfter2 = generateSequence(3) { it + 2 }

    val primes = generateSequence(2 to possiblePrimesAfter2) {
        // next prime number
        val p = it.second.first()
        // filter out all element divisible by p
        val possiblePrimesAfterP = it.second.filter { it % p != 0 }
        // return next element in sequence
        p to possiblePrimesAfterP
    }.map { it.first }

    println(primes.take(10).joinToString())
}