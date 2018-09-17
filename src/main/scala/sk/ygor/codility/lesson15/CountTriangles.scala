package sk.ygor.codility.lesson15

class CountTriangles {

  def solution(a: Array[Int]): Int = {
    var result = 0
    for (p <- 0 until a.length - 2) {
      for (q <- p + 1 until a.length - 1) {
        for (r <- q + 1 until a.length) {
          val ap = a(p).toLong
          val aq = a(q).toLong
          val ar = a(r).toLong
          if ((ap + aq > ar) && (aq + ar > ap) && (ar + ap > aq)) {
            result += 1
          }
        }
      }
    }
    result
  }

  def solution2(unsorted: Array[Int]): Int = {
    val a = unsorted.sorted
    var result = 0
    for (p <- 0 until a.length - 2) {
      var q = p + 1
      var r = p + 2
      while (r < a.length) {
        val ap = a(p).toLong
        val aq = a(q).toLong
        val ar = a(r).toLong
        if (ap + aq > ar) {
          result += r - q
          r += 1
        } else if (q < r - 1) {
          q += 1
        } else {
          r += 1
          q += 1
        }
      }
    }
    result
  }

  def solution3(unsorted: Array[Int]): Int = {
    val a = unsorted.sorted
    var result = 0
    for (p <- 0 until a.length - 2) {
      var r = p + 2
      for (q <- p + 1 until a.length - 1) {
        while (r < a.length && a(p).toLong + a(q).toLong > a(r).toLong) {
          r += 1
        }
        result += r - q  - 1
      }
    }
    result
  }
}
