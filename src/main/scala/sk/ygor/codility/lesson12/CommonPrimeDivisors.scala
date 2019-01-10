package sk.ygor.codility.lesson12

class Ladder {

  def solution(a: Array[Int], b: Array[Int]): Array[Int] = {
    ???
  }

  private def gcd(a: Int, b: Int): Int = {
    if (a < b) {
      gcd(b, a)
    } else {
      val modulo = a % b
      if (modulo == 0) b else gcd(b, modulo)
    }
  }


}
