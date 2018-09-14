package sk.ygor.codility.lesson09

class MaxDoubleSliceSum {

  def solution(a: Array[Int]): Int = {
    assert(a.length >= 3)
    var result = Long.MinValue
    for (y <- 1 to a.length - 2) {
      val left = a.slice(1, y - 1).reverse
      val right = a.slice(y, a.length - 1)
      val mleft = maxSlice(left)
      val mright = maxSlice(right)
      val doubleSliceSum = mleft + mright
      result = Math.max(result, doubleSliceSum)
    }
    result.toInt
  }

  def maxSlice(a: Array[Int]): Int = {
    if (a.isEmpty) {
      return 0
    }
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

}
