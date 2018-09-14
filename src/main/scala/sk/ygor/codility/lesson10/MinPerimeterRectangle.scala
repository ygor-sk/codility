package sk.ygor.codility.lesson10

class MinPerimeterRectangle {

  def solution(n: Int): Int = {
    var result = Int.MaxValue
    var i: Int = 1
    while (i * i <= n) {
      if (n % i == 0) {
        result = Math.min(result, i * 2 + ((n / i) * 2))
      }
      i += 1
    }
    result
  }

}
