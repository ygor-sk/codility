import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

import scala.collection.mutable.ArrayBuffer

object SemiPrimes {

  def solution(n: Int, p: Array[Int], q: Array[Int]): Array[Int] = {
    val semi = semiSieve(n)
    val prefixSums = Array.fill(q.length + 1)(0)
    for (i <- 1 until q.length + 1) {
      if (semi.contains(i)) {
        prefixSums(i) = prefixSums(i - 1) + 1
      } else {
        prefixSums(i) = prefixSums(i - 1)
      }

    }

    val result = Array.fill(n)(0)
    for (i <- q.indices) {
      val x = prefixSums(q(i))
      result(i) = x - prefixSums(p(i) - 1)
    }

    result
  }

  def calculateSieve(n: Int): Array[Boolean] = {
    val s = Array.fill(n + 1)(true)
    s(0) = false
    s(1) = false
    var i = 2
    while (i * i <= n) {
      if (s(i)) {
        var k = i * i
        while (k <= n) {
          s(k) = false
          k += i
        }
      }
      i += 1
    }
    s
  }

  def semiSieve(n: Int): Seq[Int] = {
    val result = new ArrayBuffer[Int]
    val sieve = calculateSieve(n)
    var i = 2
    while (i * i <= n) {
      if (sieve(i)) {
        var j = i * i
        while (j <= n) {
          if (j % i == 0 && sieve(j / i)) {
            result += j
          }
          j += i
        }
      }
      i += 1
    }
    result.sorted
  }
}