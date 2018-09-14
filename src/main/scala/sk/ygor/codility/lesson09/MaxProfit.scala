package sk.ygor.codility.lesson09

class MaxProfit {

  def solution(a: Array[Int]): Int = {
    if (a.length <= 1) {
      0
    } else {
      val result = maxSliceSum(a.sliding(2).map { case Array(x1, x2) => x2 - x1 })
      if (result < 0) 0 else result
    }
  }

  private def maxSliceSum(a: Iterator[Int]): Int = {
    var maxSum: Long = 0
    var result: Long = Long.MinValue
    var zeroOrPositiveFound = false
    a.foreach(item => {
      if (!zeroOrPositiveFound) {
        if (item >= 0) {
          zeroOrPositiveFound = true
        }
        maxSum = 0
      }
      val floor = if (zeroOrPositiveFound) 0 else Long.MinValue
      maxSum = Math.max(floor, maxSum + item)
      result = Math.max(result, maxSum)
    })
    result.toInt
  }

  def solutionFaster(a: Array[Int]): Int = {
    if (a.length <= 1) {
      0
    } else {
      var maxSum: Long = 0
      var result: Long = Long.MinValue
      var zeroOrPositiveFound = false
      for (i <- 0 until a.length - 1) {
        val item = a(i + 1) - a(i)
        if (!zeroOrPositiveFound) {
          if (item >= 0) {
            zeroOrPositiveFound = true
          }
          maxSum = 0
        }
        val floor = if (zeroOrPositiveFound) 0 else Long.MinValue
        maxSum = Math.max(floor, maxSum + item)
        result = Math.max(result, maxSum)
      }
      if (result < 0) 0 else result.toInt
    }
  }


}
