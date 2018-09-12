package sk.ygor.codility.lesson06

class Triangle {

  def solution(array: Array[Int]): Int = {
    if (array.length < 3) {
      0
    } else {
      val tripletExists = array.sorted.sliding(3).exists {
        case Array(aInt, bInt, cInt) =>
          val a = aInt.toLong
          val b = bInt.toLong
          val c = cInt.toLong
          a + b > c && a + c > b && b + c > a
      }
      if (tripletExists) 1 else 0
    }
  }

}
