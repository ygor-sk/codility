package sk.ygor.codility.lesson06

import sk.ygor.codility.lesson06.MaxProductOfThree.Index

class MaxProductOfThree {


  /* On(n^log(n)) */
  def solution(a: Array[Int]): Int = {
    assert(a.length >= 3)
    val sorted = a.sorted
    Math.max(sorted.takeRight(3).product, (sorted.take(2) :+ sorted.last).product)
  }

  /* On(n) */
  def solution2(array: Array[Int]): Int = {

    def findExtremeValue(ignoreIndexes: Seq[Index], cmp: (Int, Int) => Boolean): (Index, Int) = {
      var extremeValue: Int = 0
      var extremeIndex: Int = -1
      for (i <- array.indices) {
        if (!ignoreIndexes.contains(Index(i))) {
          if (extremeIndex == -1 || cmp(array(i), extremeValue)) {
            extremeValue = array(i)
            extremeIndex = i
          }
        }
      }
      (Index(extremeIndex), extremeValue)
    }

    def findMaximum(ignoreIndexes: Seq[Index]): (Index, Int) = findExtremeValue(ignoreIndexes, (a, b) => a > b)

    def findMinimum(ignoreIndexes: Seq[Index]): (Index, Int) = findExtremeValue(ignoreIndexes, (a, b) => a < b)

    assert(array.length >= 3)
    val (max3Idx, max3) = findMaximum(Seq())
    val (max2Idx, max2) = findMaximum(Seq(max3Idx))
    val (_, max1) = findMaximum(Seq(max3Idx, max2Idx))

    val (min1Idx, min1) = findMinimum(Seq())
    val (_, min2) = findMinimum(Seq(min1Idx))

    Math.max(max1 * max2 * max3, min1 * min2 * max3)
  }

}

object MaxProductOfThree {

  /* to avoid confusion with Int values */
  case class Index(value: Int) extends AnyVal

}

