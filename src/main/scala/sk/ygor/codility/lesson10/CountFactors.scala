package sk.ygor.codility.lesson10

class CountFactors {

  def solution(n: Int): Int = {
    var i: Long = 1
    var result = 0
    while (i * i < n) {
      if (n % i == 0) {
        result += 2
      }
      i += 1
    }
    if (i * i == n) {
      result += 1
    }
    result
  }

}
