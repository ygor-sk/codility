package sk.ygor.codility.lesson14

class MinMaxDivision {

  def solution(k: Int, m: Int, a: Array[Int]): Int = {
    val ps = prefixSums(a)

    def sum(from: Int, until: Int): Int = ps(until) - ps(from)
    //    def sum(from: Int, until: Int): Int = a.slice(from, until).sum

    def solution(blockRemaing: Int, startIndex: Int): Int = {
      if (blockRemaing == 1) {
        val result = sum(startIndex, a.length)
        result
      } else if (blockRemaing >= a.length - startIndex) {
        a.slice(startIndex, a.length).max
      } else if (startIndex > a.length - 2) {
        0
      } else {
        var min = Int.MaxValue
        for (i <- startIndex + 1 until a.length) {
          val prefixSum = sum(startIndex, i)
          val suffixSum = solution(blockRemaing - 1, i)
          min = Math.min(min, Math.max(prefixSum, suffixSum))
        }
        min
      }
    }

    solution(k, 0)
  }

  def solution2(k: Int, m: Int, a: Array[Int]): Int = {

    def verifySolution(candidate: Long): Int = {
      var kRemaning = k
      var idx = 0

      while (true) {
        assert(kRemaning > 0)
        assert(idx < a.length)
        if (a(idx) > candidate) {
          return -1 // candidate is too small; next single item is bigger than candidate
        }
        var sliceSum: Long = 0
        while (idx < a.length && sliceSum + a(idx) <= candidate) {
          sliceSum += a(idx)
          idx += 1
        }
        kRemaning -= 1
        if (kRemaning == 0) {
          if (idx == a.length) {
            return 0 // candidate fits
          } else {
            // some items are still remaining
            // no grops are remaing
            // we consumed items too slowly, candidate for group sum is too small
            return -1
          }
        } else {
          if (idx == a.length) {
            // no items are remaing
            // groups are still remaining
            // we consumed items too fast, candidate is too big, we'd need to include empty subarrays to solutions, which may not be optimal
            return 1
          } else {
            // some items are still remaining
            // but some groups are still remaining too
            // just continue
          }
        }
      }
      throw new IllegalStateException()
    }

    var min: Long = 0
    var max = a.length * m.toLong
    var result: Long = -1
    while (min <= max) {
      val mid = (max + min) / 2
      val x = verifySolution(mid)
      x match {
        case -1 =>
          min = mid + 1
        case 0 =>
          max = mid - 1
          result = mid
        case 1 =>
          max = mid - 1
          result = mid // maybe not optimal
      }
    }
    result.toInt
  }

  def prefixSums(a: Array[Int]): Array[Int] = {
    val result = Array.ofDim[Int](a.length + 1)
    result(0) = 0
    for (i <- a.indices) {
      result(i + 1) = a(i) + result(i)
    }
    result
  }

}
