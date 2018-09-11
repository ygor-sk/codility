package sk.ygor.codility.lesson05

class CountDiv {

  def solution(a: Int, b: Int, k: Int): Int = {
    val amod = a % k
    val first = if (amod ==0) a else a + k - amod
    val last = b - b % k
    if (first <= last) {
      ((last - first) / k) + 1
    } else {
      0
    }

  }

}
