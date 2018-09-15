package sk.ygor.codility.lesson12

class ChocolatesByNumbers {

  def solution(n: Int, m: Int): Int = n / gcd(n, m)

  private def gcd(a: Int, b: Int): Int = {
    if (a < b) {
      gcd(b, a)
    } else {
      val modulo = a % b
      if (modulo == 0) b else gcd(b, modulo)
    }
  }
}
