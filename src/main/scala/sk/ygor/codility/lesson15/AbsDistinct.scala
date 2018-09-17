package sk.ygor.codility.lesson15

class AbsDistinct {

  def solution(a: Array[Int]): Int = {
    var lastProcessed: Int = Math.max(Math.abs(a.head), Math.abs(a.last))
    var result = 1 // count
    var leftIdx = 0
    var rightIdx = a.length - 1
    while (leftIdx <= rightIdx) {
      val leftAbs = Math.abs(a(leftIdx))
      val rightAbs = Math.abs(a(rightIdx))
      if (leftAbs > rightAbs) {
        if (leftAbs < lastProcessed) {
          result += 1
          lastProcessed = leftAbs
        }
        leftIdx += 1
      } else {
        if (rightAbs < lastProcessed) {
          result += 1
          lastProcessed = rightAbs
        }
        rightIdx -= 1
      }
    }
    result
  }

}
