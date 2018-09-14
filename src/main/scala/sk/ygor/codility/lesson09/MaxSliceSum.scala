package sk.ygor.codility.lesson09

class MaxSliceSum {

  def solution(a: Array[Int]): Int = {
    assert(a.nonEmpty)
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
