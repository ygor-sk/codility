package sk.ygor.codility.lesson05

class MinAvgTwoSlice {

  // O(n^2)
  def solution(a: Array[Int]): Int = {
    assert(a.length >= 2)
    val prefixSums = Array.fill(a.length + 1)(0)
    for (i <- a.indices) {
      prefixSums(i + 1) = prefixSums(i) + a(i)
    }
    var minimumAverage = (a(0) + a(1)) / 2.0
    var result: Int = 0
    for (i <- 0 until a.length - 1) {
      for (j <- i + 1 until a.length) {
        val average = (prefixSums(j + 1) - prefixSums(i)) / (j - i + 1.0)
        if (average < minimumAverage) {
          minimumAverage = average
          result = i
        }
      }
    }
    result
  }

  // O(n)
  def solution2(a: Array[Int]): Int = {
    val arrayView = a.view.zipWithIndex
    def slides = arrayView.sliding(2) ++ arrayView.sliding(3)
    def averages = slides.map(slide => {
      val (_, index) = slide.head
      val average = slide.map { case (value, _) => value}.sum / slide.length.toDouble
      (index, average)
    })
    val minimum = averages.minBy { case (_, average) => average}
    val (result, _) = minimum
    result
  }

}
