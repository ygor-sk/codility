package sk.ygor.codility.lesson06

class NumberOfDiscIntersections {

  // O(n^2)
  def solution(array: Array[Int]): Int = {
    var result = 0
    for (a <- 0 until array.length -1; b <- a + 1 until array.length) {
      val ra = array(a).toLong
      val rb = array(b).toLong
      if ((ra + rb == b - a) || (ra + rb > b - a && (ra <= b - a + rb || rb <= b - a + ra))) {
        result += 1
      }
    }
    result
  }

}
