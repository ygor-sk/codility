package sk.ygor.codility.lesson15

class CountDistinctSlices {

  def solution(m: Int, a: Array[Int]): Int = {
    val seen = scala.collection.mutable.HashSet[Int]()
    var result = 0

    for (i <- a.indices) {
      var j = i
      seen.clear()
      while (j < a.length && !seen.contains(a(j))) {
        seen.add(a(j))
        j += 1
        result += 1
      }
    }

    result
  }

  def solution2(m: Int, a: Array[Int]): Int = {
    val seenAt = scala.collection.mutable.TreeMap[Int, Int]()
    var result = 0.toLong

    def intervalSum(i: Int): Long = i.toLong * (i + 1) / 2

    var leftIndex = 0
    var rightIndex = 0
    var lastRightIndex = 0
    while (rightIndex < a.length) {
      while (rightIndex < a.length && !seenAt.contains(a(rightIndex))) {
        seenAt.put(a(rightIndex), rightIndex)
        rightIndex += 1
      }
      val x = intervalSum(rightIndex - leftIndex)
      val y = intervalSum(lastRightIndex - leftIndex)
      result += x
      result -= y

//      println(s"left=$leftIndex, right=$rightIndex, seenAt=$seenAt, x=$x, y=$y, result=$result")

      if (rightIndex < a.length) {
        lastRightIndex = rightIndex
        val moveLeftIndexTo = seenAt(a(rightIndex)) + 1
        while (leftIndex < moveLeftIndexTo) {
          seenAt.remove(a(leftIndex))
          leftIndex += 1
        }
//        println(s"lastRightIndex=$lastRightIndex, leftIndex=$leftIndex, seenAt=$seenAt")
      }
    }

    Math.min(result, 1000000000).toInt
  }
}
