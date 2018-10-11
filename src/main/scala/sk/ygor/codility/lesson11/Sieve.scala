package sk.ygor.codility.lesson11

object Sieve {

  def sieve(n: Int): Seq[Int] = {
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
    s.zipWithIndex.collect { case (isPrime, index) if isPrime => index }
  }

  def main(args: Array[String]): Unit = {
    println(sieve(200))
  }

}
